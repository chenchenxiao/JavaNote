package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/16
 * @description
 */
public class 替换空格 {

    public static String replaceSpace(StringBuffer str) {
        char[] arr = str.toString().toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                result += "%20";
            } else {
                result += arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
    }

}
