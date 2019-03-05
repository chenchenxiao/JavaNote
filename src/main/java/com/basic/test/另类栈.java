package com.basic.test;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Blse
 * @date 2019/3/2
 * @description
 */
public class 另类栈 {

    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String opt = sc.nextLine();
            String[] arr = opt.split(" ");
            if ("push".equals(arr[0])) {
                stack.push(Integer.parseInt(arr[1]));
            } else if ("pop".equals(arr[0])) {
                stack.pop();
            } else if ("query".equals(arr[0])) {
                System.out.println(stack.peek());
            } else {
                delete(Integer.parseInt(arr[1]));
            }
        }
    }

    public static void delete(int num) {
        int[] arrs = new int[stack.size() - 1];
        int index = 0;
        for (int i = 0; !stack.isEmpty(); i++) {
            int temp = stack.pop();
            if (i != num) {
                arrs[index] = temp;
                index++;
            }
        }
        for (int i = arrs.length - 1; i >= 0; i--) {
            stack.push(arrs[i]);
        }
    }

}
