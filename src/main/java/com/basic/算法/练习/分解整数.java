package com.basic.算法.练习;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/10/24
 * @description
 */
public class 分解整数 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arrs = new int[num];
        for (int i = 0; i < num; i++) {
            arrs[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            int temp = arrs[i];
            int A = 0;
            int B = 0;
            boolean flag = false;
            for (int j = 1; j + 2 <= temp; j += 2) {
                if (!flag) {
                    for (int k = 2; k + 2 <= temp; k += 2) {
                        if (j * k == temp) {
                            A = j;
                            B = k;
                            flag = true;
                        }
                    }
                }
            }
            if (flag) {
                System.out.println(A + " " + B);
            } else {
                System.out.println("No");
            }


        }

    }

}
