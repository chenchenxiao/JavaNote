package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/20
 * @description
 */
public class 二叉搜索树与双向链表 {

    public static void main(String[] args) {
       TreeNode node1 = new TreeNode(5);
       TreeNode node2 = new TreeNode(3);
       TreeNode node3 = new TreeNode(4);
       TreeNode node4 = new TreeNode(7);
       node1.left = node2;
       node1.right = node4;
       node2.right = node3;
       Convert(node1);
       System.out.println();
    }

    public static TreeNode Convert(TreeNode node) {
        if (node == null) {
            return null;
        }

        return node.right;
    }

}
