package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/26
 * @description
 */
public class 之字型打印数组 {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        boolean flag = false;
        int one = arr.length;
        int two = arr[0].length;
        while (a != one) {
            printArray(arr, a, b, c, d, flag);
            //当列达到最大时，行++
            a = b == two - 1 ? ++a : a;
            //列还没最大时，列++
            b = b == two - 1 ? b : ++b;
            //列还没最大时，列++
            d = c == one - 1 ? ++d : d;
            c = c == one - 1 ? c : ++c;
            flag = !flag;
        }
    }

    /**
     * 1  2  3  4
     * 5  6  7  8
     * 9  10 11 12
     */
    public static void printArray(int[][] arr, int a, int b, int c, int d, boolean flag) {
        //从上到下, 从下到上
        if (flag) {
            while (b >= d && a <= c) {
                System.out.print(arr[a++][b--] + " ");
            }
        } else {
            while (c >= a && d <= b) {
                System.out.print(arr[c--][d++] + " ");
            }
        }

    }

}
