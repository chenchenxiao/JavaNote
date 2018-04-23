package com.basic.设计模式;

/**
 * @author Blse
 * @date 2018/4/9
 * @description
 */
public class 单例模式 {
}

/**
 * 饿汉式
 */
class HungrySingleton{
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton newInstance(){
        return instance;
    }
}

/**
 * 懒汉式
 */
class LazySingleton{
    private static LazySingleton instance = null;
    private LazySingleton(){}
    public static LazySingleton newInstance(){
        if(null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }
}

/**
 * 双重校验
 */
class Singleton{
    private Singleton(){}

    private static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized(Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

/**
 * 静态内部类
 */
class StaticSingleton{
    private static class SingletonHolder{
        public static StaticSingleton instance = new StaticSingleton();
    }
    private StaticSingleton(){}
    public static StaticSingleton newInstance(){
        return SingletonHolder.instance;
    }
}


