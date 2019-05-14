package com.basic.java.多线程.高并发.executors;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @author Blse
 * @date 2019/4/17
 * @description     newWorkStealingPool,根据CPU核数去处理线程
 *                   当处理完任务后会自动结束
 */
public class ExecutorsExample2 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newWorkStealingPool();
        List<Callable<String>> callableList = IntStream.range(0, 20).boxed().map(i ->
                (Callable<String>) () -> {
                    System.out.println(Thread.currentThread().getName());
                    sleep(2);
                    return "Task - " + i;
                }
        ).collect(toList());
        executorService.invokeAll(callableList).stream().map(future -> {
            try {
                return future.get();
            }catch (Exception e) {
                throw new RuntimeException();
            }
        }).forEach(System.out :: println);

    }

    private static void sleep(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
