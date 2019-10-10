package com.basic.java.高并发.WirteRead;

/**
 * @author Blse
 * @date 2019/4/3
 * @description
 */
public class SharedData {

    private final char[] buffer;

    private final ReadWriteLock lock = new ReadWriteLock();

    public SharedData(int size) {
        this.buffer = new char[size];
        for (int i = 0; i < size; i++) {
            this.buffer[i] = '*';
        }
    }

    public char[] read() throws InterruptedException {
        try{
            lock.readLock();
            return this.doRead();
        } finally {
            lock.readUnloack();
        }
    }

    public void write(char c) throws InterruptedException {
        try {
            lock.wirteLock();
            this.doWrite(c);
        } finally {
            lock.writeUnlock();
        }
    }

    private void doWrite(char c) throws InterruptedException {
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = c;
            Thread.sleep(10);
        }
    }

    private char[] doRead() throws InterruptedException {
        char[] newBuf = new char[buffer.length];
        for(int i = 0; i < buffer.length; i++) {
            newBuf[i] = buffer[i];
        }
        Thread.sleep(10);
        return newBuf;
    }


}
