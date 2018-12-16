package com.basic.算法.左程云算法.基础一;

import java.util.Arrays;

/**
 * @author Blse
 * @date 2018/11/12
 * @description
 */
public class 小和问题 {

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        int num = 0;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        sort(arr, num);
        printArray(arr);
    }

    public static void sort(int[] arr, int num) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int result = sortProcess(arr, 0, arr.length - 1, num);
    }

    public static int sortProcess(int[] arr, int L, int R, int num) {
        if (L == R) {
            return 0;
        }
        int mid = L + ((R - L) >> 1);
        //左边的加右边的加最后再合并一次的
        return sortProcess(arr, L, mid, num)
        + sortProcess(arr, mid + 1, R, num)
        + merge(arr, L, mid, R, num);
    }

    public static int merge(int[] arr, int L, int mid, int R, int num) {
        int[] help = new int[R - L + 1];
        int p1 = L;
        int p2 = mid + 1;
        int i = 0;
        int result = 0;
        while (p1 <= mid && p2 <= R) {
            //右边有多少个数是大于当前左边数的
            result += arr[p1] < arr[p2] ? (R - p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
        return result;
    }

   public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (((maxValue + 1) * Math.random()) - (maxValue * Math.random()));
        }
        return arr;
   }

   public void comparator(int[] arr) {
       Arrays.sort(arr);
   }

   public static int[] copyArray(int[] arr) {
        int[] help = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            help[i] = arr[i];
        }
        return help;
   }

   public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
       System.out.println(" ");
   }

   public static boolean isEqual(int[] arr1, int[] arr2) {
       if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
           return false;
       }
       if (arr1 == null && arr2 == null) {
           return true;
       }
       if (arr1.length != arr2.length) {
           return false;
       }
       for (int i = 0; i < arr1.length; i++) {
           if (arr1[i] != arr2[i]) {
               return false;
           }
       }
       return true;
   }

}
