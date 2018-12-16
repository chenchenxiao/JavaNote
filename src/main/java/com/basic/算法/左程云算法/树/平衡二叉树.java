package com.basic.算法.左程云算法.树;

/**
 * @author Blse
 * @date 2018/12/3
 * @description 平衡二叉树即左右子树的高度差不会大于一
 */
public class 平衡二叉树 {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);
        System.out.println(isBalance(head));
    }

    public static boolean isBalance(TreeNode head) {
        int val = proccess(head);
        return val == -1 ? false : true;
    }

    public static int proccess(TreeNode head) {
        //判断当前节点是否为空，空直接返回0，空直接返回0
        if (head == null) {
            return 0;
        }
        //左边的高度
        int left = proccess(head.left);
        if (left == -1) {
            return -1;
        }
        //右边的高度
        int right = proccess(head.right);
        if (right == -1) {
            return -1;
        }
        //判断两边高度差是否大于1
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        //返回当前高度
        return Math.max(left, right) + 1;
    }

}
