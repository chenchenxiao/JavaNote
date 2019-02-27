package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/18
 * @description
 */
public class 二叉树的镜像 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(11);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        mirror(node1);
        System.out.println();
    }


    public static void mirror(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.right = left;
        node.left = right;
        mirror(node.left);
        mirror(node.right);
    }

}
