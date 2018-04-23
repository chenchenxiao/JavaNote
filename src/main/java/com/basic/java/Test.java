package com.basic.java;

/**
 * @author Blse
 * @date 2018/2/1
 * @description
 */
public class Test {
    public static void main(String[] args) {
        new Ap().test1();
        new Ap().test1();
    }
}

 class Ap{
    private static int i = 1;
    public void test1() {
        i++;
        System.out.println(i++);
    }
}