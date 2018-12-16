package com.basic.算法.左程云算法.基础三;

/**
 * @author Blse
 * @date 2018/12/13
 * @description
 */
public class 汉诺塔 {

    public static void main(String[] args) {
        func(3, 3, "left", "mid", "right");
    }

    public static void func(int rest, int down, String from, String help, String to) {
        if (rest == 1) {
            System.out.println("move " + down + " from " + from + " to " + to);
        } else {
            func(rest - 1, down - 1, from, to, help);
            func(1, down, from, help, to);
            func(rest - 1, down - 1, help, from, to);
        }
    }

}
