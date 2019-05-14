package com.basic.java.多线程.高并发.Singleton;

/**
 * @author Blse
 * @date 2019/4/2
 * @description 懒汉式
 */
public class SingletonObject2 {


    private SingletonObject2(){}

    private static  SingletonObject2 instance;

    //当调用getInstance时才加载，但是在多线程环境下可能会出现问题，即线程1判断完instance非空后，
    // 轮到线程2执行，线程2会生成一个实例对象，然后线程1再执行，此时就是生成2个实例了
    public static SingletonObject2 getInstance() {
        if (instance == null) {
            instance = new SingletonObject2();
        }
        return SingletonObject2.instance;
    }

}
