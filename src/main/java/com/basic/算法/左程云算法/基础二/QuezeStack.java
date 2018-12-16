package com.basic.算法.左程云算法.基础二;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Blse
 * @date 2018/11/22
 * @description
 */
public class QuezeStack {

    public static void main(String[] args) throws Exception {
       StackToQueue queue = new StackToQueue();
       queue.add(1);
       queue.add(2);
       queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

}

class QuezeToStack{
    private Queue<Integer> data;
    private Queue<Integer> help;

    public QuezeToStack() {
        data = new LinkedList<>();
        help = new LinkedList<>();
    }

    public void push(int val) {
        data.add(val);
    }

    public int pop() throws Exception {
        if (data.isEmpty()) {
            throw new Exception("栈为空");
        }
        while (data.size() > 1) {
            int temp = data.poll();
            help.add(temp);
        }
        int result = data.poll();
        swap();
        return result;
    }

    public void swap() {
        Queue temp = data;
        data = help;
        help = temp;
    }
}

class StackToQueue{
    private Stack<Integer> data;
    private Stack<Integer> help;

    public StackToQueue() {
        data = new Stack<>();
        help = new Stack<>();
    }

    public void add(int val) {
        data.push(val);
    }
//1 2 3 4 5
    // 5 4 3 2 1
    public int poll() throws Exception {
        if (data.isEmpty()) {
            throw new Exception("栈为空");
        }
        while (data.size() > 1) {
            help.push(data.pop());
        }
        int result = data.pop();
        while (help.size() > 0) {
            data.push(help.pop());
        }
        return result;
    }

}