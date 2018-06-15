package com.basic.算法.线性表;

/**
 * @author Blse
 * @date 2018/2/23
 * @description
 */
public class SingleTable {
     Node head = null;

    public static void main(String[] args) {
        SingleTable singleTable = new SingleTable();
        for (int i = 1; i < 50; i++) {
            singleTable.addNode(new Node(i));
        }
        singleTable.removeNode(50);
        singleTable.printNode();
    }


    /**
     * 添加节点操作
     */
    public  void addNode(Node nod) {
        Node temp = head;
        //如果当前链表的头结点为空，则新增节点为头节点
        if (head == null) {
            head = nod;
            return;
        }
        //遍历找到链表的最后一个节点
        while (temp.next != null) {
            temp = temp.next;
        }
        //把新增节点添加到链表尾部
        temp.next = nod;
    }

    /**
     * 删除节点操作
     * i表示要删除的节点的位置
     */
    public void removeNode(int i) {
        if (i == 1) {
            head = head.next;
            return;
        }
        //记录在链表的位置
       int num = 1;
       Node no = head;
       //遍历链表
       while (no.next != null) {
           //如果当前位置等于要删除的位置
           //i - 1，因为节点是当前节点的后继节点，例如，i=2，如果不减一，那么no.next就是第三个节点，no.next.next就是第四个节点
           //就会变成第二个节点的后继节点变成第四个节点
           if (num == i - 1) {
               //令当前节点的后继节点等于其后继节点的后继节点
               no.next = no.next.next;
               return;
           }
           //另当前节点等于其后继节点
           no = no.next;
           //位置向后移动
           num++;
       }
    }



    /**
     * 链表的长度
     * @return
     */
    public int size() {
       int i = 0;
       //当前节点不为空，即还没到链表尾部时，遍历
       while (head != null) {
           //另当前节点等于它的后继节点
           head = head.next;
           i++;
       }
       return i;
    }

    /**
     * 遍历打印链表
     */
    public void printNode() {
        //当前链表还没到达链表尾部时
        while(head.next != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}


