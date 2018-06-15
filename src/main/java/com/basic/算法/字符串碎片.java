package com.basic.算法;

/**
 * @author Blse
 * @date 2018/5/4
 * @description
 */
public class 字符串碎片 {
    public static void main(String[] args) {
        String str = "aaabbaaac";

        System.out.println(strVal(str));
    }

    static float strVal(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        int num = 1;
        for (int i = 0; i < length - 1; i++) {
            if (chars[i] != chars[i + 1]) {
                num++;
            }
        }
        return length / num;
    }
}
