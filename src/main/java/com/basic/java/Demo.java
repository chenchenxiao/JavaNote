package com.basic.java;

/**
 * @author Blse
 * @date 2018/3/26
 * @description
 */
public class Demo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println();
    }
}

class A{
    static int i = 2;

    public void test() {
        System.out.println(this.i);
    }
}
