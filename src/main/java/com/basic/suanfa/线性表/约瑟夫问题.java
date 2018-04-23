package com.basic.suanfa.线性表;

/**
 * @author Blse
 * @date 2018/2/24
 * @description
 */
public class 约瑟夫问题 {
    static Node head = null;
    public static void main(String[] args) {
        init();
        game();
    }

    /**
     * 初始化链表
     */
    public static void init() {
        for (int i = 1; i <= 41; i++) {
            if (head == null) {
                head = new Node(i);
                continue;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(i);
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
    }


    public static void game() {
        int num = 1;
        Node temp = head;
        //当前链表非空
        while (temp != temp.next) {
            num++;
            if (num == 3) {
                System.out.print(temp.next.data + " ");
                temp.next = temp.next.next;
                num = 0;
                continue;
            }
            temp = temp.next;
        }

    }


}
