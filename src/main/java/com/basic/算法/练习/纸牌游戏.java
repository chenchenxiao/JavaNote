package com.basic.算法.练习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/10/23
 * @description
 */
public class 纸牌游戏 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arrs = new int[num];
        for (int i = 0; i < num; i++) {
            arrs[i] = sc.nextInt();
        }
        Arrays.sort(arrs);
        int A = 0;
        int B = 0;
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                A += arrs[i];
            } else {
                B += arrs[i];
            }
        }
        System.out.println(A - B);
    }

}
