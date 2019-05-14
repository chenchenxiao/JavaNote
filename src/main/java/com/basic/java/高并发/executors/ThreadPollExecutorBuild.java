package com.basic.java.多线程.高并发.executors;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Blse
 * @date 2019/4/17
 * @description
 */
public class ThreadPollExecutorBuild {

    /**
     * <p>
     *     1.coreSize = 1, MaxSize = 2 blockingQueue is empty. 提交3个任务时会发生什么
     *     2、coreSize = 1, MaxSize = 2 blockingQueue size = 5， 提交7个任务会发生什么？
     *     2、coreSize = 1, MaxSize = 2 blockingQueue size = 5， 提交7个任务会发生什么？
     * </p>
     * int corePoolSize,
     * int maximumPoolSize,
     * long keepAliveTime,
     * TimeUnit unit,
     * BlockingQueue<Runnable> workQueue,
     * RejectedExecutionHandler handler
     */


    public static void main(String[] args) {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) buildThreadPoolExecutor();
        int activeCount = -1;
        int queueSize = -1;
        while (true) {
            if (activeCount != executorService.getActiveCount() || queueSize != executorService.getQueue().size()) {
                System.out.println(executorService.getActiveCount());
                System.out.println(executorService.getPoolSize());
                System.out.println(executorService.getQueue().size());
                System.out.println(executorService.getMaximumPoolSize());
                activeCount = executorService.getActiveCount();
                queueSize = executorService.getQueue().size();
                System.out.println("=======================");
            }
        }

    }

    public static ExecutorService buildThreadPoolExecutor() {
        ExecutorService executorService = new ThreadPoolExecutor(1, 2, 30, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1), r -> {
            Thread t = new Thread(r);
            return t;
        }, new ThreadPoolExecutor.AbortPolicy());
        System.out.println("ThreadPoolExecutor CREAT DONE");
        executorService.execute(() -> sleepSeconds(100));
        executorService.execute(() -> sleepSeconds(100));
        return executorService;
    }

    private static void sleepSeconds(long seconds) {
        try {
            System.out.println(Thread.currentThread().getName() + "==");
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
