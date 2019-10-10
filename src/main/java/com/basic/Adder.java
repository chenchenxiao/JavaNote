package com.basic;

import java.util.Scanner;

public class Adder {
    private static String add(String num1, String num2) {
        char[] charsA = num1.toCharArray();
        char[] charsB = num2.toCharArray();
        int lengthA = charsA.length;
        int lengthB = charsB.length;
        //比较长度
        int val = lengthA - lengthB;
        String sb = "";
        if (val >= 0) {
            for (int i = 0; i < lengthA; i++) {
                if (val > 0) {
                    sb += charsA[i] - 48;
                    val--;
                } else {
                    int a = charsA[i] - 48;
                    int b = charsB[i] - 48;
                    if (a == -2) {
                        sb += ".";
                    } else {
                        int temp = a + b;
                        //判断是否相加大于10
                        if (a > 0 && temp == 10) {
                            int numT = temp / 10;
                            int numY = temp % 10;
                            judge(sb, numT, i - 1);
                            sb += numY;
                        }
                        sb += temp;
                    }
                }
            }
        }
        return sb.toString();
    }


    private static String judge(String sb, int numT, int index) {
        char[] chs = sb.toCharArray();
        int val = chs[index] - 48;
        int temp = val + numT;
        if (temp > 10) {
            chs[index] = (char) ((temp % 10) + 48);
        }
        return null;
    }

    // please don't modify any code below.
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String num1 = sc.nextLine();
//        String num2 = sc.nextLine();
//
//        String sum = add(num1, num2);
//
//
//        System.out.println(sum);
        int a = 4;
        char b = (char)a;
        System.out.println("111" + b);
    }
}