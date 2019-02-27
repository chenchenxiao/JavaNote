package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/17
 * @description 下面的解法是通过递归实现的，通过一个长度为一的数组来保存当前节点是倒数第几个，如果当前是倒数第k个时返回
 */
public class 链表中倒数第k个节点 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode result = FindKthToTail(node1, 5);
        System.out.println();
    }

    public static ListNode FindKthToTail(ListNode head,int k) {
        int[] index = {0};
        return func(head, k, index);
    }

    public static ListNode func(ListNode node, int k, int[] index) {
        if (node == null) {
            return null;
        }
        ListNode temp = func(node.next, k, index);
        if (node.next == null || index[0] > 0) {
            index[0] = index[0] + 1;
        }
        if (k == index[0]) {
            return node;
        } else {
            return temp;
        }
    }
}
