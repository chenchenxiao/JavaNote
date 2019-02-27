package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/17
 * @description 也就是斐波那契数列问题
 */
public class 矩形覆盖 {

    public int RectCover(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return RectCover(n - 1) + RectCover(n - 2);
    }

}
