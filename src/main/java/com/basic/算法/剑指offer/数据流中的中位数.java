package com.basic.算法.剑指offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Blse
 * @date 2019/2/27
 * @description
 */
public class 数据流中的中位数 {



    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    private int count = 0;

    public void Insert(Integer num) {
        if (count % 2 == 0) {
            maxHeap.offer(num);
            int val = maxHeap.poll();
            minHeap.offer(val);
        } else {
            minHeap.offer(num);
            int val = minHeap.poll();
            maxHeap.offer(val);
        }
        count++;
    }

    public Double GetMedian() {
        if (count % 2 != 0) {
            return Double.valueOf(maxHeap.poll());
        } else {
            return Double.valueOf((minHeap.peek() + maxHeap.peek())) / 2;
        }

    }

}
