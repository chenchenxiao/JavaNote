package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/23
 * @description
 */
public class 旋转90度遍历数组 {

    public static void main(String[] args) {
        int[][] maaix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printMaaix(maaix);
        rotate(maaix);
        System.out.println("=========");
        printMaaix(maaix);
    }

    public static void rotate(int[][] maaix) {
        int a = 0;
        int b = 0;
        int c = maaix.length - 1;
        int d = maaix[0].length - 1;
        while (a < c) {
            rotateEdge(maaix, a++, b++, c--, d--);
        }
    }

    public static void rotateEdge(int[][] arr, int a, int b, int c, int d) {
        int times = d - b;
        int tmp = 0;
        for (int i = 0; i != times; i++) {
            tmp = arr[a][b + i];
            arr[a][b + i] = arr[c - i][b];
            arr[c - i][b] = arr[c][d - i];
            arr[c][d - i] = arr[a + i][d];
            arr[a + i][d] = tmp;
        }
    }

    public static void printMaaix(int[][] maaix) {
        for (int i = 0; i != maaix.length; i++) {
            for (int j = 0; j != maaix[0].length; j++) {
                System.out.print(maaix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
