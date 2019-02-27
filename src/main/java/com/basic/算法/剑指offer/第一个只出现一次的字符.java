package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/24
 * @description
 */
public class 第一个只出现一次的字符 {

    public int FirstNotRepeatingChar(String str) {
        char[] arr = str.toCharArray();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (str.indexOf(arr[i]) == str.lastIndexOf(arr[i]) && index == -1) {
                index = i;
            }
        }
        return index - 1;
    }

}
