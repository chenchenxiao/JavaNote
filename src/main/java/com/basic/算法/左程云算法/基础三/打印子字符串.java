package com.basic.算法.左程云算法.基础三;

/**
 * @author Blse
 * @date 2018/12/13
 * @description 求字符串的所有子字符串
 */
public class 打印子字符串 {

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd'};
       func(arr, 0, 0);
    }

    public static void func(char[] arr, int start, int end) {

        if (start == arr.length - 1) {
            return;
        }
        System.out.print(String.valueOf(arr, start, end++) + " ");
        if (end + start > arr.length) {
            func(arr, ++start, 1);
        } else {
            func(arr, start, end++);
        }


    }

}
