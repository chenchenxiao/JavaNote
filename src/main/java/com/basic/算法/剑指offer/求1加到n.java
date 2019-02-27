package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 求1加到n {

    public int Sum_Solution(int n) {
        int result = n;
        boolean flag = n > 0 && (result += Sum_Solution(n - 1)) > 0;
        return result;
    }

}
