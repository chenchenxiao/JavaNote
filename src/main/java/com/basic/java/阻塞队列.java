package com.basic.java;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cxh
 * @date: 2021/2/25
 * @description:
 */
public class 阻塞队列 {

    public static void main(String[] args) throws InterruptedException {

        ReentrantLock lock = new ReentrantLock();
        lock.newCondition().await();
//        MyBlockQueue queue = new MyBlockQueue();
//
//        Thread threadA = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    try {
//                        System.out.println(Thread.currentThread().getName() + "加数据: " + i);
//                        queue.put("数据: " + i);
////                        Thread.sleep(3000);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }, "ThreadA");
//        Thread threadB = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i< 20; i++) {
//                    try {
//                        Thread.sleep(1000);
//                        System.out.println(Thread.currentThread().getName() + "取数据:" + queue.take());
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }, "ThreadB");
//
//        threadA.start();
//        threadB.start();

    }


}

class MyBlockQueue{

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private String[] queue = new String[16];

    private int count = 0;

    private int putIndex = 0;

    private int takeIndex = 0;

    public void put(String val) throws Exception {
        lock.lock();
        if ("".equals(val) || val == null) {
            throw new Exception("值不能为空");
        }
        int index = putIndex;
        count++;
        if (++putIndex == queue.length) {
            putIndex = 0;
        }
        if (count == queue.length) {
            condition.await();
        }
        queue[index] = val;
        condition.signal();
        lock.unlock();
    }

    public String take() throws InterruptedException {
        lock.lock();
        if (count == 0) {
            condition.await();
        }
        String result = queue[takeIndex];
        count --;
        if (++takeIndex == queue.length) {
            takeIndex = 0;
        }
        condition.signal();
        lock.unlock();
        return result;
    }

}
