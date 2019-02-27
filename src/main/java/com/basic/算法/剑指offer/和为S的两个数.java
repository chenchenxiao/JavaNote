package com.basic.算法.剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 和为S的两个数 {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> result  = new ArrayList<>();
        if (array == null || array.length < 2) {
            return result;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] == sum) {
                result.add(array[left]);
                result.add(array[right]);
                return result;
            } else if (array[left] + array[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

}
