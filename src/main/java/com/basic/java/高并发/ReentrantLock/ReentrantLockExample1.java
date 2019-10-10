package com.basic.java.高并发.ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Blse
 * @date 2019/4/14
 * @description     显示锁  相比synchronize功能更多，通过声明式的方式获取释放锁，可用规定时间抢锁，查看释放有线程再队列中，可用进行扩展等等
 */
public class ReentrantLockExample1 {

    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> testInterruptibly()) {};
        t1.start();
        TimeUnit.SECONDS.sleep(1);
        Thread t2 = new Thread(() -> testInterruptibly()){};
        t2.start();
        Thread.sleep(1000);
        System.out.println("==========");
        t2.interrupt();
    }


    public static void testInterruptibly() {
        try {
            lock.lockInterruptibly();
            System.out.println(Thread.currentThread().getName() + " GET LOCK");
            while (true) {

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
