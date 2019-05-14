package com.basic.java.多线程.高并发.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Blse
 * @date 2019/4/13
 * @description
 */
public class CountDownLatchExample2 {

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);

        new Thread() {
            public void run() {
                System.out.println("START------WORKING");
                try {
                    Thread.sleep(1000);
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DO OTHER WORK");
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("RELEASE=====");
            }
        }.start();

        new Thread() {
            public void run() {
                System.out.println("PREPARE FOR DATA");
                try {
                    Thread.sleep(2000);
                    System.out.println("PREPARE DONE");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            }
        }.start();
        Thread.currentThread().join();
    }

}
