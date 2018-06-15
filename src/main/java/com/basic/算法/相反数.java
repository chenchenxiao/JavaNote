package com.basic.算法;

/**
 * @author Blse
 * @date 2018/5/4
 * @description
 */
public class 相反数 {
    public static void main(String[] args) {
        System.out.println(oppositeNum(1234567));
    }

    static int oppositeNum(int num) {
        int val = 0;
        int realNum = num;
        while(num != 0) {
            val = val * 10 + num % 10;
            num /= 10;
        }
        return val + realNum;
    }
}
