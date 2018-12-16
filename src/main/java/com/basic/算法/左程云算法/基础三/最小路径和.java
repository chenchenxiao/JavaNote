package com.basic.算法.左程云算法.基础三;

/**
 * @author Blse
 * @date 2018/12/14
 * @description 给定二维数组，要求从左上角走到右下角，每一步只能向右或者向下，求最小路径和。
 *               也可以看成是从右下角走到左上角
 */
public class 最小路径和 {

    public static void main(String[] args) {
        int[][] m = { { 1, 3, 5, 9 }, { 8, 1, 3, 4 }, { 5, 0, 6, 1 }, { 8, 8, 4, 0 } };
        System.out.println(minPath(m, m.length - 1, m[0].length - 1));
    }

    public static int minPath(int[][] arr, int i, int j) {
        int res = arr[i][j];
        //i和j都为0表示到达左上角
        if (i == j && i == 0) {
            return res;
        }
        //表示列数比行数多，只需看列的值
        if (i == 0 && j != 0) {
            return res + minPath(arr, i, j - 1);
        }
        //表示行数比列数少，只需看行的值
        if (i != 0 && j == 0) {
            return res + minPath(arr, i - 1, j);
        }
        //返回往左和往上的最小值
        return res + Math.min(minPath(arr, i - 1, j), minPath(arr, i, j - 1));
    }

}
