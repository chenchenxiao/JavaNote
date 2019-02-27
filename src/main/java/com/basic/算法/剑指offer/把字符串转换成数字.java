package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 把字符串转换成数字 {

    public int StrToInt(String str) {
        if (str.equals("") || str == null ) {
            return 0;
        }
        char[] array = str.toCharArray();
        char first = array[0];
        boolean isAdd  = true;
        int result = 0;
        if (first == '-') {
            isAdd =  false;
        } else if (first == '+') {
            isAdd = true;
        } else if ((int)first > 57 || (int)first < 48) {
            return 0;
        } else {
            result = first - 48;
        }

        for (int i = 1; i < array.length; i++) {
            char temp = array[i];
            if (temp < 57 && temp > 48) {
                result = (result * 10) + (temp - 48);
            } else {
                return 0;
            }
        }
        if (isAdd) {
            return result;
        } else {
            return 0 - result;
        }
    }

}
