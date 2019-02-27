package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 显示数值的字符串 {

    public boolean isNumeric(char[] str) {
        int length = str.length;
        if (str == null || length == 0) {
            return false;
        }
        int index = 0;
        boolean hasE = false;
        boolean sign = false;
        boolean dian = false;
        if (!Character.isDigit(str[0])) {
            if (str[0] == '+' || str[0] == '-') {
                sign = true;
                index++;
            } else if (str[0] == '.'){
                dian = true;
                index++;
            } else {
                return false;
            }
        }
        if (index == length - 1) {
            return false;
        }
        for (int i = index; i < length; i++) {
            char temp = str[i];
            if (!Character.isDigit(temp)) {
                if (temp == '+' || temp == '-') {
                    if (sign) {
                        return false;
                    } else if (str[i - 1] == 'E' || str[i - 1] == 'e'){
                        sign = true;
                    } else {
                        return false;
                    }
                } else if (temp == '.') {
                    if (dian) {
                        return false;
                    }
                    dian = true;
                } else if (temp == 'e' || temp == 'E') {
                    if (hasE || i == length - 1) {
                        return false;
                    } else if (str[i - 1] == '.' || Character.isDigit(str[i - 1])) {
                        hasE = true;
                        dian = true;
                        sign = false;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
