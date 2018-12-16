package com.basic.算法.左程云算法.基础三;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Blse
 * @date 2018/12/12
 * @description 一个项目花费cost，收益profit，只能做k个，求最大能赚多少
 */
public class 最大钱数 {

    public static void main(String[] args) {

    }

    public static class Node{
        public int p;
        public int c;

        public Node(int p, int c) {
            this.p = p;
            this.c = c;
        }
    }

    public static int getMoney(int[] profits, int[] costs, int k, int m) {
        if (profits == null || costs == null || profits.length == 0 || costs.length == 0) {
            return 0;
        }
        int result = m;
        Node[] nodes = new Node[profits.length];
        for (int i = 0; i < profits.length; i++) {
            nodes[i] = new Node(profits[i], costs[i]);
        }
        PriorityQueue<Node> minCostQueue = new PriorityQueue<>(new MinCostComparator());
        PriorityQueue<Node> maxProfitQueue = new PriorityQueue<>(new MaxProfitComparator());
        for (int i = 0; i < nodes.length; i++) {
            minCostQueue.add(nodes[i]);
        }
        for (int i = 0; i < k; i++) {
            while (!minCostQueue.isEmpty() && minCostQueue.peek().c <= result) {
                maxProfitQueue.add(minCostQueue.poll());
            }
            if (maxProfitQueue.isEmpty()) {
                return result;
            }
            result += maxProfitQueue.poll().p;
        }
        return result;
    }

    public static class MinCostComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o1.c - o2.c;
        }

    }

    public static class MaxProfitComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o2.p - o1.p;
        }

    }

}
