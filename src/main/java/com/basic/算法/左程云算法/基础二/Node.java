package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/26
 * @description
 */
public class Node{
    public int value;
    public Node next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int value) {
        this.value = value;
    }
}

