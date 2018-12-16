package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/26
 * @description
 */
public class 矩阵查数 {

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 0, 1, 2, 3, 4, 5, 6 },// 0
                { 10, 12, 13, 15, 16, 17, 18 },// 1
                { 23, 24, 25, 26, 27, 28, 29 },// 2
                { 44, 45, 46, 47, 48, 49, 50 },// 3
                { 65, 66, 67, 68, 69, 70, 71 },// 4
                { 96, 97, 98, 99, 100, 111, 122 },// 5
                { 166, 176, 186, 187, 190, 195, 200 },// 6
                { 233, 243, 321, 341, 356, 370, 380 } // 7
        };
        int K = 400;
        System.out.println(isContains(matrix, K));
    }

    public static boolean isContains(int[][] arr, int num) {
        boolean isFind = false;
        int a = 0;
        int b = arr[0].length - 1;
        while (!isFind && b >= 0 && a <= arr.length - 1) {
            int val = arr[a][b];
            if (val > num) {
                b--;
            } else if (val < num) {
                a++;
            } else {
                isFind = true;
            }
        }
        return isFind;
    }

}
