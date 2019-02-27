package com.basic.算法.剑指offer;

import java.util.Stack;

/**
 * @author Blse
 * @date 2018/12/18
 * @description
 */
public class 包含main函数的栈 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.add(node);
        if (stack2.isEmpty()) {
            stack2.add(node);
        } else {
            int val = stack2.peek();
            if (node < val) {
                stack2.add(node);
            } else {
                stack2.add(val);
            }
        }

    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }

}
