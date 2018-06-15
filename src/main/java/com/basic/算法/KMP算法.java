package com.basic.算法;

/**
 * @author Blse
 * @date 2018/5/14
 * @description
 */
public class KMP算法 {

    public static void main(String[] args) {

    }

    public int[] getNextArrays(String str) {
        int[] arrs = new int[str.length()];
        int j = 0;
        char[] strs = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (strs[i] == strs[j]) {
                j++;
            }
        }
        return arrs;
    }

}
