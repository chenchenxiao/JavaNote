package com.basic.java.高并发.executors;

import java.util.concurrent.*;

/**
 * @author Blse
 * @date 2019/4/18
 * @description     拒绝策略
 */
public class EcecutorsServiceExample2 {

    public static void main(String[] args) throws InterruptedException {
//        testAbortPolicy();
//        testDiscardPolicy();
//        testCallerPolicy();
        testDiscardOldestPolicy();
    }

    /**
     * 会把在等待队列里的最新的线程丢掉
     * @throws InterruptedException
     */
    private static void testDiscardOldestPolicy() throws InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(1, 2, 30, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1), r -> {
            Thread t = new Thread(r);
            return t;
        },new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 0; i < 3; i++) {
            executorService.execute( () -> {
                try {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("FROM lambda");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        TimeUnit.SECONDS.sleep(1);
        executorService.execute( () -> {
            System.out.println("xxxxxxx");
            System.out.println(Thread.currentThread().getName());
        });
        System.out.println("=====");

    }

    /**
     * 只用调用者所在线程来运行任务
     * @throws InterruptedException
     */
    private static void testCallerPolicy() throws InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(1, 2, 30, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1), r -> {
            Thread t = new Thread(r);
            return t;
        },new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 3; i++) {
            executorService.execute( () -> {
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        TimeUnit.SECONDS.sleep(1);
        executorService.execute( () -> {
            System.out.println("xxxxxxx");
            System.out.println(Thread.currentThread().getName());
        });
        System.out.println("=====");

    }

    /**
     * 会忽略，即使丢了东西也不知道发什么了什么，需要谨慎使用
     * @throws InterruptedException
     */
    private static void testDiscardPolicy() throws InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(1, 2, 30, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1), r -> {
            Thread t = new Thread(r);
            return t;
        },new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 0; i < 3; i++) {
            executorService.execute( () -> {
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        TimeUnit.SECONDS.sleep(1);
        executorService.execute( () -> System.out.println("xxxxxxx"));
        System.out.println("========");
    }

    /**
     * 线程池不会死，只是告诉调用者在哪里调用失败了，会继续把任务执行完
     * @throws InterruptedException
     */
    private static void testAbortPolicy() throws InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(1, 2, 30, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1), r -> {
                Thread t = new Thread(r);
                return t;
        },new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 3; i++) {
            executorService.execute( () -> {
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            TimeUnit.SECONDS.sleep(1);
            executorService.execute( () -> System.out.println("xxxxxxx"));
        }
    }

}
