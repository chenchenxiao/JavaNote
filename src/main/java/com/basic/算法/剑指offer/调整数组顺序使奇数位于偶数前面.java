package com.basic.算法.剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/12/17
 * @description
 */
public class 调整数组顺序使奇数位于偶数前面 {

    public void reOrderArray(int [] array) {
        ArrayList<Integer> oddList = new ArrayList();
        ArrayList<Integer> evenList = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenList.add(array[i]);
            } else {
                oddList.add(array[i]);
            }
        }
        int evenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < oddList.size()) {
                array[i] = oddList.get(i);
            } else {
                array[i] = evenList.get(evenIndex);
                evenIndex++;
            }
        }
    }

}
