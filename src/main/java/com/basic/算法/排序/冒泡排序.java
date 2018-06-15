package com.basic.算法.排序;

/**
 * @author Blse
 * @date 2018/6/15
 * @description
 */
public class 冒泡排序 {

    public static void main(String[] args) {
        int[] arrs = {6, 5, 3, 1, 8, 7, 2, 4, 3, 5, 6 };
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                int temp = arrs[i];
                if (temp > arrs[j]) {
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
        System.out.println(arrs);
    }

}
