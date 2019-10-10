package com.basic.题目;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Blse
 * @date 2019/8/16
 * @description
 */
public class 科大讯飞 {

    public static void main(String[] args) {
//        int[] arrs = {11,13,15,17,19,21};
//        int result = problem2(arrs, 0, arrs.length - 1);
//        System.out.println(result + 1);

        problem1();
    }

    public static void problem1() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = str.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-') {
                flag = true;
            }
            int val = chars[i] - 48;
            if (val >= 0 && val < 10) {
                if (flag) {
                    val = val * -1;
                    flag = false;
                }
                list.add(val);
            }
        }
        if (list.size() > 0) {
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            Arrays.sort(result);
            for (int val : result) {
                System.out.print(val);
            }
        } else {
            System.out.println("-1");
        }
        scanner.close();
    }

    //{11,13,15,17,19,21}
    public static int problem2(int[] arrs, int begin, int end) {
        int mid = (begin + end) / 2;
        if (begin <= mid) {
            if (arrs[mid] < 19) {
                return problem2(arrs, mid + 1, end);
            } else if (arrs[mid] > 19) {
                return problem2(arrs, begin, mid - 1 );
            } else {
                return mid;
            }
        } else {
            return -1;
        }





    }

}
