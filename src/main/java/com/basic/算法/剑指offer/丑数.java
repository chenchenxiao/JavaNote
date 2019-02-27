package com.basic.算法.剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/12/27
 * @description
 */
public class 丑数 {
    public int GetUglyNumber_Solution(int target) {
        if (target < 0) {
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (list.size() < target) {
            int m2 = list.get(i2) * 2;
            int m3 = list.get(i3) * 3;
            int m5 = list.get(i5) * 5;
            int min = Math.min(m2, Math.min(m3, m5));
            list.add(min);
            if (min == m2) {
                i2++;
            }
            if (min == m3) {
                i3++;
            }
            if (min == m5) {
                i5++;
            }
        }
        return list.get(list.size() - 1);
    }
}
