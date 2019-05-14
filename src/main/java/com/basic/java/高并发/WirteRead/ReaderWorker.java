package com.basic.java.高并发.WirteRead;

/**
 * @author Blse
 * @date 2019/4/3
 * @description
 */
public class ReaderWorker extends Thread {

    private final SharedData data;

    public ReaderWorker(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true) {
                char[] readBuf = data.read();
                System.out.println(Thread.currentThread().getName() + " reads " + String.valueOf(readBuf));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
