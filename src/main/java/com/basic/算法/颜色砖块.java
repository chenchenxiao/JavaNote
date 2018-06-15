package com.basic.算法;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/5/5
 * @description
 */
public class 颜色砖块 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        // 用hashSet记录字符串中有几种字符
//        HashSet<String> hashSet = new HashSet<>();
        HashMap<String,String> hashMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
//            hashSet.add(string.substring(i, i + 1));
            String str = string.substring(i, i + 1);
            hashMap.put(str,str);
            // 如果一旦有两种以上的字符就输出0
//            if (hashSet.size() > 2) {
//                System.out.println(0);
//                return;
//            }
            if (hashMap.size() > 2) {
                System.out.println(0);
                return;
            }
        }
        // 有两种字符就输出2，有一种字符就输出1
        System.out.println(hashMap.size());
    }
}
