package com.basic.java.多线程.高并发.executors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Blse
 * @date 2019/4/19
 * @description
 */
public class CompletionServiceExample2 {

    /**
     * take方法会阻塞住,会先拿出已经完成的任务的结果
     * @param args
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> callableList = Arrays.asList(
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
        ExecutorCompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(service);
        ArrayList<Future<Integer>> futures = new ArrayList<>();
        callableList.stream().forEach(callable -> futures.add(completionService.submit(callable)));
        Future<Integer> future ;
        while ((future = completionService.take()) != null) {
            System.out.println(future.get());
        }
    }

    private static void sleep(long seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

}
