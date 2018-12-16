package com.basic.算法.左程云算法.基础三;

/**
 * @author Blse
 * @date 2018/12/13
 * @description 求字符串的全排列
 */
public class 字符串全排列 {

    public static void main(String[] args) {
        String test1 = "abc";
        func(test1.toCharArray(), 0);
    }

    public static void func(char[] arr, int i) {
        if (i == arr.length) {
            System.out.println(String.valueOf(arr));
        }
        for (int j = i; j < arr.length; j++) {
            swap(arr, i, j);
            func(arr, i + 1);
            swap(arr, i, j);
        }
    }



    public static void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }

}
