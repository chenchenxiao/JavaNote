package com.basic.算法.左程云算法.基础二;

/**
 * @author Blse
 * @date 2018/11/26
 * @description
 */
public class DoubleNode{
    public int value;
    public DoubleNode pre;
    public DoubleNode next;

    public DoubleNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoubleNode getPre() {
        return pre;
    }

    public void setPre(DoubleNode pre) {
        this.pre = pre;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
}
