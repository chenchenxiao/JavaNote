package com.basic.java.多线程.高并发.Observer;

import java.util.Arrays;

/**
 * @author Blse
 * @date 2019/4/3
 * @description
 */
public class ThreadLifeCycleClient {
    public static void main(String[] args) {
        new ThreadLifeCycleObserver().concurrentQuery(Arrays.asList("1", "2"));
    }

}
