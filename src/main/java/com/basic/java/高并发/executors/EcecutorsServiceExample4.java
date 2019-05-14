package com.basic.java.高并发.executors;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @author Blse
 * @date 2019/4/18
 * @description Callable和Future的API
 */
public class EcecutorsServiceExample4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        testInvokeAny();
//        testInvokeAll();
//        testSubmitRunnable();
        testSubmitRunnableWithResult();
    }

    /**
     * invokeAny()是会阻塞的，会随机返回一个值，是不确定的
     * 结果返回时，其他的Callable将会被取消
     * invokeAny()可以带有一个长整型的参数和TimeUtil，表示等待的超时时间，如果超过就不等结果返回，把其他东西都cancel掉
     * invokeAll类似，返回的是一个List，会执行全部的Callable
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private static void testInvokeAny() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Callable<Integer>> callList = IntStream.range(0, 5).boxed().map(
                i -> (Callable<Integer>) () -> {
                    TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(20));
                    return i;
                }
        ).collect(toList());
        Integer value = executorService.invokeAny(callList);
        System.out.println("========");
        System.out.println(value);
    }

    private static void testInvokeAll() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Callable<Integer>> callList = IntStream.range(0, 5).boxed().map(
                i -> (Callable<Integer>) () -> {
                    TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(20));
                    return i;
                }
        ).collect(toList());
        executorService.invokeAll(callList).stream().map(future -> {
            try {
                return future.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).forEach(System.out :: println);
        System.out.println("===========");
    }

    private static void testSubmitRunnable() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<?> future = executorService.submit( () -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Object o = future.get();
        System.out.println(o);
    }

    private static void testSubmitRunnableWithResult() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        String result = "DONE";
        Future<?> future = executorService.submit( () -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, result);
        System.out.println(future.get());


    }

}
