package com.basic.算法.剑指offer;

import java.util.Stack;

/**
 * @author Blse
 * @date 2018/12/16
 * @description
 */
public class 两个栈实现队列 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.add(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.add(stack1.pop());
        }
        int result = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.add(stack2.pop());
        }
        return result;
    }

}
