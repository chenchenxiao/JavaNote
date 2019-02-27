package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/25
 * @description
 */
public class 字符流中第一个不重复的字符 {

    static int[] array = new int[256];
    private static int index = 1;

    public static void main(String[] args) {
        Insert('g');
        Insert('o');
        Insert('o');
        Insert('g');
        Insert('l');
        Insert('e');
        char c = FirstAppearingOnce();
        System.out.println();
    }

    public static void Insert(char ch) {
        if (array[ch] == 0) {
            array[ch] = index++;
        } else {
            array[ch] = -1;
        }
    }

    public static char FirstAppearingOnce() {
        int temp = Integer.MAX_VALUE;
        char result = '#';
        for (int i = 0; i < 256; i++) {
            if (array[i] > 0 && array[i] < temp) {
                temp = array[i];
                result = (char) i;
            }
        }
        return result;
    }
}
