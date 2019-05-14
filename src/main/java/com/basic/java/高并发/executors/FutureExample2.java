package com.basic.java.高并发.executors;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Blse
 * @date 2019/4/18
 * @description
 */
public class FutureExample2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        testCancel();
        testCancel2();
    }

    /**
     * 正常结束或出现异常结束会返回true
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private static void testDone() throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        Future<Integer> future = executorService.submit( () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10;
        });
        Integer result = future.get();
        System.out.println(future.isDone());
    }

    /**
     * 返回false的情况
     * 1、任务已经完成 2、任务已经被cancelled
     * 被cancel的任务是无法返回结果的
     *
     */
    private static void testCancel() throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        AtomicBoolean running = new AtomicBoolean();
        Future<Integer> future = executorService.submit( () -> {
//            try {
//                TimeUnit.SECONDS.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            while (running.get()){}
            return 10;
        }
        );
//        System.out.println(future.get());
        System.out.println(future.cancel(true));;
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());


    }

    private static void testCancel2() throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        AtomicBoolean running = new AtomicBoolean();
        Future<Integer> future = executorService.submit( () -> {
//            try {
//                TimeUnit.SECONDS.sleep(10);
//                System.out.println("=================");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//                    while (running.get()){}
            while (!Thread.interrupted()) {

            }
            System.out.println("=====");
            return 10;
            }
        );

//        System.out.println(future.get());
        TimeUnit.SECONDS.sleep(2);
        System.out.println(future.cancel(true));;
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());


    }

}
