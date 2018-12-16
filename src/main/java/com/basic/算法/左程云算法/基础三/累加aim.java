package com.basic.算法.左程云算法.基础三;

/**
 * @author Blse
 * @date 2018/12/14
 * @description
 */
public class 累加aim {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 8 };
        int aim = 12;
        isHaving(arr, aim);
    }

    public static boolean isHaving(int[] arr, int aim) {
        return getAim(arr, aim, 0, 0);
    }

    public static boolean getAim(int[] arr, int aim, int i, int sum) {
        if (sum == aim) {
            return true;
        }
        if (i == arr.length) {
            return false;
        }
        boolean falg = getAim(arr, aim, i + 1, sum);
        boolean falg2 = getAim(arr, aim, i + 1, sum + arr[i]);
        return falg || falg2;
    }

}
