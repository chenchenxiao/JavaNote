package com.basic.java.多线程.高并发.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Blse
 * @date 2019/4/13
 * @description
 */
public class CountDownLatchExample3 {

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
//        latch.await();
        Thread mainThread = Thread.currentThread();
        System.out.println("=======");

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                latch.countDown();
                mainThread.interrupt();
            }

        }.start();
        latch.await();
        System.out.println("=========");
    }

}
