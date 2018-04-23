package com.basic.java;

/**
 * @author Blse
 * @date 2017/11/27
 * @description
 */
public class 初始化顺序 {
    public static void main(String[] args) {
        Son son = new Son();
    }
}

class Parent{
    String str = "parent";
    public Parent(){
        method();
    }
    public void method(){
        System.out.println("parent");
    }
}
class Son extends Parent{
    String str = "son";


    @Override
    public void method(){
        System.out.println("son-->" + str );
    }
}
