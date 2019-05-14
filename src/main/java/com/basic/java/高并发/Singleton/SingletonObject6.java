package com.basic.java.多线程.高并发.Singleton;

/**
 * @author Blse
 * @date 2019/4/2
 * @description 使用Holder
 */
public class SingletonObject6 {

    private SingletonObject6(){}

    //这种方式可以保证在需要用到的时候才会初始化，效率高，保证了只会产生一个实例
    //因为在执行类的初始化期间，JVM会去获取一个锁，这个锁可以同步多个线程对同一个类的初始化
    private static class InstanceHolder{
        private final static SingletonObject6 instance = new SingletonObject6();
    }

    public static SingletonObject6 getInstance() {
        return InstanceHolder.instance;
    }

}
