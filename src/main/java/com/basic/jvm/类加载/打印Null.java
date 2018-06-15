package com.basic.jvm.类加载;

/**
 * @author Blse
 * @date 2018/2/11
 * @description
 */
public class 打印Null {
    public static void main(String[] args) {
        Parent parent = new Son();
    }
}


class Parent{

    public static String str = "Parent";

    public Parent() {
        pln();
    }

    public void pln() {
        System.out.println(str);
    }
}

class Son extends  Parent{

    public  static String str = "Son";

    public void pln() {
        System.out.println(str);
    }
}