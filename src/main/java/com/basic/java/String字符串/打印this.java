package com.basic.java.String字符串;

/**
 * @author Blse
 * @date 2018/1/29
 * @description
 */
public class 打印this {
    @Override
    public String toString() {
        return "this-->" + this;
    }

    public static void main(String[] args) {
        String a = "s".intern();
        String b = new String("s");
        System.out.println(a);
//        System.out.println("A" + new 打印this());
    }

}

