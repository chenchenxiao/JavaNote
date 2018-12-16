package com.basic.算法.左程云算法.基础一;

import java.util.Arrays;

/**
 * @author Blse
 * @date 2018/11/13
 * @description     经典快速排序
 *                   最坏情况下，划出来的区域会打偏。例如 1 2 3 4 5 6
 *                   每一轮都只能搞定一个数，所以每次都要搞N次，时间复杂度是O(N^2)
 *                   最好情况下，每次划出来的区域刚好都在中间，所以是T(N) = 2T(N / 2) + O(N),即O(N * logN)
 *                   随机快排
 *                   随机选一个数进行交换，所以时间复杂度是概率性的，用长期期望的方式算出来是O(N * logN)
 *
 *                  做不到排序的稳定性
 *                  想当于01问题，给定一个数，要么大于要么小于等于，不可能维持稳定性
 *                  例如 4 4 4 3，交换第一个4和3，做不到稳定性
 */
public class 快速排序 {

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            sort(arr1);
            comparator(arr2);
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
        sort(arr);
        printArray(arr);
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return ;
        }
        sortProccess(arr, 0, arr.length - 1);
    }

    public static void sortProccess(int[] arr, int l, int r) {
        if (l < r) {
            swap(arr, l + (int)(Math.random() * (r - l + 1)), r);
            int[] p = partition(arr, l, r);
            //排左边的
            sortProccess(arr, l, p[0] - 1);
            //排右边
            sortProccess(arr, p[1] + 1, r);
        }
    }

    private static int[] partition(int[] arr, int l, int r) {
        //左边界
        int less = l - 1;
        //右边界
        int more = r;
        //当左右边界不相撞，也就是没比较完
        while (l < more) {
            //与当前最后一个数进行比较，互换
            if (arr[l] < arr[r]) {
                swap(arr, l++, ++less);
            } else if (arr[l] > arr[r]) {
                swap(arr, l, --more);
            } else {
                //表示相等，向右移动一位
                l++;
            }
        }
        //因为最开始是用数组的r位置元素做比较的，
        // 所以最后要把这个元素归入到等于区域
        swap(arr, more, r);
        //返回等于区域的左右边界点。第一个值是等于边界的第一个值
        return new int[] {less + 1, more};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    // for test
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

    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
