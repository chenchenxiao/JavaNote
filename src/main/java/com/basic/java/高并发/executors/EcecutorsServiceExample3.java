package com.basic.java.多线程.高并发.executors;

import org.quartz.spi.ThreadExecutor;

import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * @author Blse
 * @date 2019/4/18
 * @description PestartCoreThread      API
 */
public class EcecutorsServiceExample3 {

    public static void main(String[] args) {
//        testAllowCoreThreadTimeOut();
//        testRemove();
        testPestartCoreThread();
//        testPestartAllThread();
    }

    /**
     * 查看是否有空闲线程，有的话启动，不会全部启动，一次启动一个
     */
    private static void testPestartCoreThread() {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        System.out.println(executorService.getActiveCount());
        executorService.prestartCoreThread();

        System.out.println(executorService.getActiveCount());
        executorService.prestartCoreThread();

        System.out.println(executorService.getActiveCount());
        executorService.prestartCoreThread();
    }

    /**
     * 启动core线程数
     */
    private static void testPestartAllThread() {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        executorService.setMaximumPoolSize(3);
        int i = executorService.prestartAllCoreThreads();
        System.out.println(i);
        System.out.println(executorService.getActiveCount());

//        System.out.println(executorService.getActiveCount());
//        System.out.println(executorService.prestartCoreThread());
//
//        System.out.println(executorService.getActiveCount());
//        System.out.println(executorService.prestartCoreThread());
//
//        System.out.println(executorService.getActiveCount());
//        System.out.println(executorService.prestartCoreThread());
    }


    private static void testRemove() {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        executorService.setKeepAliveTime(10, TimeUnit.SECONDS);
        executorService.allowCoreThreadTimeOut(true);
        IntStream.range(0, 2).boxed().forEach( i -> {
            executorService.execute( () -> {
                try {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("finished");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        });
        try {
            TimeUnit.MICROSECONDS.sleep(20);
            Runnable r = () -> {
                System.out.println("Never execute");
            };
            executorService.execute(r);
            TimeUnit.MICROSECONDS.sleep(20);
            executorService.remove(r);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 正常情况下线程池是不会回收的，设置了setKeepAliveTime和allowCoreThreadTimeOut，在达到时间后就会回收
     */
    private static void testAllowCoreThreadTimeOut() {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        executorService.setKeepAliveTime(10, TimeUnit.SECONDS);
        executorService.allowCoreThreadTimeOut(true);
        IntStream.range(0, 5).boxed().forEach( i -> {
            executorService.execute( () -> {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        });
    }






}
