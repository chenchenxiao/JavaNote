package com.basic.JVM.类加载;

import java.util.Stack;

/**
 * @author Blse
 * @date 2018/1/15
 * @description     只有当程序访问的静态属性确实在当前类时才会初始化当前类
 *                   否则就是初始化属性所在的类
 */

class Parent1{
    public static int i = 1;

    static {
        System.out.println("Parent1");
    }
}

class Child1 extends Parent1{
    static {
        System.out.println("Child1");
    }
}

public class 静态变量要在当前类 {
    public static void main(String[] args) {
        System.out.println(Child1.i);

    }

}
