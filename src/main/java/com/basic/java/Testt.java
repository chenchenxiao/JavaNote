package com.basic.java;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Blse
 * @date 2019/3/13
 * @description
 */
public class Testt {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int weight = sc.nextInt();
        int[] W = new int[num];
        int[] V = new int[num];
        float[] real = new float[num];
        for (int i = 0; i < num; i++) {
            W[i] = sc.nextInt();
            V[i] = sc.nextInt();
            real[i] = V[i] / W[i];
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (real[i] < real[j]) {
                    int temp = V[j];
                    int tempW = W[j];
                    V[j] = V[i];
                    V[i] = temp;
                    W[j] = W[i];
                    W[i] = tempW;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < num && weight > 0; i++) {
            int curWeight = W[i];
            int curValue = V[i];
            if (weight - curWeight >= 0) {
                result += curValue;
                weight -= curWeight;
            }
        }

        System.out.println(result);
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[][] arrs = new int[num][num];
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                arrs[i][j] = sc.nextInt();
//            }
//        }
//        boolean result = true;
//        for (int i = 0; i < num - 1 && result; i++) {
//            for (int j = 0; j < num - 1 && result; j++) {
//                //当前数
//                int val = arrs[i][j];
//                //左上角
//                if (i == 0 && j == 0) {
//                    if (val == arrs[i + 1][j] || val == arrs[i][j + 1]) {
//                        result = false;
//                        break;
//                    }
//                } else if (j == num - 1) {  //右上角
//                    if (val == arrs[i + 1][j]) {
//                        result = false;
//                        break;
//                    }
//                } else if (i == num - 1) {
//                    //左下角
//                    if (val == arrs[i][j + 1]) {
//                        result = false;
//                        break;
//                    }
//                } else {
//                    if (val == arrs[i][j + 1] || val == arrs[i + 1][j]) {
//                        result = false;
//                        break;
//                    }
//                }
//            }
//        }
//        if (result) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//    }

}
