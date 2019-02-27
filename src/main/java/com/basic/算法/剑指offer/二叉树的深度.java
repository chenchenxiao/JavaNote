package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/24
 * @description
 */
public class 二叉树的深度 {

    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }

}
