package com.basic.java.多线程.高并发.executors;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author Blse
 * @date 2019/4/17
 * @description
 */
public class ThreadPollExecutorTask {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(10, 20, 30, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1), r -> {
            Thread t = new Thread(r);
            return t;
        }, new ThreadPoolExecutor.AbortPolicy());
        IntStream.rangeClosed(0, 20).boxed().forEach(i -> {
            executorService.execute(() -> {
                try {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.println(Thread.currentThread().getName() + " " + i + " DONE"  );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        });
        //让正在工作的继续工作，让空闲的线程结束
        executorService.shutdown();
        //最多等一个小时，等工作线程结束
        executorService.awaitTermination(1, TimeUnit.HOURS);
        System.out.println(" ============");
    }

}
