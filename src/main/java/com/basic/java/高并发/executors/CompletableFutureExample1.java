package com.basic.java.高并发.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Blse
 * @date 2019/4/20
 * @description     supplyAsync()方法不用等到所有任务执行结束才执行最终任务，执行完一个任务后就会执行
 *                   any()拿到其中一个结果，但是里面的任务都会执行
 *                   allof会执行全部任务，但是不会返回结果
 */
public class CompletableFutureExample1 {

    public static void main(String[] args) throws InterruptedException {
        //=========   所执行的线程都会设为守护线程
//        CompletableFuture.runAsync( () -> {
//            try {
//                TimeUnit.SECONDS.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).whenComplete((v, t) -> System.out.println("DONE"));
//        System.out.println("-=======");
        //=========
        supplyAsync();
        Thread.currentThread().join();

    }

    /**
     * 级联，完成任务后自动执行Runnable
     */
    private static void supplyAsync() {
        CompletableFuture.supplyAsync(Object::new)
                .thenAccept(obj -> {
                    try {
                        System.out.println("=======Start");
                        TimeUnit.SECONDS.sleep(5);
                        System.out.println("=======End");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).runAfterBoth(CompletableFuture.supplyAsync( () -> "Hello")
                    .thenAccept(s -> {
                        try {
                            System.out.println("after===start");
                            TimeUnit.SECONDS.sleep(3);
                            System.out.println("after===end");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }), () -> System.out.println("finished"));
    }
}


