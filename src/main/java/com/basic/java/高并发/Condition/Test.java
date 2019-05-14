package com.basic.java.多线程.高并发.Condition;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Blse
 * @date 2019/4/18
 * @description
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        System.out.println("--");

        new Thread() {
           @Override
           public void run() {
               try {
                   lock.lock();
                   condition.await(10, TimeUnit.SECONDS);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               } finally {
                   lock.unlock();
               }
           }
       }.start();
        System.out.println("======");
        new Thread() {
            @Override
            public void run() {
                lock.lock();
//                condition.signalAll();
                lock.unlock();
            }
        }.start();
    }



}
