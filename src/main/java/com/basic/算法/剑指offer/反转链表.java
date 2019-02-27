package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/17
 * @description
 */
public class 反转链表 {

    public ListNode ReverseList(ListNode head) {
        ListNode node = head;
        ListNode result = null;
        while (node != null) {
           ListNode temp = node.next;
           node.next = result;
           result = node;
           node = temp;
        }
        return result;
    }

}
