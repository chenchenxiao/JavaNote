package com.basic.test;

/**
 * @author Blse
 * @date 2018/10/8
 * @description
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println(ret());
    }

    public static int ret() {
        int i = 0;
        try {
            return i;
        } finally {
            i = 2;
        }
    }

}


