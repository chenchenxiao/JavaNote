package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/27
 * @description 给定一个数，将链表划分为三部分
 */
public class 划分链表 {


    public static void main(String[] args) {
        Node head1 = new Node(7);
        head1.next = new Node(9);
        head1.next.next = new Node(1);
        head1.next.next.next = new Node(8);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(2);
        head1.next.next.next.next.next.next = new Node(5);
        printLinkedList(head1);
        // head1 = listPartition1(head1, 4);
        head1 = listPartition(head1, 5);
        printLinkedList(head1);

    }

    public static Node listPartition(Node node, int val) {
        //分别表示对应部分的头结点和当前节点
        Node less = null;
        Node lessHead = null;
        Node equal = null;
        Node equalHead = null;
        Node more = null;
        Node moreHead = null;
        //将节点添加到对应部分
        while (node != null) {
            if (node.value < val) {
                if (less == null) {
                    less = node;
                    lessHead = less;
                } else {
                    less.next = node;
                    less = less.next;
                }
            } else if (node.value > val) {
                if (more == null) {
                    more = node;
                    moreHead = more;
                } else {
                    more.next = node;
                    more = more.next;
                }
            } else {
                if (equal == null) {
                    equal = node;
                    equalHead = equal;
                } else {
                    equal.next = node;
                    equal = equal.next;
                }
            }
            node = node.next;
        }
        less.next = null;
        more.next = null;
        equal.next = null;
        //将各部分节点相连接
        if (equalHead != null) {
            less.next = equalHead;
            if (moreHead != null) {
                equal.next = moreHead;
            }
        } else if (moreHead != null) {
            less.next = moreHead;
        }
        return lessHead != null ? lessHead : less.next;
    }

    public static void printLinkedList(Node node) {
        System.out.print("Linked List: ");
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

}
