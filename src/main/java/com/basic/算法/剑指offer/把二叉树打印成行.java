package com.basic.算法.剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Blse
 * @date 2019/2/26
 * @description
 */
public class 把二叉树打印成行 {

    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        if (pRoot == null) {
            return result;
        }
        boolean isA = true;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        LinkedList<TreeNode> list2 = new LinkedList<TreeNode>();
        list.add(pRoot);
        while (!list.isEmpty() || !list2.isEmpty()) {
            ArrayList<Integer> tempList = new ArrayList();
            if (!list.isEmpty()) {
                while(!list.isEmpty()) {
                    TreeNode temp = list.remove();
                    tempList.add(temp.val);
                    if (temp.left != null) {
                        list2.add(temp.left);
                    }
                    if (temp.right != null) {
                        list2.add(temp.right);
                    }
                }
            } else if (!list2.isEmpty()) {
                while (!list2.isEmpty()) {
                    TreeNode temp = list2.remove();
                    tempList.add(temp.val);
                    if (temp.left != null) {
                        list.add(temp.left);
                    }
                    if (temp.right != null) {
                        list.add(temp.right);
                    }
                }
            }
            result.add(tempList);
        }
        return result;
    }

}
