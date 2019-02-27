package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/19
 * @description 判断给出的数组是否为二叉搜索树的后续遍历。
 */
public class 二叉搜索树的后续遍历排序 {

    public static void main(String[] args) {
        int[] arr = {7,4,6,5};
        boolean result = VerifySquenceOfBST(arr);
        System.out.println(result);
    }

    public static boolean VerifySquenceOfBST(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return false;
        }
        return isRight(arr, 0, arr.length - 1);
    }


    public static boolean isRight(int[] arr, int start, int end) {
        //表示对应的子树是对的
        if (start >= end) {
            return true;
        }
        //二叉树后续遍历的根节点
        int val = arr[end];
        //大于根节点的第一个数的索引
        int end2 = 0;
        //第一次是对只有左子树或右子树情况的查找
        for (int i = start; i < end; i++) {
            if (arr[i] > val) {
                end2 = i;
            }
        }
        //等于0表示只有左子树或右子树，也就是数组是递增或递减，否则就重新查找
        if (end2 == 0) {
            return true;
        } else {
            boolean flag = true;
            for (int i = start; i < end && flag; i++) {
                if (arr[i] > val) {
                    end2 = i;
                    flag = false;
                }
            }
        }
        for (int i = end2 + 1; i < end; i++) {
            if (arr[i] < val) {
                return false;
            }
        }
        return isRight(arr, start, end2 - 1) && isRight(arr, end2 + 1, end);
    }

}
