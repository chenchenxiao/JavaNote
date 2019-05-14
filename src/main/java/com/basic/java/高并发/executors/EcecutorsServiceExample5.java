package com.basic.java.高并发.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Blse
 * @date 2019/4/18
 * @description     直接拿到ThreadPoolExecutor的等待队列后，需要先开辟一个线程才能直接插入任务执行
 *                   线程池需要一个信号去触发线程的创建，例如execute和submit。
 *                   直接添加无法判断是否需要开辟线程
 *
 */
public class EcecutorsServiceExample5 {

    public static void main(String[] args) {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        executorService.execute( () -> System.out.println("222222"));
        executorService.getQueue().add( () -> System.out.println("11111"));

    }

}
