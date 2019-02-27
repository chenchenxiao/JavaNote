package com.basic.算法.剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/12/19
 * @description
 */
public class 二叉树中和为某一值的路径 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(12);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        FindPath(node1, 22);
        System.out.println();
    }


    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        if (root == null || target == 0) {
            return result;
        }
        proccess(result,new ArrayList<>(), 0, root, target);
        return result;
    }

    public static void proccess(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int val, TreeNode node, int target) {
        //用来保存节点的位置
        val += node.val;
        list.add(node.val);
        ArrayList right = new ArrayList();
        right.addAll(list);
        //是否到达路径的叶节点，如果是就添加
        if (val == target && node.left == null && node.right == null) {
            result.add(list);
        } else {
            if (node.left != null) {
                proccess(result, list, val, node.left, target);
            }
            if (node.right != null) {
                proccess(result, right, val, node.right, target);
            }
        }
    }


}
