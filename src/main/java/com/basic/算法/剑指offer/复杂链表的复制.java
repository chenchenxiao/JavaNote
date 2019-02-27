package com.basic.算法.剑指offer;

import jdk.internal.org.objectweb.asm.Handle;

/**
 * @author Blse
 * @date 2018/12/20
 * @description
 */
public class 复杂链表的复制 {

    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.random = node3;
        node2.random = node5;
        node4.random = node2;
        Clone2(node1);
    }

    public static  RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        //保存头结点的值
        RandomListNode head = pHead;
        //复制节点，放在对应节点的next
        while (pHead != null) {
            RandomListNode node = new RandomListNode(pHead.label);
            RandomListNode next = pHead.next;
            pHead.next = node;
            node.next = next;
            pHead = next;
        }
        pHead = head;
        while (pHead != null) {
            pHead.next.random = pHead.random == null ? null : pHead.random.next;
            pHead = pHead.next.next;
        }
        pHead = head;
        RandomListNode resultNode = pHead.next;
        while (pHead != null) {
            RandomListNode nextNode = pHead.next.next;
            pHead.next.next = nextNode == null ? null : nextNode.next;
            pHead.next = pHead.next.next;
            pHead.next = nextNode;
            pHead = nextNode;
        }
        return resultNode;
    }


    public  static RandomListNode Clone2(RandomListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return new RandomListNode(pHead.label);
        }
        //保存头结点的值
        RandomListNode head = pHead;
        //复制节点，放在对应节点的next
        while (pHead != null) {
            RandomListNode node = new RandomListNode(pHead.label);
            RandomListNode next = pHead.next;
            pHead.next = node;
            node.next = next;
            pHead = next;
        }
        pHead = head;
        RandomListNode resultNode = pHead.next;
        while (pHead != null) {
            RandomListNode node = pHead.next.next;
            //设置复制节点的random节点
            pHead.next.random = pHead.random == null ? null : pHead.random.next;
            //复制节点重新组合一起
            pHead.next.next = node == null? null :node.next;
            //原本的节点恢复
            pHead.next = node;
            pHead = pHead.next;
        }
        return resultNode;
    }
}
