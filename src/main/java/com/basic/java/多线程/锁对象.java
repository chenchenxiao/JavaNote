package com.basic.java.多线程;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Blse
 * @date 2018/2/2
 * @description
 */
public class 锁对象 {
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        test();
        System.out.println("before");
        System.out.println("after");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inrun");
                test();
            }
        }).start();


    }

    public static void test(){
        lock.lock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        });
        System.out.println("haha");
    }
}
