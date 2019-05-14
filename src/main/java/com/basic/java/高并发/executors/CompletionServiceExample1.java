package com.basic.java.高并发.executors;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Blse
 * @date 2019/4/19
 * @description
 */
public class CompletionServiceExample1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

    }


    /**
     * 要获取future的结果是会block住
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private static void futureDefect1() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> future = service.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 100;
        });
        System.out.println("========");
        future.get();
    }

    /**
     * 要拿多个结果时，会卡住，例如第一个任务完成只需1秒，而第二个需要1小时，那么就要多等一小时才能拿到第一个任务的结果
     * @throws InterruptedException
     * @throws ExecutionException
     */
    private static void futureDefect2() throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        List<Callable<Integer>>  callableList = Arrays.asList(
                () -> {
                    sleep(10);
                    System.out.println("10");
                    return 1;
                },
                () -> {
                    sleep(20);
                    System.out.println("20");
                    return 1;
                }
        );
        List<Future<Integer>> futures = service.invokeAll(callableList);
        Integer integer = futures.get(1).get();
        Integer integer2 = futures.get(1).get();
    }

    private static void sleep(long seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

}
