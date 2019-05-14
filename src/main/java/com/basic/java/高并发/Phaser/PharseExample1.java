package com.basic.java.多线程.高并发.Phaser;

import java.util.Random;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author Blse
 * @date 2019/4/16
 * @description     类似于CDL和CB
 *
 *                  可用动态增加，不用指定数量
 */
public class PharseExample1 {

    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        final Phaser phaser = new Phaser();

        IntStream.rangeClosed(1, 5).boxed().map(i -> phaser).forEach(Task :: new );

        phaser.register();

        phaser.arriveAndAwaitAdvance();
        System.out.println("FINISHED");

    }

    static class Task extends Thread{
        private final Phaser phaser;

        Task(Phaser phaser) {
            this.phaser = phaser;
            this.phaser.register();
            start();
        }

        @Override
        public void run() {
            System.out.println(getName() + "WORKING");
            try {
                TimeUnit.SECONDS.sleep(random.nextInt(5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            phaser.arriveAndAwaitAdvance();
        }

    }

}
