package com.basic.算法.剑指offer;

import java.util.Arrays;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 扑克牌顺子 {

    public boolean isContinuous(int [] numbers) {
        int length = numbers.length;
        if (length != 5) {
            return false;
        }
        Arrays.sort(numbers);
        int min = 0;
        boolean isMin = false;
        for (int i = 0; i < length - 1; i++) {
            if (numbers[i] != 0) {
                if (numbers[i] == numbers[i + 1]) {
                    return false;
                }
            }
            if (numbers[i] != 0 && !isMin) {
                min = numbers[i];
                isMin = true;
                break;
            }
        }
        int max = numbers[length - 1];
        if (max - min < 5) {
            return true;
        }
        return false;

    }

}
