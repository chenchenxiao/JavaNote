package com.basic.test;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2019/3/2
 * @description
 */
public class 最大均值和 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int[] A = new int[numA];
        int[] B = new int[numB];
        int valA = 0, indexA = 0;
        int valB = 0, indexB = 0;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            valA += val;
            valB += val;
            if (valA / (indexA + 1) >= valB / (indexB + 1) && indexA != A.length) {
                A[indexA] = val;
                valB -= val;
                result[i] = 1;
                indexA++;
            } else {
                B[indexB] = val;
                result[i] = 2;
                valA -= val;
                indexB++;
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }


}
