package com.basic.算法.左程云算法.基础三;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Blse
 * @date 2018/12/15
 * @description
 */
public class 最大价值 {

    public static void main(String[] args) {
        int[] w = { 1, 2, 3, 2};
        int[] v = { 4, 6, 12, 7 };
        int bag = 6;
        int func = func(w, v, bag);
        System.out.println(func);
    }


    public static int func(int[] w, int[] v, int bag) {
        Node[] nodes = new Node[w.length];
        for (int i = 0; i < v.length; i++) {
            nodes[i] = new Node(w[i], v[i]);
        }
        return getValue(nodes, bag);
    }

    public static int getValue(Node[] nodes, int bag) {
        if (nodes == null || nodes.length == 0) {
            return 0;
        }
        PriorityQueue<Node> minQueue = new PriorityQueue<>(new MinCostComparator());
        PriorityQueue<Node> maxQueue = new PriorityQueue<>(new MaxProfitComparator());
        for (int i = 0; i < nodes.length; i++) {
            minQueue.add(nodes[i]);
        }
        int result = 0;
        int heavy = 0;
        while (!minQueue.isEmpty()) {
            Node node = minQueue.peek();
            heavy += node.w;
            if (heavy < bag) {
                maxQueue.add(minQueue.poll());
            }
            if (maxQueue.isEmpty()) {
                return result;
            }
            result += maxQueue.poll().v;
        }
        return result;
    }

    public static class MinCostComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o1.w - o2.w;
        }

    }

    public static class MaxProfitComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o2.v - o1.v;
        }

    }

    public static class Node{
        public int w;
        public int v;

        public Node(int w, int v) {
            this.w = w;
            this.v = v;
        }
    }

}
