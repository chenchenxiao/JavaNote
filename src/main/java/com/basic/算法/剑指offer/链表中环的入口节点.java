package com.basic.算法.剑指offer;

import java.util.logging.Handler;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 链表中环的入口节点 {
        // 1 2 3 4 5 1 2 3 4 5
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                p1 = pHead;
                while (p1 != p2) {
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if (p1 == p2) {
                    return p1;
                }
            }
        }
        return null;
    }

}
