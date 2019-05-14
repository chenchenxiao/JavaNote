package com.basic.java.多线程.高并发.Singleton;

/**
 * @author Blse
 * @date 2019/4/2
 * @description 双重校验加volatile
 */
public class SingletonObject5 {

    private SingletonObject5(){}

    //使用volatile修饰能保证instance被初始化好之后再返回。原因是volatile能禁止底层的重排序
    private volatile static SingletonObject5 instance;

    public SingletonObject5 getInstance() {
        if (instance == null) {
            synchronized (SingletonObject5.class) {
                if (instance == null) {
                    instance = new SingletonObject5();
                }
            }
        }
        return instance;
    }

}
