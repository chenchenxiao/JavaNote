package com.basic.算法.左程云算法.树;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Blse
 * @date 2018/11/30
 * @description
 */
public class 序列化与反序列化 {

    public static void main(String[] args) {
        TreeNode head = null;

        head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.right.right = new TreeNode(5);
        printTree(head);
        String pre = serialByLevel(head);
        head = reconByLevelString(pre);
        printTree(head);
//        String pre = serialByPre(head);
//        pre = serialByPre(head);
//        System.out.println("serialize tree by pre-order: " + pre);
//        head = reconByPreString(pre);
//        System.out.print("reconstruct tree by pre-order, ");
//        printTree(head);

//        System.out.println(serialByLevel(head));
    }

    public static String serialByPre(TreeNode treeNode) {
        StringBuilder sb = new StringBuilder();
        if (treeNode == null) {
           return "#!";
        } else {
            sb.append(treeNode.value +"!");
        }
        sb.append(serialByPre(treeNode.left));
        sb.append(serialByPre(treeNode.right));
        return sb.toString();
    }

    public static TreeNode reconByPreString(String str) {
        Queue<String> queue = new LinkedList<>();
        String[] arr = str.split("!");
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
        return reconPreOrder(queue);
    }

    public static TreeNode reconPreOrder(Queue<String> queue) {
        String str = queue.poll();
        if (str.equals("#") ) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(str));
        node.left = reconPreOrder(queue);
        node.right = reconPreOrder(queue);
        return node;
    }

    public static String serialByLevel(TreeNode treeNode) {
        if (treeNode == null) {
            return "#!";
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(treeNode);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp != null) {
                sb.append(temp.value + "!");
                if (temp.left != null) {
                    queue.offer(temp.left);
                } else {
                    queue.offer(null);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                } else {
                    queue.offer(null);
                }
            } else {
                sb.append("#!");
            }
        }
        return sb.toString();
    }

    public static TreeNode reconByLevelString (String str) {
        String[] arr = str.split("!");
        int index = 0;
        TreeNode head = getTreeNode(arr[index++]);
        Queue<TreeNode> queue = new LinkedList<>();
        if (head != null) {
            queue.offer(head);
        }
        TreeNode node = null;
        while (!queue.isEmpty()) {
            node = queue.poll();
            node.left = getTreeNode(arr[index++]);
            node.right = getTreeNode(arr[index++]);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return head;
    }

    public static TreeNode getTreeNode(String value) {
        if (value.equals("#")) {
            return null;
        }
        return new TreeNode(Integer.valueOf(value));
    }

    public static void printTree(TreeNode head) {
        System.out.println("Binary Tree:");
        printInOrder(head, 0, "H", 17);
        System.out.println();
    }

    public static void printInOrder(TreeNode head, int height, String to, int len) {
        if (head == null) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.value + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(head.left, height + 1, "^", len);
    }


    public static String getSpace(int num) {
        String space = " ";
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < num; i++) {
            buf.append(space);
        }
        return buf.toString();
    }

}
