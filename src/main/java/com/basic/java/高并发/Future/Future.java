package com.basic.java.高并发.Future;

/**
 * @author Blse
 * @date 2019/4/3
 * @description
 */
public interface Future<T> {

    T get() throws InterruptedException;

}
