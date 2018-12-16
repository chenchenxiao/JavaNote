package com.basic.算法.左程云算法.基础三;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Blse
 * @date 2018/12/12
 * @description
 */
public class 切金条 {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30};
        System.out.println(golden(arr));

        int[] arrForHeap = { 3, 5, 2, 7, 0, 1, 6, 4 };
// min heap use Comparator
        PriorityQueue<Integer> minQ2 = new PriorityQueue<>(new minComparatir());
        for (int i = 0; i < arrForHeap.length; i++) {
            minQ2.add(arrForHeap[i]);
        }
        while (!minQ2.isEmpty()) {
            System.out.print(minQ2.poll() + " ");
        }
        System.out.println();
    }

    public static int golden(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        int sum = 0;
        int result = 0;
        while (queue.size() != 1) {
            sum = queue.poll() + queue.poll();
            result += sum;
            queue.add(sum);
        }
        return result;
    }

    public static class minComparatir implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    public static class MaxComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }


}
