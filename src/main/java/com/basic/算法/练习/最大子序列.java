//package com.basic.算法.练习;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
///**
// * @author Blse
// * @date 2018/10/25
// * @description
// */
//public class 最大子序列 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        HashMap<String, Integer> map = new HashMap<>();
//        char[] arrs = str.toCharArray();
//        int result = 0;
//        for (int i = 0; i < arrs.length; i++) {
//            Character cc = arrs[i];
//            Integer temp = map.get(cc);
//            if (temp == null) {
//                map.put(cc, i);
//            } else {
//                Integer val = map.get(cc);
//                int length = i - val;
//                if (result < length) {
//                    result = length;
//                }
//                map.put(String.valueOf(cc), length);
//            }
//        }
//    }
//
//}
