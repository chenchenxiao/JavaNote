package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/25
 * @description
 */
public class 连续子数组的最大和 {

    public static void main(String[] args) {
        int[] arr = {1,-2,3,10,-4,7,2,-5};
        FindGreatestSumOfSubArray(arr);
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int result = Integer.MIN_VALUE;
        int val = 0;
        for (int i = 0; i < array.length; i++) {
            if (val <= 0) {
                val = array[i];
            } else {
                val += array[i];
            }
            if (val > result) {
                result = val;
            }
        }
        return result;

    }

}
