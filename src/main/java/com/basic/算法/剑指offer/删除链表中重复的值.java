package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/26
 * @description
 */
public class 删除链表中重复的值 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(5);
//        ListNode l8 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
//        l7.next = l8;
        deleteDuplication(l1);

    }


    // 1 2 3 3 4 4 5
    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode temp = new ListNode(-1);
        temp.next = pHead;
        ListNode curNode = pHead;
        ListNode pre = temp;
        while (curNode != null && curNode.next != null) {
            ListNode next = curNode.next;
            if (curNode.val == next.val) {
                while (next != null && curNode.val == next.val) {
                    next = next.next;
                }
                pre.next = next;
                curNode = next;
            } else {
                pre = curNode;
                curNode = curNode.next;
            }
        }
        return temp.next;
    }
}
