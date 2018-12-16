package com.basic.算法.左程云算法.基础二;

import java.util.HashMap;

/**
 * @author Blse
 * @date 2018/11/27
 * @description
 */
public class 拷贝特殊链表 {

    public static void main(String[] args) {
        Node head = null;
        Node res1 = null;
        Node res2 = null;
//        printRandLinkedList(head);
//        res1 = copyListWithRand1(head);
//        printRandLinkedList(res1);
//        res2 = copyListWithRand2(head);
//        printRandLinkedList(res2);
//        printRandLinkedList(head);
//        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head.rand = head.next.next.next.next.next; // 1 -> 6
        head.next.rand = head.next.next.next.next.next; // 2 -> 6
        head.next.next.rand = head.next.next.next.next; // 3 -> 5
        head.next.next.next.rand = head.next.next; // 4 -> 3
        head.next.next.next.next.rand = null; // 5 -> null
        head.next.next.next.next.next.rand = head.next.next.next; // 6 -> 4

//        printRandLinkedList(head);
//        res1 = copyListWithRand1(head);
//        printRandLinkedList(res1);
        res2 = copyListWithRand2(head);
        printRandLinkedList(res2);
        printRandLinkedList(head);
        System.out.println("=========================");
    }

    //需要借用HashMap
    public static Node copyListWithRand1(Node node) {
        if (node == null) {
            return null;
        } else if (node.next == null) {
            return new Node(node.value);
        }
        Node head = node;
        HashMap<Node, Node> map = new HashMap<>();
        while (head != null) {
            map.put(head, new Node(head.value));
            head = head.next;
        }
        head = node;
        while (head != null) {
            map.get(head).rand = map.get(head.rand);
            map.get(head).next = map.get(head.next);
            head = head.next;
        }
        return map.get(node);
    }


    public static Node copyListWithRand2(Node node) {
        if (node == null) {
            return null;
        }
        Node head = node;
        //在每个节点后面连接当前节点的复制
        while (head != null) {
            Node temp = head.next;
            head.next = new Node(head.value);
            head.next.next = temp;
            head = temp;
        }
        //设置复制节点的rand节点
        head = node;
        while (head != null) {
            Node temp = head.next;
            temp.rand = head.rand == null ? null : head.rand.next;
            head = temp.next;
        }
        //重新设置链表，把复制好的节点取出来
        head = node;
        Node res = head.next;   //复制好的节点的头结点
        Node resHead = head.next;
        while (head != null) {
            head.next = res.next;
            head = head.next;
            res.next = head != null ? head.next : null;
            res = res.next;
        }
        return resHead;
    }

    public static void printRandLinkedList(Node head) {
        Node cur = head;
        System.out.print("order: ");
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
        cur = head;
        System.out.print("rand:  ");
        while (cur != null) {
            System.out.print(cur.rand == null ? "- " : cur.rand.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static class Node{
        public Node next;
        public int value;
        public Node rand;

        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getRand() {
            return rand;
        }

        public void setRand(Node rand) {
            this.rand = rand;
        }
    }
}
