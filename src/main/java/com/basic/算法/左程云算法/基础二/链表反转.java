package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/25
 * @description
 */
public class 链表反转 {

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        printLinkedList(head1);
        head1 = reverseList(head1);
        printLinkedList(head1);

        DoubleNode head2 = new DoubleNode(1);
        head2.next = new DoubleNode(2);
        head2.next.pre = head2;
        head2.next.next = new DoubleNode(3);
        head2.next.next.pre = head2.next;
        head2.next.next.next = new DoubleNode(4);
        head2.next.next.next.pre = head2.next.next;
        printDoubleLinkedList(head2);
        printDoubleLinkedList(reverseList(head2));

    }


    /**
     * 反转单向链表
     * @param node
     * @return
     */
    public static Node reverseList(Node node) {
        Node next = null;
        Node head = node;
        while (node != null) {
            //链表向后移动，保存链表位置
            node = node.next;
            //指定后续next节点，为head，也就是 2 - 1
            head.next = next;
            //让next等于head
            next = head;
            //head等于下一个节点
            head = node;
        }
        return next;
    }

    /**
     * 反转双向链表
     * @param node
     * @return
     */
    public static DoubleNode reverseList(DoubleNode node) {
        DoubleNode next = null;
        DoubleNode head = node;
        while (node != null) {
            node = node.next;
            head.next = next;
            head.pre = node;
            next = head;
            head = node;
        }
        return next;
    }

    public static void printLinkedList(Node head) {
        System.out.print("Linked List: ");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void printDoubleLinkedList(DoubleNode head) {
        System.out.print("Double Linked List: ");
        DoubleNode end = null;
        while (head != null) {
            System.out.print(head.value + " ");
            end = head;
            head = head.next;
        }
        System.out.print("| ");
        while (end != null) {
            System.out.print(end.value + " ");
            end = end.pre;
        }
        System.out.println();
    }

}

