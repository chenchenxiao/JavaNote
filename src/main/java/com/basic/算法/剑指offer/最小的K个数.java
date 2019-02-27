package com.basic.算法.剑指offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Blse
 * @date 2018/12/22
 * @description    最佳的解法是用堆排序
 */
public class 最小的K个数 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (k == 0 || k > arr.length) {
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < arr.length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(arr[i]);
            } else if (arr[i] < maxHeap.peek()) {
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.offer(arr[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;
    }

}
