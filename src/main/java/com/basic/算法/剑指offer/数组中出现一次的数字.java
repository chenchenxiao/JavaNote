package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 数组中出现一次的数字 {

    public void FindNumsAppearOnce(int[] array,int num1[] , int num2[]) {
        int length = array.length;
        boolean isFind = false;
        if (length == 0) {
            num1[0] = 0;
            num2[0] = 0;
        }
        for (int i = 0; i < length; i++) {
            int temp = array[i];
            int number = 1;
            for (int j = 0; j < length; j++) {
                if (j != i && temp == array[j]) {
                    number++;
                }
            }
            if (number == 1) {
                if (!isFind) {
                    num1[0] = temp;
                    isFind = true;
                } else {
                    num2[0] = temp;
                }
            }
        }
    }

}
