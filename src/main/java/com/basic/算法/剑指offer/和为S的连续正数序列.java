package com.basic.算法.剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 和为S的连续正数序列 {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int plow = 1, phigh = 2;
        while (phigh > plow) {
            int cur = (phigh + plow) * (phigh - plow + 1) / 2;
            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = plow; i <= phigh; i++) {
                    list.add(i);
                }
                result.add(list);
                plow++;
            } else if (cur < sum) {
                phigh++;
            } else {
                plow++;
            }
        }
        return result;
    }

}
