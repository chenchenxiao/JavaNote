package com.basic.java.高并发;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Blse
 * @date 2019/5/18
 * @description
 */
public class LockNumTest {

    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        new Thread( () -> {
            lock.lock();
            lock.lock();
            System.out.println("-----------");
            lock.unlock();
            lock.unlock();
        }).start();
        new Thread( () -> {
            System.out.println("=======");
            lock.lock();
            System.out.println("000000");
        }).start();
    }


}
