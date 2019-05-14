package com.basic.java.高并发.CountDownLatch;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author Blse
 * @date 2019/4/13
 * @description     CountDownLatch 相当于一个计数器，每当有一个线程完成工作后，计数器会减1，当减为0时才会向下继续执行，
 *                   也就是比如说包车的时候，司机需要等所有人都齐了才能开车，等待的人是司机
 */
public class CountDownLatchExample1 {

    private static Random random = new Random(System.currentTimeMillis());

    private static ExecutorService executor = Executors.newFixedThreadPool(2);

    private static final CountDownLatch latch = new CountDownLatch(10);



    public static void main(String[] args) throws InterruptedException {
        int[] data = query();
        System.out.println(data.length);
        for (int i = 0; i < data.length; i++) {
            executor.execute(new SimpleRunnable(data, i));
        }
        latch.await();
        System.out.println("FINISH ALL WORK");
        executor.shutdown();
    }

    private static int[] query() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    static class SimpleRunnable implements Runnable{

        private final int[] data;

        private int index;

        public SimpleRunnable(int[] data, int index) {
            this.data = data;
            this.index = index;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int value = data[index];
            if (value % 2 == 0) {
                data[index] = value * 2;
            } else {
                data[index] = value * 10;
            }
            System.out.println(Thread.currentThread().getName() + "finished");
            latch.countDown();
        }
    }

}
