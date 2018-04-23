package com.basic.java.多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author Blse
 * @date 2018/2/4
 * @description
 */
public class Callable和Future {
    public static void main(String[] args) throws Exception {
        Callable<Integer> callable = new CA();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}

class CA implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("call");
        return null;
    }
}
