package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/17
 * @description 因为是非减排序数组的旋转，相当于 1 2 3 4 5 旋转为 3 4 5 1 2，所以拿当前数比较后一位的数即可
 */
public class 旋转数组的最小数 {

    public int minNumberInRotateArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return 0;
    }

}
