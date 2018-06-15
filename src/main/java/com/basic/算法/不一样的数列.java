package com.basic.算法;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/5/5
 * @description
 */
public class 不一样的数列 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数列的长度");
        int num = scanner.nextInt();
        int[] arrays = new int[num];
        System.out.println("请输入范围");
        int range = scanner.nextInt();
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < num; j++) {
                arrays[j] = i;
            }
        }
    }
}
