package com.basic.算法;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Blse
 * @date 2019/3/29
 * @description
 */
public class 天梯赛 {

    public static void 打印漏斗(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        //实际剩下的
        int rea = num - 1;
        //一边有多少个字符
        int m = rea / 2;
        //第一级打印多少个
        if (m < 3) {
            System.out.println(str);
            System.out.println(rea);
        } else {
            int val = 3;
            boolean flag = true;
            //得出会是剩下多少个字符
            while (val <= m) {
                m -= val;
                if (m > val) {
                    val += 2;
                }
            }
            int before = 0;
            //打印上半部分
            for (int i = val; i > 1; i -= 2, before++) {
                for (int j = 0; j < before; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(str);
                }
                System.out.println("");
            }
            for (int i = 0; i < before; i++) {
                System.out.print(" ");
            }
            System.out.println(str);
            //打印下半部分
            before -= 1;
            for (int i = 3; i <= val; i += 2, before--) {
                for (int j = 0; j < before; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(str);
                }
                System.out.println("");
            }
            if (rea % 2 == 0) {
                System.out.println(m * 2);
            } else {
                System.out.println(m * 2 + 1);
            }
        }
    }

    public static void 求个数(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger val = sc.nextBigInteger();
        HashMap<BigInteger, Integer> map = new HashMap<>();
        while (val.intValue() != 0) {
            BigInteger temp = val.remainder(BigInteger.valueOf(10));
            Integer va = map.get(temp);
            if (va != null) {
                map.put(temp, va + 1);
            } else {
                map.put(temp, 1);
            }
            val = val.divide(BigInteger.valueOf(10));
        }
        for (Map.Entry<BigInteger, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void 连续因子(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int min = 0;
        int num = 0;
        for (int i = 2; i * i < val; i++) {
            int temp = 1;
            int tempNum = 0;
            for (int j = i; j * temp <= val; j++) {
                temp *= j;
                tempNum++;
                if (val % temp == 0) {
                    if (tempNum > num) {
                        min = i;
                        num = tempNum;
                    }
                }
            }
        }
        if (num == 0) {
            System.out.println("1");
            System.out.println(val);
        } else {
            System.out.println(num);
            for (int i = min; i < min + num; i++) {
                if (i > min) {
                    System.out.print("*");
                }
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] z = new int[num];
        int[] m = new int[num];
        int max = 0;
        for (int i = 0; i < num; i++) {
            String val = sc.next();
            String[] arr = val.split("/");
            z[i] = Integer.valueOf(arr[0]);
            int temp = Integer.valueOf(arr[1]);
            if (temp > max) {
                max = temp;
            }
            m[i] = temp;
        }
        for (int i = 0; i < num; i++) {
            int zi = z[i];
            int mu = z[i];

        }
    }

}
