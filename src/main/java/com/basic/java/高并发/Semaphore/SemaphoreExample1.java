package com.basic.java.多线程.高并发.Semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author Blse
 * @date 2019/4/14
 * @description        类似于有一个许可证，只有拿到许可证才可以通行，没拿到就会BLOCK住
 *                       acquire(int permits)，有几个许可证
 *                       availablePermits()还有几个可用的许可证
 *                       getQueueLength()有多少个线程因为没有拿到许可证而被BLOCK住
 *                       acquireUninterruptibly()拿许可证的时候忽略中断
 *                       draimPermits()获取所有许可证
 */
public class SemaphoreExample1 {


    public static void main(String[] args) {
        final SemaphoreLock lock = new SemaphoreLock();

        for (int i = 0; i < 2; i++) {

            new Thread() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName() + "RUNNING");
                        lock.lock();
                        System.out.println(Thread.currentThread().getName() + "GET lock");
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                    System.out.println(Thread.currentThread().getName() + " RELEASE");
                }
            }.start();
        }
    }

    static class SemaphoreLock{
        private final Semaphore semaphore = new Semaphore(1);

        public void lock() throws InterruptedException {
            semaphore.acquire();
        }

        public void unlock() {
            semaphore.release();
        }
    }

}
