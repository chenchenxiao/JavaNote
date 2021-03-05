package com.basic.java.高并发;

import java.util.concurrent.CountDownLatch;

/**
 * @author cxh
 * @date: 2020/11/16
 * @description:
 */
public class CDL测试 {


    static volatile int val = 0;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A任务执行");
                countDownLatch.countDown();
                val++;
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B任务执行");
                countDownLatch.countDown();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("C任务执行");
                countDownLatch.countDown();
            }
        }).start();
        Thread.sleep(3000);
        countDownLatch.await();
        System.out.println("执行完毕");
    }



}
