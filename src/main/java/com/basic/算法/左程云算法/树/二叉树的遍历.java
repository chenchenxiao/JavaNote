package com.basic.算法.左程云算法.树;

import java.util.Stack;

/**
 * @author Blse
 * @date 2018/11/28
 * @description
 */
public class 二叉树的遍历 {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode10 = new TreeNode(10);
        TreeNode treeNode11 = new TreeNode(11);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        treeNode4.left = treeNode8;
        treeNode4.right = treeNode9;
        treeNode5.left = treeNode10;
        treeNode5.right = treeNode11;

//        preOrder(treeNode);
        inOrder2(treeNode1);
//        preOrder2(treeNode);
//        postOrder(treeNode1);
//        System.out.println(" ");
//        postOrder2(treeNode1);
    }

    public static void preOrder(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.value + " ");
            preOrder(treeNode.left);
            preOrder(treeNode.right);
        }
    }

    public static void inOrder(TreeNode treeNode) {
        if (treeNode != null) {
            inOrder(treeNode.left);
            System.out.print(treeNode.value + " ");
            inOrder(treeNode.right);
        }
    }

    public static void postOrder(TreeNode treeNode) {
        if (treeNode != null) {
            postOrder(treeNode.left);
            postOrder(treeNode.right);
            System.out.print(treeNode.value + " ");
        }
    }

    //非递归

    public static void preOrder2(TreeNode treeNode) {
        if (treeNode != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(treeNode);
            while (!stack.isEmpty()) {
                TreeNode temp = stack.pop();
                System.out.print(temp.value + " ");
                if (temp.right != null) {
                    stack.push(temp.right);
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                }
            }
        }
    }

    public static void inOrder2(TreeNode treeNode) {
        if (treeNode != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || treeNode != null) {
                if (treeNode != null) {
                    stack.push(treeNode);
                    treeNode = treeNode.left;
                } else {
                    treeNode = stack.pop();
                    System.out.print(treeNode.value + " ");
                    treeNode = treeNode.right;
                }
            }
        }
    }

    public static void postOrder2(TreeNode treeNode) {
        if (treeNode != null) {
            Stack<TreeNode> stack = new Stack<>();
            Stack<TreeNode> stack1 = new Stack<>();
            stack.push(treeNode);
            while (!stack.isEmpty()) {
                TreeNode temp = stack.pop();
                stack1.push(temp);
                if (temp.left != null) {
                    stack.push(temp.left);
                }
                if (temp.right != null) {
                    stack.push(temp.right);
                }
            }
            while (!stack1.isEmpty()) {
                System.out.print(stack1.pop().value + " ");
            }

        }
    }
}
