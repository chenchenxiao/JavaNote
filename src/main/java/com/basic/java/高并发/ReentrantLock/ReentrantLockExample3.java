package com.basic.java.多线程.高并发.ReentrantLock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Blse
 * @date 2019/4/14
 * @description
 */
public class ReentrantLockExample3 {

    private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private final static Lock readLock = readWriteLock.readLock();

    private final static Lock writeLock = readWriteLock.writeLock();

    private static final List<Long> data = new ArrayList<>();


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> write());
        t1.start();
        TimeUnit.SECONDS.sleep(1);
        Thread t2 = new Thread(() -> write());
        t2.start();
    }

    public static  void write() {
        try {
            writeLock.lock();
            System.out.println("WRITEING------");
            data.add(System.currentTimeMillis());
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }

    public static void read() {
        try {
            readLock.lock();
            data.forEach(System.out::println);
            TimeUnit.SECONDS.sleep(5);
            System.out.println(Thread.currentThread().getName() +" ==============");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
    }
}
