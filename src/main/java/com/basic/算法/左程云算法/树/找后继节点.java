package com.basic.算法.左程云算法.树;

/**
 * @author Blse
 * @date 2018/11/29
 * @description
 */
public class 找后继节点 {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(6);
        head.parent = null;
        head.left = new TreeNode(3);
        head.left.parent = head;
        head.left.left = new TreeNode(1);
        head.left.left.parent = head.left;
        head.left.left.right = new TreeNode(2);
        head.left.left.right.parent = head.left.left;
        head.left.right = new TreeNode(4);
        head.left.right.parent = head.left;
        head.left.right.right = new TreeNode(5);
        head.left.right.right.parent = head.left.right;
        head.right = new TreeNode(9);
        head.right.parent = head;
        head.right.left = new TreeNode(8);
        head.right.left.parent = head.right;
        head.right.left.left = new TreeNode(7);
        head.right.left.left.parent = head.right.left;
        head.right.right = new TreeNode(10);
        head.right.right.parent = head.right;

        TreeNode test = head.left.left;
        System.out.println(test.value + " next: " + getSuccessorTreeNode(test).value);
        test = head.left.left.right;
        System.out.println(test.value + " next: " + getSuccessorTreeNode(test).value);
        test = head.left;
        System.out.println(test.value + " next: " + getSuccessorTreeNode(test).value);
        test = head.left.right;
        System.out.println(test.value + " next: " + getSuccessorTreeNode(test).value);
        test = head.left.right.right;
        System.out.println(test.value + " next: " + getSuccessorTreeNode(test).value);
        test = head;
        System.out.println(test.value + " next: " + getSuccessorTreeNode(test).value);
        test = head.right.left.left;
        System.out.println(test.value + " next: " + getSuccessorTreeNode(test).value);
        test = head.right.left;
        System.out.println(test.value + " next: " + getSuccessorTreeNode(test).value);
        test = head.right;
        System.out.println(test.value + " next: " + getSuccessorTreeNode(test).value);
        test = head.right.right; // 10's next is null
        System.out.println(test.value + " next: " + getSuccessorTreeNode(test));
    }

    public static TreeNode getSuccessorTreeNode(TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }
        if (treeNode.right != null) {
            treeNode = treeNode.right;
            while (treeNode.left != null) {
                treeNode = treeNode.left;
            }
            return treeNode;
        } else {
            TreeNode node = treeNode.parent;
            while (node != null && treeNode != node.left) {
                treeNode = node;
                node = node.parent;
            }
            return node;
        }
    }

}
