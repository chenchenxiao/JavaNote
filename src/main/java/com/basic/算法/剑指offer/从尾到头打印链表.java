package com.basic.算法.剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Blse
 * @date 2018/12/16
 * @description 非递归：把链表的所有元素存到栈，再把栈中的元素存到集合即可
 *               递归：递归把节点元素添加到集合中
 */
public class 从尾到头打印链表 {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public void proccess2(ArrayList list, ListNode node) {
        if (node != null) {
            proccess2(list, node.next);
            list.add(node.val);
        }
    }


}
