package com.basic.jvm.类加载;

/**
 * @author Blse
 * @date 2018/1/15
 * @description     如果调用一个编译时的常量，其静态代码块是不会被执行的，也就是不会初始化类
 */

class FinalTest{
    public static final int i = 6 / 3;

    static{
        System.out.println("FinalTest");
    }

}

public class 编译时的常量 {
    public static void main(String[] args) {
        System.out.println(FinalTest.i);
    }
}
