package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/23
 * @description
 */
public class 从外到内遍历二维数组 {

    public static void main(String[] args) {
        int[][] maaix = { { 1, 2, 3, 4,5 }, { 6, 7, 8, 9, 10 }, {11, 12, 13, 14, 15 },
                {16, 17, 18, 19, 20 }, {21, 22, 23, 24, 25} };
        spiralOrderPrint(maaix);
    }

    public static void spiralOrderPrint(int[][] arr) {
        int a = 0;
        int b = 0;
        int c = arr.length - 1;
        int d = arr[0].length - 1;
        //每次遍历都是遍历一个圈
        while (a <= c && b <= d) {
            printArray(arr, a++, b++, c--, d--);
        }
    }


    public static void printArray(int[][] arr, int a, int b, int c, int d) {
        //判断是否在同一行
        if (a == c) {
            for (int i = b; i < d; i++) {
                System.out.print(arr[a][i] + " ");
            }
        } else if (b == d) {
            for (int i = a; i < c; i++) {
                System.out.print(arr[i][b] + " ");
            }
        } else {
            int curA = a;
            int curB = b;
            //遍历上边
            while (curB < d) {
                System.out.print(arr[a][curB] + " ");
                curB++;
            }
            //遍历右边
            while (curA < c) {
                System.out.print(arr[curA][d] + " ");
                curA++;
            }
            //遍历下边
            while (d > b) {
                System.out.print(arr[c][d] + " ");
                d--;
            }
            //遍历左边
            while (c > a) {
                System.out.print(arr[c][d] + " ");
                c--;
            }
        }

    }


}
