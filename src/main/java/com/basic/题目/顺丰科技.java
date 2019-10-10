package com.basic.题目;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2019/8/29
 * @description 某学术会议上，一共有n个人参加，现在已知每个人会的语言（一个人可能不会任何语言）。
 * 现在有一种学习机，每一个学习机可以在会议期间使一个人暂时掌握一种自己不会的语言，
 * 问要使得任意两人都要能直接或者间接的交流至少准备多少个学习机？
 * 间接交流的意思是：可以通过其他参加会议的人翻译（可能或出现很多人一起帮忙翻译的情况）进行交流。
 * 如：第一个人和第二个人会第一种语言，第二个人和第三个人会第二种语言，那么第一个人可以和第三个人进行交流（通过第二个人的翻译）
 *
 * 第一行3个数n,m,k代表人数，语言数，已知的信息数 接下来k行，每行两个数u,v，代表u第个人会第v种语言
 * 输出需要准备的学习机的个数
 *
 * 3 3 2
 * 2 3
 * 3 1
 *
 * 2
 */
public class 顺丰科技 {

    public static void main(String[] args) {

    }

    public static int 学术交流() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arrs = new int[k][2];
        for (int i = 0; i < k; i++) {
            arrs[i][0] = sc.nextInt();
            arrs[i][1] = sc.nextInt();
        }
        return 0;
    }

}
