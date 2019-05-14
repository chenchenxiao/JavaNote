package com.basic.java.高并发.ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author Blse
 * @date 2019/4/15
 * @description 没有返回值的
 */
public class ForkJoinRecursiveAction {

    private final static int MAX_THRESHOLD = 3;

    private final static AtomicInteger SUM = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        final ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(new CalculateResoursiveAction(0, 10));
        forkJoinPool.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(SUM);
    }

    private static class CalculateResoursiveAction extends RecursiveAction{

        private final int start;

        private final int end;

        private CalculateResoursiveAction(int start, int end) {
            this.start = start;
            this.end = end;
        }




        @Override
        protected void compute() {
            if ((end -start) <= MAX_THRESHOLD) {
                System.out.println("start:" + start + ", end: " + end + " " + IntStream.rangeClosed(start, end).sum());
                SUM.addAndGet(IntStream.rangeClosed(start, end).sum());
            } else {
                int middle = (start + end) / 2;
                CalculateResoursiveAction leftAction = new CalculateResoursiveAction(start, middle);
                CalculateResoursiveAction rightAction = new CalculateResoursiveAction(middle + 1, end);
                leftAction.fork();
                rightAction.fork();
            }
        }
    }

}
