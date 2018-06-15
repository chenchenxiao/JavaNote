package com.basic.算法;

/**
 * @author Blse
 * @date 2018/3/29
 * @description
 */
public class AddTwoNum {

    public static void main(String[] args) {
//        ListNode listNode = new ListNode(2);
//        ListNode listNode1 = new ListNode(4);
//        ListNode listNode2 = new ListNode(3);
//        ListNode listNode3 = new ListNode(4);
//        listNode.next = listNode1;
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        System.out.println(getNum(listNode));
        System.out.println();

    }

    public int addTwoNum(ListNode listNodeA, ListNode listNodeB) {
        int resA = getNum(listNodeA);
        int resB = getNum(listNodeB);
        int numRes = resA + resB;
        int result = 0;
        while(listNodeA != null || listNodeB != null) {
            if (listNodeA.next != null) {
                result = result * 10 + listNodeA.val * 10 ;
            }else {
                result = result + listNodeA.val;
            }
            listNodeA = listNodeA.next;
        }

        return 0;
    }

    public static int getNum(ListNode listNode) {
        int result = 0;
        while(listNode != null) {
            if (listNode.next != null) {
                result = result * 10 + listNode.val * 10 ;
            }else {
                result = result + listNode.val;
            }
            listNode = listNode.next;
        }
        return result;
    }

    public static int getResult(int num) {
        int h = num / 100;

        return 0;
    }

}

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
