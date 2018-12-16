package com.basic.算法.左程云算法.基础二;

import java.util.Stack;

/**
 * @author Blse
 * @date 2018/11/26
 * @description
 */
public class 回文链表 {

    public static void main(String[] args) {
        Node head = null;
//        printLinkedList(head);
////        System.out.print(isPalindrome1(head) + " | ");
////        System.out.print(isPalindrome2(head) + " | ");
//        System.out.println(isPalindrome3(head) + " | ");
//        printLinkedList(head);
//        System.out.println("=========================");
//
//        head = new Node(1);
//        printLinkedList(head);
////        System.out.print(isPalindrome1(head) + " | ");
////        System.out.print(isPalindrome2(head) + " | ");
//        System.out.println(isPalindrome3(head) + " | ");
//        printLinkedList(head);
//        System.out.println("=========================");
//
//        head = new Node(1);
//        head.next = new Node(2);
//        printLinkedList(head);
////        System.out.print(isPalindrome1(head) + " | ");
////        System.out.print(isPalindrome2(head) + " | ");
//        System.out.println(isPalindrome3(head) + " | ");
//        printLinkedList(head);
//        System.out.println("=========================");
//
//        head = new Node(1);
//        head.next = new Node(1);
//        printLinkedList(head);
////        System.out.print(isPalindrome1(head) + " | ");
////        System.out.print(isPalindrome2(head) + " | ");
//        System.out.println(isPalindrome3(head) + " | ");
//        printLinkedList(head);
//        System.out.println("=========================");
//
//        head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        printLinkedList(head);
////        System.out.print(isPalindrome1(head) + " | ");
////        System.out.print(isPalindrome2(head) + " | ");
//        System.out.println(isPalindrome3(head) + " | ");
//        printLinkedList(head);
//        System.out.println("=========================");
//
//        head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(1);
//        printLinkedList(head);
////        System.out.print(isPalindrome1(head) + " | ");
////        System.out.print(isPalindrome2(head) + " | ");
//        System.out.println(isPalindrome3(head) + " | ");
//        printLinkedList(head);
//        System.out.println("=========================");
//
//        head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(1);
//        printLinkedList(head);
////        System.out.print(isPalindrome1(head) + " | ");
////        System.out.print(isPalindrome2(head) + " | ");
//        System.out.println(isPalindrome3(head) + " | ");
//        printLinkedList(head);
//        System.out.println("=========================");
//
//        head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(2);
//        head.next.next.next = new Node(1);
//        printLinkedList(head);
//        System.out.print(isPalindrome1(head) + " | ");
//        System.out.print(isPalindrome2(head) + " | ");
//        System.out.println(isPalindrome3(head) + " | ");
//        printLinkedList(head);
//        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");
    }

    /**
     * 需要一个大小为N的额外空间
     * @param node
     * @return
     */
    public static boolean isPalindrome1(Node node) {
        Stack<Node> stack = new Stack<>();
        Node head = node;
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            if (stack.pop().value == node.value) {
                node = node.next;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * 需要 n / 2 个空间,当快指针到达末尾时，慢指针刚好走了一半的路程，所以是 n / 2
     * @param node
     * @return  1 2 3 2 1
     */
    public static boolean isPalindrome2(Node node) {
        if (node == null || node.next == null) {
            return true;
        }
        Node right = node.next;  //慢指针
        Node head = node;   //快指针
        while (head.next != null && head.next.next != null ) {
            right = right.next;
            head = head.next.next;
        }
        Stack<Node> stack = new Stack<>();
        while (right != null) {
            stack.push(right);
            right = right.next;
        }
        while (!stack.isEmpty()) {
            if (node.value != stack.pop().value) {
                return false;
            }
            node = node.next;
        }
        return true;
    }


    public static boolean isPalindrome3(Node node) {
        if (node == null || node.next == null) {
            return true;
        }
        Node n1 = node; //慢指针
        Node n2 = node; //快指针
        while (n2.next != null && n2.next.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = n1.next; //得到中间节点的下一节点
        n1.next = null; //快指针末尾设为空
        Node n3 = null;
        //将后部分节点逆着来
        while (n2 != null) {
            n3 = n2.next; //将后续节点指向前一个节点
            n2.next = n1;   //n1等于前面的节点
            n1 = n2;
            n2 = n3;
        }
        n3 = n1;
        n2 = node;  //另此时快指针是空的，另它等于头结点
        //判断是否为回文链表
        while (n1 != null && n2 != null) {
            if (n2.value != n1.value) {
                return false;
            }
            n2 = n2.next;
            n1 = n1.next;
        }
        //下面的代码是将原本逆着的链表还原
        n1 = n3.next;
        n3.next = null;
        while (n1 != null) { // recover list
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
        }
        return true;
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
