package com.basic.算法.左程云算法.基础三;

/**
 * @author Blse
 * @date 2018/12/13
 * @description 1、三年生一只         2、母牛活十年
 */
public class 母牛数量 {

    public static void main(String[] args) {
        int num = num(11);
        System.out.println(num);
    }

    public static int num(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }
        return num(n - 1) + num(n - 3);
    }

    public static int num2(int n) {
        if (n < 10) {
            return num(n);
        }
        return num(n) - num(n - 10);
    }

}
