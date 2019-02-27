package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 数组中重复的数字 {

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean[] arr = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (arr[numbers[i]] == true) {
                duplication[0] = numbers[i];
                return true;
            }
            arr[numbers[i]] = true;
        }
        return false;
    }

}
