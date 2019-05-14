package com.basic.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Blse
 * @date 2019/3/7
 * @description
 */
public class 座位安排 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int desk = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int val = sc.nextInt();
            arr[i] = val;
        }
        Arrays.sort(arr);
        //得到需要多少个人是单桌的
        int needNum = desk * 2 - num;
        //多少人是同桌的
        int realNum = num - needNum;
        int result = arr[realNum / 2] + arr[realNum / 2 - 1];
        System.out.println(result);
    }

}
