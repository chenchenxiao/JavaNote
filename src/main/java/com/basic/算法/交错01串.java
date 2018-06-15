package com.basic.算法;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/5/5
 * @description
 */
public class 交错01串 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入01串");
//        String str = in.nextLine();
//        myMethod(str);

        while (in.hasNext()) {
            String str = in.next();
            int maxLen = 1;
            int len = 1;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i - 1) != str.charAt(i)) {
                    len++;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                } else {
                    len = 1;
                }
            }
            System.out.println(maxLen);
        }

    }

    private static void myMethod(String str) {
        //取得输入的字符串的长度
        int length = str.length();
        //要比较的两个子串，每一次循环的进行比较
        String strsA = null, strsB = null;
        //begin即01串开始长度，最开始是0， end即01串结束的索引，两个值想减就是子串的长度
        // realLength即最长01串的长度
        int begin = 0, end = 0, realLength = 0;
        for (int i = 0; i < length - 1 ; i++) {
            //取得当前的子符与下一个字符进行比较
            strsA = str.substring(i, i + 1);
            strsB = str.substring(i + 1, i + 2);
            //如果两个字符相等说明要重新记录子串的开始位置和结束位置
            if (strsA.equals(strsB)) {
                //当前的索引就是子串结束的位置
                end = i;
                //比较真正01串的长度是否比当前取得的01串要小
                if (realLength < end - begin) {
                    //如果是则进行替换
                    realLength = end - begin;
                }
                //重新设置子串开始的位置
                begin = i - 1;
            }
        }
        //循环遍历结束后，把结束位置设为字符串的长度
        end = length ;
        //取得当前01串的长度
        int secLength = end - begin;
        //与之前取得的01串进行比较，得出长度大的，即最终所求结果
        realLength = realLength > secLength ? realLength : secLength;
        System.out.println("realLength" + realLength);
    }

}
