package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/21
 * @description
 */
public class 数组栈取最小数 {

    public static void main(String[] args) throws Exception {
        MinValueStack stack = new MinValueStack(5);
        stack.push(4);
        stack.push(5);
        stack.push(3);
        stack.push(2);
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.getMinValue());
    }

}

class MinValueStack{
    private int size;
    private int[] arr;
    private int[] minArr;
    int min = Integer.MAX_VALUE;

    public MinValueStack(int initSize) {
        arr = new int[initSize];
        minArr = new int[initSize];
    }

    public void push(int val) throws Exception {
        if (size == arr.length) {
            throw new Exception("栈已经满了");
        }
        if (min > val) {
            minArr[size] = val;
            min = val;
        } else {
            minArr[size] = min;
        }
        arr[size++] = val;
    }

    public int peek() throws Exception {
        if (size == 0) {
            throw new Exception("栈为空");
        }
        return arr[--size];
    }

    public int getMinValue() {
        return minArr[size - 1];
    }

}