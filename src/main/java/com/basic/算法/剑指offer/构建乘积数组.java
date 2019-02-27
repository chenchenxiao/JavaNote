package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 构建乘积数组 {

    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        for (int i = 0; i < length; i++) {
            int temp = 1;
            for (int j = 0; j < length; j++) {
                if (j != i) {
                    temp *= A[j];
                }
            }
            B[i] = temp;
        }
        return B;
    }

}
