package com.basic.java.多线程.高并发.collections;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Blse
 * @date 2019/4/22
 * @description 初始化给定大小后不能改变
 *              add  没有超过容量时会立即插入，超过后再插入会报错
 *              offer 类似add，只是判断方式不一样,不会抛出异常
 *              put  队列满了后会block,当有位置时才会继续执行
 *              poll 弹值，如果没有就返回null
 *              peek 只会拿第一个值，不会删除数据
 *              element 拿第一个值，拿不到就会抛异常
 *              remove  从头删数据，没有的话会抛异常
 *              drainTo  排干数据，参数是一个集合，把数据排到给定的集合
 *
 */
public class ArrayBlockingQueueExample1 {




    public static void main(String[] args) throws InterruptedException {
        testAdd();
    }

    public static void testAdd() throws InterruptedException {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
        queue.put(1);
        queue.put(1);
        queue.put(1);
        queue.put(1);
        queue.put(1);
        queue.put(1);
    }


}
