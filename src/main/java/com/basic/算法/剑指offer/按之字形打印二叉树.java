package com.basic.算法.剑指offer;

import com.basic.设计模式.A;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Blse
 * @date 2019/2/26
 * @description
 */
public class 按之字形打印二叉树 {

    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        if (pRoot == null) {
            return result;
        }
        Stack<TreeNode> stackA = new Stack<TreeNode>();
        Stack<TreeNode> stackB = new Stack<TreeNode>();
        boolean isA = true;
        stackA.push(pRoot);
        while (!stackA.isEmpty() || !stackB.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            if (isA) {
                while (!stackA.isEmpty()) {
                    TreeNode temp = stackA.pop();
                    list.add(temp.val);
                    if (temp.left != null) {
                        stackB.push(temp.left );
                    }
                    if (temp.right != null) {
                        stackB.push(temp.right);
                    }
                }
                isA = false;
            } else {
                while (!stackB.isEmpty()) {
                    TreeNode temp = stackB.pop();
                    list.add(temp.val);
                    if (temp.right != null) {
                        stackA.push(temp.right);
                    }
                    if (temp.left != null) {
                        stackA.push(temp.left );
                    }
                }
                isA = true;
            }
            result.add(list);
        }
        return result;
    }


    public ArrayList<ArrayList<Integer>> PrintB(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(pRoot.val);
        if (pRoot.left != null) {
            stack.push(pRoot.left);
        }
        if (pRoot.right != null) {
            stack.push(pRoot.right);
        }
        proccess(result, true, stack);
        return result;
    }

    public void proccess(ArrayList<ArrayList<Integer>> result, boolean flag, Stack<TreeNode> stack) {
        Stack<TreeNode> newStack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (flag) {
                if (node.right != null) {
                    newStack.push(node.right);
                }
                if (node.left != null) {
                    newStack.push(node.left);
                }
            } else {
                if (node.left != null) {
                    newStack.push(node.left);
                }
                if (node.right != null) {
                    newStack.push(node.right);
                }
            }
        }
        proccess(result, !flag, newStack);
    }

}
