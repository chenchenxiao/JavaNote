package com.basic.java.多线程.高并发.Singleton;

/**
 * @author Blse
 * @date 3019/4/3
 * @description 通过synchronized修饰
 */
public class SingletonObject3 {

    private SingletonObject3(){}

    private static  SingletonObject3 instance;


    //这种方式不会产生多个对象，但是使用了synchronize修饰，会导致性能变差
    public synchronized static SingletonObject3 getInstance() {
        if (instance == null) {
            instance = new SingletonObject3();
        }
        return SingletonObject3.instance;
    }
    
}
