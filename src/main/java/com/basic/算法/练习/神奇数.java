package com.basic.算法.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/10/23
 * @description
 */
public class 神奇数 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for (int i = begin; i < end; i++) {
            int val = i;
            if (isDou(i) && i > 10) {
                List<Integer> list = getArrs(i);
                int size = list.size();
                boolean isRight = false;
                for (int j = 0; j < size; j++) {
                    int sum = 0;
                    if (!isRight) {
                        for (int k = 0; k < size; k++) {
                            if (j != k) {
                                sum += list.get(k);
                            }
                        }
                        if (sum == list.get(j)) {
                            isRight = true;
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isDou(int val) {
        int result = 0;
        while (val != 0) {
            int temp = val % 10;
            result += temp;
            val /= 10;
        }
        return result % 2 == 0;
    }

    public static List<Integer> getArrs(int i) {
        List<Integer> list = new ArrayList();
        while (i != 0) {
            list.add(i % 10);
            i /= 10;
        }
        return list;
    }

}
