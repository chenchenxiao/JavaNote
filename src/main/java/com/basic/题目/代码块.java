package com.basic.题目;

/**
 * @author Blse
 * @date 2018/1/31
 * @description
 */
public class 代码块 {
    static 代码块 a = new 代码块();
    static {
        System.out.println("static---");
    }
    public 代码块(){
        System.out.println("Controcutor");
    }
    {
        System.out.println("gouzaokuai");
    }

    public static void main(String[] args) {
        new 代码块();
    }
}
