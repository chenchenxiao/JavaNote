package com.basic.java.多线程.高并发.Singleton;

/**
 * @author Blse
 * @date 2019/4/2
 * @description  用枚举的方式
 */
public class SingletonObject7 {

    private SingletonObject7(){}

    private enum Singleton{
        INSTANCE;
        private SingletonObject7 instance;

        Singleton() {
            instance = new SingletonObject7();
        }

        public SingletonObject7 getInstance() {
            return instance;
        }
    }

    public static SingletonObject7 getIntance() {
        return Singleton.INSTANCE.getInstance();
    }

}
