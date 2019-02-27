package com.basic.算法.剑指offer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author Blse
 * @date 2018/12/18
 * @description 即层次遍历
 */
public class 从上往下打印二叉树 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);
        //要获取的二叉树节点的下标
        int index = 0;
        TreeNode node = null;
        //判断下标数是否大于集合长度，如果大于表示已经到达集合最后了，这里不用remove方法是因为每次remove都回重新拷贝集合，浪费时间
        while (list.size() > index) {
            node = list.get(index);
            result.add(node.val);
            index++;
            if (node.left != null) {
                list.add(node.left);
            }
            if (node.right != null) {
                list.add(node.right);
            }
        }
        return result;
    }

}
