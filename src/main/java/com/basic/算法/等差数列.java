package com.basic.算法;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/5/5
 * @description
 */
public class 等差数列 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入有几个整数");
        int num = scanner.nextInt();
        int[] ints = new int[num];
        System.out.println("请输入整数");
        for (int i = 0; i < num; i++) {
            ints[i] = scanner.nextInt();
        }
        Arrays.sort(ints);
        for (int i = 0; i < num - 2; i++) {
            int difA = ints[i] - ints[i + 1];
            int difB = ints[i + 1] - ints[i + 2];
            if (difA != difB) {
                System.out.println("impossible");
                return;
            }
        }
        System.out.println("possible");

    }


}
