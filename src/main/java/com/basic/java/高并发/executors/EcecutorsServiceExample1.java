package com.basic.java.高并发.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author Blse
 * @date 2019/4/18
 * @description ExecutorService的API
 */
public class EcecutorsServiceExample1 {

    public static void main(String[] args) throws InterruptedException {
//        isShutDown();
//        isTerminated();
//        executeRunnableError();
        executeRunnableTask();
    }

    /**
     * 调用shutdown后不会block住
     * 调用shutdown后不能再执行任务，会被拒绝
     */
    private static void isShutDown() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute( () -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(executorService.isShutdown());
            executorService.shutdown();
            System.out.println(executorService.isShutdown());
        });
    }

    private static void isTerminated() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute( () -> {
           try {
               TimeUnit.SECONDS.sleep(2);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        });
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
    }

    private static void executeRunnableError() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10, new MyThreadFactory());
        executorService.execute( () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        IntStream.range(0, 10).boxed().forEach(i -> executorService.execute( () -> System.out.println(1 / 0)));
        executorService.shutdown();
        executorService.awaitTermination(10,TimeUnit.MINUTES);
        System.out.println("==========");
    }

    private static void executeRunnableTask() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10, new MyThreadFactory());
        IntStream.range(0, 10).boxed().forEach(i -> executorService.execute(
                new MyTask(i) {
                    @Override
                    protected void doExecute() {
                        if (i % 3 == 0) {
                            int temp = i / 0;
                        }
                    }

                    @Override
                    protected void doInit() {
                        //do nothing
                    }

                    @Override
                    protected void done() {
                        System.out.println("The no" + i + "successfully");
                    }

                    @Override
                    protected void error(Throwable cause) {
                        System.out.println("The no" + i + "failed");
                    }
                }
        ));
        executorService.shutdown();
        executorService.awaitTermination(10,TimeUnit.MINUTES);
        System.out.println("==========");
    }

    private abstract static class MyTask implements Runnable{
        protected final int no;

        private MyTask(int no) {
            this.no = no;
        }


        @Override
        public void run() {
            try {
                this.doInit();
                this.doExecute();
                this.done();
            } catch (Throwable cause) {
                this.error(cause);
            }
        }

        protected abstract void doExecute();

        protected abstract void doInit();

        protected abstract void done();

        protected abstract void error(Throwable cause);


    }

    private static class MyThreadFactory implements ThreadFactory {
        private final static AtomicInteger SEQ = new AtomicInteger();

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setName("My-Thread-" + SEQ.getAndIncrement());
            thread.setUncaughtExceptionHandler((t, cause) -> {
                System.out.println("The Thread" + t.getName() + "execute faild");
                cause.printStackTrace();
                System.out.println("-=============================");
            });
            return thread;
        }
    }
}
