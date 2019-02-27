package com.basic.算法.剑指offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 圈圈中最后剩下的数 {

    public static void main(String[] args) {
        int i = LastRemaining_Solution(5, 3);
        System.out.println(i);
    }

    public static int LastRemaining_Solution(int n, int m) {
        if (n == 1) {
            return 0;
        } else if (n == 0) {
            return -1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() != 1) {
            for (int i = 0; i < m; i++) {
                if (i == m - 1) {
                    list.remove(index);
                } else {
                    index++;
                }
                if (index >= list.size()) {
                    index = 0;
                }
            }
        }
        return list.get(0);
    }

}
