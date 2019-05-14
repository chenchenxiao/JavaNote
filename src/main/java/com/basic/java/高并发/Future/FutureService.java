package com.basic.java.高并发.Future;

import java.util.function.Consumer;

/**
 * @author Blse
 * @date 2019/4/3
 * @description
 */
public class FutureService {
    public <T> Future<T> submit(final FutureTask<T> task) {
        AsynFuture<T> asynFuture = new AsynFuture<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                T result = task.call();
                asynFuture.done(result);
            }
        }).start();
        return asynFuture;
    }

    public <T> Future<T> submit(final FutureTask<T> task, final Consumer<T> consumer) {
        AsynFuture<T> asynFuture = new AsynFuture<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                T result = task.call();
                asynFuture.done(result);
                consumer.accept(result);
            }
        }).start();
        return asynFuture;
    }



}
