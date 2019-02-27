package com.basic.算法.剑指offer;

import java.util.Stack;

/**
 * @author Blse
 * @date 2018/12/18
 * @description
 */
public class 栈的压入和弹出序列 {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0) {
            return false;
        }
        int length = popA.length;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

}
