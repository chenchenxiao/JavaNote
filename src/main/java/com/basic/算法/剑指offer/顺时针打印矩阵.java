package com.basic.算法.剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/12/18
 * @description
 */
public class 顺时针打印矩阵 {

    public static void main(String[] args) {
        int[][] maaix = { { 1, 2, 3, 4,5 }, { 6, 7, 8, 9, 10 }, {11, 12, 13, 14, 15 },
                {16, 17, 18, 19, 20 }, {21, 22, 23, 24, 25} };
        printMatrix(maaix);
    }

    public static ArrayList<Integer> printMatrix(int[][] arr) {
        int a = 0;
        int b = 0;
        int c = arr.length - 1;
        int d = arr[0].length - 1;
        ArrayList<Integer> result = new ArrayList<>();
        if (arr.length == 1 && arr[0].length == 1) {
            result.add(arr[0][0]);
            return result;
        }
        while (a <= c && b <= d) {
            printArray(result,arr, a++, b++, c--, d--);
        }
        return result;
    }

    public static void printArray(ArrayList<Integer> list, int[][] arr, int a, int b, int c, int d) {
        if (a == c) {
            for (int i = b; i <= d; i++) {
                list.add(arr[a][i]);
            }
        } else if (b == d) {
            for (int i = a; i <= c; i++) {
                list.add(arr[i][b]);
            }
        } else {
            //上面
            for (int i = b; i < d; i++) {
                System.out.print(arr[a][i] + " ");
                list.add(arr[a][i]);
            }
            //右边
            for (int i = a; i < c; i++) {
                System.out.print(arr[i][d] + " ");
                list.add(arr[i][d]);
            }
            //下面
            for (int i = d; i > b; i--) {
                System.out.print(arr[c][i] + " ");
                list.add(arr[c][i]);
            }
            //左边
            for (int i = c; i > a; i--) {
                System.out.print(arr[i][b] + " ");
                list.add(arr[i][b]);
            }
        }
    }


}
