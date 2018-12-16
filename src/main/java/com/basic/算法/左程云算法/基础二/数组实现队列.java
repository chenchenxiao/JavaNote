package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/21
 * @description
 */
public class 数组实现队列 {

    public static void main(String[] args) {
        ArrayQueze queze = new ArrayQueze();
        try {
            queze.push(1);
            queze.push(2);
            queze.push(34);
            queze.push(34);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

class ArrayQueze {
    private int start;
    private int index;
    private int num;
    private int[] arr = new int[3];
    // 1 2 3
    public int peek() throws Exception {
        if (num == 0) {
            throw new Exception("队列中没有元素");
        }
        int val = arr[start];
        start = start > arr.length - 1 ? 0 : start++;
        num--;
        return val;
    }

    public void push(int val) throws Exception {
        if (index > arr.length - 1) {
            throw new Exception("队列已经满了");
        }
        arr[index++] = val;
        num++;
    }

}
