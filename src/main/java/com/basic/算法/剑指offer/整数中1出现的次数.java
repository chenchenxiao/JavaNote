package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/27
 * @description
 */
public class 整数中1出现的次数 {

    public int NumberOf1Between1AndN_Solution(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                int val = temp % 10;
                if (val == 1) {
                    result++;
                }
                temp /= 10;
            }
        }
        return result;
    }

}
