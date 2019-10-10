package com.basic.题目;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2019/9/4
 * @description
 */
public class 携程 {



    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
        ListNode less = null;
        ListNode large = null;
        ListNode resultHead = null;
        ListNode resultLarge = null;
        while (head != null) {
            int val = head.val;
            if (val <= m) {
                if (less == null) {
                    less = head;
                    resultHead = less;
                } else {
                    less.next = head;
                    less = head;
                }
            } else {
                if (large == null) {
                    large = head;
                    resultLarge = large;
                } else {
                    large.next = head;
                    large = head;
                }
            }
            head = head.next;
        }
        less.next = resultLarge;
        return resultHead;

    }
    /******************************结束写代码******************************/


//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        ListNode head=null;
//        ListNode node=null;
//        int m=in.nextInt();
//        while(in.hasNextInt()){
//            int v=in.nextInt();
//            if(head==null){
//                node=new ListNode(v);
//                head=node;
//            }else{
//                node.next=new ListNode(v);
//                node=node.next;
//            }
//        }
//        head= partition(head,m);
//        if(head!=null){
//            System.out.print(head.val);
//            head=head.next;
//            while(head!=null){
//                System.out.print(",");
//                System.out.print(head.val);
//                head=head.next;
//            }
//        }
//        System.out.println();
//    }


    static String resolve(String expr) {
        char[] arrs = expr.toCharArray();
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrs.length; i++) {
            char temp = arrs[i];
            if (temp == '(') {
                num++;
            } else if (temp == ')') {
                num--;
            } else {
                sb.insert(0, temp);
            }
        }

        return num == 0 ? sb.toString() : "";

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }


}
