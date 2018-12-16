package com.basic.算法.左程云算法.树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Blse
 * @date 2018/12/3
 * @description 搜索二叉树左子树的节点都小于根节点，右子树都大于根节点
 */
public class 搜索二叉树 {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(2);
        head.right = new TreeNode(6);
        head.left.left = new TreeNode(1);
        head.left.right = new TreeNode(3);
        head.right.left = new TreeNode(5);
        System.out.println(proccess(head));
    }

    /**
     * 相当于中序遍历，每一次与前一个数比较
     * @param treeNode
     * @return
     */
    public static boolean proccess(TreeNode treeNode) {
        if (treeNode == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        int val = Integer.MIN_VALUE;
        while (!stack.isEmpty() || treeNode != null) {
            if (treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.left;
            } else {
                treeNode = stack.pop();
                if (val < treeNode.value) {
                    val = treeNode.value;
                } else {
                    return false;
                }
                treeNode = treeNode.right;
            }

        }
        return true;
    }

}
