package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2018/12/17
 * @description
 */
public class 合并两个排序的链表 {

    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        }
        if (list1.val > list2.val) {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
        return null;
    }

}
