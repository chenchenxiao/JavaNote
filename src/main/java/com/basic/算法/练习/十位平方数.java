package com.basic.算法.练习;

/**
 * @author Blse
 * @date 2018/10/15
 * @description
 */
public class 十位平方数 {

    public static void main(String[] args) {
        long result = 0;
        for (long i = 32043L; i < 100000L; i++) {
            long n = i * i;
            boolean isRight = judge(n);
            if (isRight) {
                if (n > result) {
                    result = n;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean judge(long val) {
        int num = 0;
        int[] arrs = new int[10];
        while (val > 0) {
            int temp = (int) (val % 10);
            if (arrs[temp] == 1) {
                return false;
            }
            arrs[temp] += 1;
            val /= 10;
        }
        return true;

    }

}
