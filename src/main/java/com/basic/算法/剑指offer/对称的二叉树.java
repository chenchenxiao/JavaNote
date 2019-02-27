package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/26
 * @description
 */
public class 对称的二叉树 {

    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) {
            return true;
        }
        return proccess(pRoot.left, pRoot.right);

    }

    public boolean proccess(TreeNode left, TreeNode right) {
        if (left == null) {
            return right == null;
        }
        if (right == null) {
            return false;
        }
        return left.val == right.val && proccess(left.left, right.right) && proccess(left.right, right.left);
    }

}
