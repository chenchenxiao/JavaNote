package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/20
 * @description
 */
public class 数组中出现超过一半的数 {


    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,2,5,4,2};
        MoreThanHalfNum_Solution(arr);
    }

    public static int MoreThanHalfNum_Solution(int[] array) {
        int length = array.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return array[0];
        }
        int[] temp = new int[length];
        for (int i = 0;  i< length; i++) {
            temp[i] = array[i];
        }
        for (int i = 0; i < length; i++) {
            if (temp[i] != 0) {
                for (int j = i + 1; j < length; j++) {
                    if (temp[i] != temp[j] && temp[j] != 0) {
                        temp[j] = 0;
                        temp[i] = 0;
                        break;
                    }
                }
            }
        }
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (temp[i] != 0) {
                result = temp[i];
                break;
            }
        }
        int times = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == result) {
                times++;
            }
        }
        return 2 * times > length ? result : 0;
    }

}
