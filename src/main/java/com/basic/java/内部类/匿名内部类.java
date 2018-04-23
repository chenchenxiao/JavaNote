package com.basic.java.内部类;

/**
 * @author Blse
 * @date 2017/11/27
 * @description 匿名内部类用static方法获取
 */
public class 匿名内部类 {
    public static InterA innerA(){
        return new InterA() {
            public int i = 1;
            public void prin(){
                System.out.println("print");
            }
        };
    }

    public static void main(String[] args) {
        InterA interA = innerA();
        interA.prin();
    }
}

interface InterA{
   void prin();
}
