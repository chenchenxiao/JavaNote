package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/17
 * @description
 */
public class 数值的整数次方 {

    public static double Power(double base, int exponent) {
        double result = base;
        if (exponent < 0) {
            base =  1 / base;
            result = base;
            exponent *= -1;
        } else if (exponent == 0) {
            return 1;
        }
        for (int i = 1; i < exponent; i++) {
            result *= base;
        }
        return result;


    }


}
