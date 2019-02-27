package com.basic.算法.剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2019/2/27
 * @description
 */
public class 滑动窗口的最大值 {

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> result = new ArrayList();
        int length = num.length;
        if (length == 0 || size > num.length || size == 0) {
            return result;
        }
        for (int i = 0; i < length - size + 1; i++) {
            int val = num[i];
            for (int j = i; j < i + size; j++) {
                System.out.println(j);
                int temp = num[j];
                if (temp > val) {
                    val = temp;
                }
            }
            result.add(val);
        }
        return result;
    }

}
