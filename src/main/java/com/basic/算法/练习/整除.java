package com.basic.算法.练习;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/10/24
 * @description
 */
public class 整除 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int result = 1;
        int va = val + 1;
        boolean isOk = false;
        while (!isOk) {
            boolean flag = true;
            for (int i = 1; i <= val; i++) {
                if (va % i != 0) {
                    flag = false;
                }
            }
            if (flag) {
                isOk = true;
                result = va;
            } else {
                va++;
            }
        }
        System.out.println(result);
    }

}
