package com.basic.java.高并发.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author Blse
 * @date 2019/4/17
 * @description 3种创建线程池的方式
 */
public class ExecutorsExample {

    public static void main(String[] args) throws InterruptedException {
//        useCacheThreadPool();
//        useFixedSizePool();
//        useSignlePool();
        useSignleThreadSchedule();
    }

    /**
     * 用于生命周期较短的任务
     * 可创建Intger的最大值数量的线程，线程空闲60s后会被回收
     * @throws InterruptedException
     *
     *  return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
     *                                       60L, TimeUnit.SECONDS,
     *                                       new SynchronousQueue<Runnable>());
     *  SynchronousQueue是只能放一个线程的BlockQueue，不会存线程
     *  当发现线程数大于0时，会全部都回收
     */
    private static void useCacheThreadPool() throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        IntStream.range(0, 100).boxed().forEach(i -> executorService
        .execute(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " [" + i + "]" );
        }));
        TimeUnit.SECONDS.sleep(1);
        System.out.println(((ThreadPoolExecutor)executorService).getActiveCount());
    }

    /**
     *
     * nThreads, nThreads,
     *    0L, TimeUnit.MILLISECONDS,
     *    new LinkedBlockingQueueExample<Runnable>());
     *    开辟指定数目的线程，如果要执行的线程数大于开辟的数目，则会将线程放入LinkedBlockQueue，当大于Integer的最大值时会执行拒绝策略
     *    分批执行线程，而且不会销毁线程，因为执行的数目不可能大于开辟的数目
     *    使用无界队列存放任务
     */
    private static void useFixedSizePool() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        IntStream.range(0, 100).boxed().forEach(i -> executorService
                .execute(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " [" + i + "]" );
                }));
        TimeUnit.SECONDS.sleep(1);
        System.out.println(((ThreadPoolExecutor)executorService).getActiveCount());

    }


    /**
     * 跟使用一个线程的区别
     * 单个线程在执行完任务之后会死亡，而SingleThreadExecutor可以复用线程
     * 单个线程不能把Runnable添加到cache queue，而SingleThreadExecutor可以
     *   return new FinalizableDelegatedExecutorService
     *             (new ThreadPoolExecutor(1, 1,
     *              0L, TimeUnit.MILLISECONDS,
     *              new LinkedBlockingQueueExample<Runnable>()));
     *  该初始化相当于newFixedThreadPool（1）,只会暴露ExecutorsSerivce的方法，而不会暴露ThreadExecutorPool的方法
     */
    private static void useSignlePool() throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        IntStream.range(0, 100).boxed().forEach(i -> executorService
                .execute(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " [" + i + "]" );
                }));
        TimeUnit.SECONDS.sleep(1);
//        System.out.println(((ThreadPoolExecutor)executorService).getActiveCount());
    }



    /**
     * 将定时任务与线程池功能结合使用
     * scheduleAtFixedRate()传入一个Runnbale接口的实现，定时执行
     * schedule() 延迟指定时间执行任务
     * scheduleWithFixedDelay()周期性执行任务
     */
    private static void useSignleThreadSchedule() {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        //定时执行任务
//        executorService.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("RUN " + System.currentTimeMillis());
//            }
//        }, 0,100, TimeUnit.MILLISECONDS);
        //========================
//        try {
//            List<Callable> callableList = new ArrayList<>();
//            callableList.add(new Callable() {
//                @Override
//                public String call() throws Exception {
//                    System.out.println("Begin " + System.currentTimeMillis());
//                    TimeUnit.SECONDS.sleep(3);
//                    System.out.println("END " + System.currentTimeMillis());
//                    return "CallA";
//                }
//            });
//            ScheduledFuture futureA = executorService.schedule(callableList.get(0), 4L, TimeUnit.SECONDS);
//            System.out.println("            X = " + System.currentTimeMillis());
//            System.out.println("返回值A：" + futureA.get());
//            System.out.println("            Y = " + System.currentTimeMillis());
//            executorService.shutdown();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //====================
        System.out.println("   X = " + System.currentTimeMillis());
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("     begin = " + System.currentTimeMillis() + ", name: " + Thread.currentThread().getName());
                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("     end = " + System.currentTimeMillis() + ", name: " + Thread.currentThread().getName());
            }
        }, 0, 2, TimeUnit.SECONDS);
        System.out.println("   Y = " + System.currentTimeMillis());

    }




}
