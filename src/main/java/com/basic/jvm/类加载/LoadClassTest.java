package com.basic.jvm.类加载;

/**
 * @author Blse
 * @date 2018/3/24
 * @description
 */
public class LoadClassTest {


    public void test() throws ClassNotFoundException {
//        this.getClass().getClassLoader().loadClass("CastTest");
        System.out.println(this.getClass().getClassLoader().getResource("".toString()));

    }

    public static void main(String[] args) throws ClassNotFoundException {
        new LoadClassTest().test();
    }
}


