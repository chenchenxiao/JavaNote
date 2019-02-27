package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 左旋转字符串 {

    public String LeftRotateString(String str,int n) {
        if (str == null || str.equals("")) {
            return str;
        }
        int length = str.length();
        n = n % length;
        String subStrOne = str.substring(0, n);
        String subStrTwo = str.substring(n, length);
        String result = subStrTwo + subStrOne;
        return result;
    }

}
