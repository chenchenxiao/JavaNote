package com.basic.算法.剑指offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Blse
 * @date 2018/12/20
 * @description
 */
public class 字符串的排列 {

    public static void main(String[] args) {
        ArrayList<String> result = Permutation("abc");
        System.out.println();
    }

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || "".equals(str)) {
            return list;
        }
        func(list, 0, str.toCharArray());
        Collections.sort(list);
        return list;
    }

    public static void func(ArrayList<String> list, int i, char[] arr) {
        if (i == arr.length && !list.contains(String.valueOf(arr))) {
            list.add(String.valueOf(arr));
        }
        for (int j = i; j < arr.length; j++) {
            swap(arr, i, j);
            func(list, i + 1, arr);
            swap(arr, i, j);
        }
    }

    public static void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }

}
