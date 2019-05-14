package com.basic.java.多线程.高并发.Singleton;

/**
 * @author Blse
 * @date 2019/4/2
 * @description 饿汉式
 *              这种方式的缺点是加载SingletonObject1时就已经创建好了，如果一直没使用该实例那很浪费空间
 */
public class SingletonObject1 {

    private SingletonObject1(){}

    //在加载类时就创建好了
    private static final SingletonObject1 singletonObject1 = new SingletonObject1();

    public static SingletonObject1 getInstance() {
        return singletonObject1;
    }

}
