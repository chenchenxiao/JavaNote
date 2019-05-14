package com.basic.java.高并发.executors;


import java.util.concurrent.*;

/**
 * @author Blse
 * @date 2019/4/18
 * @description
 */
public class FutureExample1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
      testGet();
    }

    /**
     * 打断的是main线程
     * 可以给定一个参数表示超时时间，如果超过就排除TimeOutExecption，但是会继续执行任务
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private static void testGet() throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        Future<Integer> future = executorService.submit( () -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10;
        });
        System.out.println("=======");
        Thread callerThread = Thread.currentThread();
        new Thread( () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            callerThread.interrupt();
        }).start();
        Integer result = future.get();
        System.out.println("===============");
    }



}
