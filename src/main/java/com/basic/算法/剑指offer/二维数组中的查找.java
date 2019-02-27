package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/16
 * @description  从右上角找，如果当前数大于目标数，说明在当前数的左边，列减一，反则说明在当前数下面，行加一，递归该过程即可
 */
public class 二维数组中的查找 {

    public static boolean proccess(int[][] arr, int target, int i, int j) {
        if (i >= arr.length || j < 0) {
            return false;
        } else {
            int val = arr[i][j];
            if (val > target) {
                return proccess(arr, target, i, --j);
            }else if (val < target) {
                return proccess(arr, target, ++i, j);
            } else {
                return true;
            }
        }


    }

    public static boolean Find(int target, int [][] array) {
        return proccess(array, target, 0, array[0].length - 1);
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean find = Find(16, arr);
        System.out.println(find);
    }

}
