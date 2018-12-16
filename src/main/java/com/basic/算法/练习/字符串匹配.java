package com.basic.算法.练习;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/10/25 3 6   2 7
 * @description 11111111  8
 */
public class 字符串匹配 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();
        int lengthA = strA.length();
        int lengthB = strB.length();
        int num = lengthA - lengthB + 1;
        char[] array = strB.toCharArray();
        int count = 0;
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            String temp = strA.substring(i, lengthB + i);
            if (map.get(temp) == null) {
                map.put(temp,temp);
                char[] arrs = temp.toCharArray();
                boolean flag = true;
                for (int j = 0; j < lengthB; j++) {
                    if (flag) {
                        if (array[j] != arrs[j] && array[j] != '?') {
                            flag = false;
                        }
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
