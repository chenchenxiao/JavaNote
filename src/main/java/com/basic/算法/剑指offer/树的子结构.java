package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/17
 * @description
 */
public class 树的子结构 {

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2 == null || root1 == null) {
            return false;
        }
        boolean result = false;
        if (root1.val == root2.val) {
            result = isHasTree(root1, root2);
        }
        if (!result) {
            result = HasSubtree(root1.left, root2);
        }
        if (!result) {
            result = HasSubtree(root1.right, root2);
        }
        return result;

    }

    public boolean isHasTree(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return true;
        }
        if (node1 == null) {
            return false;
        }
        if (node1.val == node2.val) {
            return isHasTree(node1.left, node2.left) && isHasTree(node1.right, node2.right);
        } else {
            return false;
        }

    }

}
