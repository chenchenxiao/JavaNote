package com.basic.java.多线程.高并发.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author Blse
 * @date 2019/4/20
 * @description runAfterBothAsync  不在乎执行结果，在执行完结果后执行回调的Runnable
 *               runAfterEither   不在乎执行结果，只要执行完一个任务就会执行回调的Runnable
 *               combine 加工了结果后还可以进行处理 ，因为返回的还是一个CompletableFuture，而thenAcceptBoth返回的是空，所以无法进行处理
 *               compose 是拿上一个任务执行的结果作为下一个执行的任务的输入
 *               getNow  如果任务执行完成就返回任务结果，否则返回给的值
 *               complete 如果调用的时候任务完成了会返回正常结果，否则如果是发生在任务执行前会返回给定的值，并且会cancel当前的任务，如果是发生在任务执行后也是返回给定的值，不关心结果
 *               join 与get类似，但是不会抛出异常
 *               completeExceptionally  如果调用时任务还没执行结束，就会抛出给定的异常
 *               obtrudeException  不管任务结束没结束都会抛出异常
 */
public class CompletableFutureExample2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        thenAcceptBoth();
//        acceptEither();
        getNow();
        Thread.currentThread().join();
    }

    /**
     * 返回类型要一样
     */
    private static void acceptEither() {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("start========");
            sleep(5);
            System.out.println("end======");
            return "thenAcceptBoth";
        }).acceptEither(CompletableFuture.supplyAsync( () -> {
            System.out.println("two start========");
            sleep(3);
            System.out.println("two end======");
            return "22";
        }), System.out :: println);
    }


    /**
     * 并行执行
     */
    private static void thenAcceptBoth() {
        CompletableFuture.supplyAsync( () -> {
            System.out.println("start========");
            sleep(5);
            System.out.println("end======");
            return "thenAcceptBoth";
        }).thenAcceptBoth(CompletableFuture.supplyAsync( () -> {
            System.out.println("two start========");
            sleep(5);
            System.out.println("end======");
            return 100;
        }), (s, i) -> System.out.println(s + "----" + i));
    }

    /**
     *
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private static void getNow() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync( () -> {
            System.out.println("start========");
            sleep(5);
            return "hello";
        });
        String result = future.getNow("world");
        System.out.println(result);
        System.out.println(future.get());
    }

    private static void sleep(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
