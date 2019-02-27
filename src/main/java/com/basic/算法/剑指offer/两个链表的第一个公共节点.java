package com.basic.算法.剑指offer;

import java.util.List;

/**
 * @author Blse
 * @date 2019/2/24
 * @description
 */
public class 两个链表的第一个公共节点 {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);

        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(5);

        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(7);
        node1.next = node2;
        head1.next.next.next = node1;
        head2.next.next = node1;
        ListNode listNode = FindFirstCommonNode(head1, head2);
        System.out.println(listNode);

    }

    public static ListNode FindFirstCommonNode(ListNode p1, ListNode p2) {
        if (p1 == null || p2 == null) {
            return null;
        }
        int count1 = 0;
        int count2 = 0;
        ListNode pHead1 = p1;
        ListNode pHead2 = p2;
        while (pHead1 != null) {
            pHead1 = pHead1.next;
            count1++;
        }
        while (pHead2 != null) {
            pHead2 = pHead2.next;
            count2++;
        }
        if (count2 > count1) {
            while (count2 != count1) {
                p2 = p2.next;
                count2--;
            }
        } else {
            while (count1 != count2) {
                p1 = p1.next;
                count1--;
            }
        }
        ListNode node = null;
        boolean flag = false;
        while (p1 != null && p2 != null) {
            if (p1.val == p2.val) {
                flag = true;
                if (node == null) {
                    node = p1;
                }
            } else {
                flag = false;
                node = null;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return node;
    }

}
