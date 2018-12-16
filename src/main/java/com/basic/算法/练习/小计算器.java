package com.basic.算法.练习;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/10/15
 * @description
 */
public class 小计算器 {
    static int way = 10;
    static long result = 0;
    static String opt = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for (int i = 0; i < num; i++) {
            String opt = sc.next();
            options(opt, sc);
        }
        sc.close();
    }

    public static int options(String str, Scanner sc) {
        switch (str) {
            case "CLEAR" :
                result = 0;
                break;
            case "NUM" :
                String number = sc.next();
                int val = 0;
                for (int i = 'A'; i < 'Z'; i++) {
                    if (String.valueOf((char)i).equals(number)) {
                        val = i - 55;
                        result = val;
                    }
                }
                val = Integer.parseInt(number);
                if (opt == null) {
                    result = val;
                } else {
                    int change = change(val);
                    if ("add".equals(opt)) {
                        result += change;
                    } else if ("sub".equals(opt)) {
                        result -= change;
                    } else if ("mul".equals(opt)) {
                        result *= change;
                    } else if ("div".equals(opt)) {
                        result /= change;
                    } else {
                        result %= change;
                    }
                }

                break;
            case "CHANGE" :
                String ways = sc.next();
                way = Integer.parseInt(ways);
                break;
            case "ADD" :
                opt = "add";
                break;
            case "SUB" :
                opt = "sub";
                break;
            case "MUL" :
                opt = "mul";
                break;
            case "DIV" :
                opt = "div";
                break;
            case "MOD" :
                opt = "mod";
                break;
            case "EQUAL" :
                show();
                break;
            default:
        }
        return 0;
    }

    public static void show() {
        System.out.println(Integer.toString((int) result, way));
    }

    public static int change(int val) {
        int i = Integer.parseInt(String.valueOf(val), way);
        return i;
    }
}
