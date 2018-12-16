package com.basic.算法.左程云算法.树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Blse
 * @date 2018/12/3
 * @description 完全二叉树即 1 节点必有左边  2 如果没有右边，则接下来的节点都必须是叶子节点
 */
public class 完全二叉树 {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(2);
        head.right = new TreeNode(6);
        head.left.left = new TreeNode(1);
        head.left.right = new TreeNode(3);
        head.right.left = new TreeNode(5);
//        System.out.println(isCBT(head));
        System.out.println(isCBT2(head));
    }

    public static boolean isCBT(TreeNode node) {
        if (node == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = false;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            TreeNode left = temp.left;
            TreeNode right = temp.right;
            if ((left == null && right != null) || (flag && (left != null || right != null))) {
                return false;
            }
            if (left != null) {
                queue.offer(left);
            }
            if (right != null) {
                queue.offer(right);
            } else {
                flag = true;
            }
        }
        return true;
    }

    /**
     * 非递归实现
     * @param node
     * @return
     */
    public static int isCBT2(TreeNode node) {
        //先判断节点是否为空
        if (node == null) {
            return 0;
        }
        //取得左孩子节点的值
        int left = isCBT2(node.left);
        //返回-1表示不为完全二叉树
        if (left == -1) {
            return -1;
        }
        //如果当前节点小于左孩子节点，即返回-1
        if (node.value < left) {
            return -1;
        }
        //取得右孩子节点的值
        int right = isCBT2(node.right);
        //如果右孩子节点非空，即比较值大小，大则返回值，小则说明不是完全二叉树
        if (node.right != null) {
            return right > node.value ? right : -1;
        }
        //返回当前节点的值
        return node.value;
    }




}
