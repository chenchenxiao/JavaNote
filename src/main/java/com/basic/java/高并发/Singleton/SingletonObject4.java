package com.basic.java.多线程.高并发.Singleton;

/**
 * @author Blse
 * @date 2019/4/2
 * @description 双重校验
 */
public class SingletonObject4 {

    private SingletonObject4(){}

    private static SingletonObject4 instance;

    //这种方式比直接使用synchronize效率要高，不过也会有问题，就是在创建实例的时候，实例还没完全初始化就被返回，有可能会出现空指针异常
    //线程A在执行到instance = new SingletonObject4()时，低层发生了：先开辟空间，初始化对象，将instance指向内存空间，这里的第二步和第三步可以重排序，所以才可能导致对象未实例化完成就被使用
    public SingletonObject4 getInstance() {
        if (instance == null) {
            synchronized (SingletonObject4.class) {
                if (instance == null) {
                    instance = new SingletonObject4();
                }
            }
        }
        return instance;
    }

}
