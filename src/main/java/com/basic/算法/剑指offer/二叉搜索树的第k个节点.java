package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/26
 * @description
 */
public class 二叉搜索树的第k个节点 {

    int index = 0;

    public TreeNode KthNode(TreeNode pNode, int k) {
        if (pNode != null) {
            TreeNode node = KthNode(pNode.left, k);
            if (node != null) {
                return node;
            }
            index++;
            if (k == index) {
                return pNode;
            }
            node = KthNode(node.right, k);
            if (node != null) {
                return node;
            }
        }
        return null;
    }
}
