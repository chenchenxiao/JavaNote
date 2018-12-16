package com.basic.算法.左程云算法.基础一;

import java.util.Arrays;

/**
 * @author Blse
 * @date 2018/11/15
 * @description
 */
public class Test {

    public static void main(String[] args) {
        int testTime = 50000;
        int maxSize = 100;
        int maxValue = 100;
        boolean isSucceed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
//            冒泡排序(arr1);
//            选择排序(arr1);
//            插入排序(arr1);
//            归并排序(arr1, 0, arr1.length - 1);
//            快速排序(arr1);
            堆排序(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                isSucceed = false;
                break;
            }
        }
        System.out.println(isSucceed ? "Nice!" : "Fucking fucked!");
        int[] arr = generateRandomArray(maxSize, maxValue);
//        int[] arr = generateArray();
        printArray(arr);
//        冒泡排序(arr);
//        选择排序(arr);
//        插入排序(arr);
//        归并排序(arr, 0, arr.length - 1);
//        荷兰国旗(arr, 1, 0, arr.length);
//        快速排序(arr);
        堆排序(arr);
        printArray(arr);
    }


    public static void 冒泡排序(int[] arr) {
        int length = arr.length;
        for (int i = length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void 选择排序(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = arr[i];
                if (temp > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void 插入排序(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j + 1, j);
                } else {
                    break;
                }
            }
        }
    }

    public static void 归并排序(int[] arr, int L, int R) {
        if (arr == null || arr.length < 2) {
            return;
        }
        MergeSort(arr, L, R);
    }

    public static void MergeSort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        MergeSort(arr, L, mid);
        MergeSort(arr, mid + 1 , R);
        MergeSortProccess(arr, L, mid, R);
    }

    public static void MergeSortProccess(int[] arr, int L, int m, int R) {
        int[] help = new int[R - L + 1];
        int p1 = L;
        int p2 = m + 1;
        int index = 0;
        while (p1 <= m && p2 <= R) {
           help[index++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= m) {
            help[index++] = arr[p1++];
        }
        while (p2 <= R) {
            help[index++] = arr[p2++];
        }
        for (int i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

    public static void 荷兰国旗(int[] arr, int num, int L, int R) {
        int index = L - 1;
        while (index != R - 1) {
            int temp = arr[++index];
            if (temp < num) {
                swap(arr, index, L++);
            } else if (temp > num) {
                swap(arr, index--, --R);
            }
        }
    }

    public static void 快速排序(int[] arr) {
        if (arr == null || arr.length < 2) {
            return ;
        }
       quitProccess(arr, 0, arr.length - 1);
    }

    public static void quitProccess(int[] arr, int l, int r) {
        if (l < r) {
            swap(arr, 1 + (int)(Math.random() * (r - l + 1)), r);
            int[] pri = parititon(arr, l, r);
            quitProccess(arr, l, pri[0] - 1);
            quitProccess(arr, pri[1] + 1, r);
        }

    }

    public static int[] parititon(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (arr[l] < arr[r]) {
                swap(arr, l++, ++less);
            } else if (arr[l] > arr[r]) {
                swap(arr, l, --more);
            } else {
                l++;
            }
        }
        swap(arr, more, r);
        return new int[]{less + 1, more};
    }

    public static void 堆排序(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            heapInsert(arr, i);
        }

    }

    private static void heapInsert(int[] arr, int i) {
        while (arr[i] > arr[(i - 1) / 2]) {
            swap(arr, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public static void heapify(int[] arr, int heapSize, int index) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int lastgest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            lastgest = arr[index] > arr[lastgest] ? index : lastgest;
            if (lastgest == index) {
                break;
            }
            swap(arr, index, lastgest);
            index = lastgest;
            left = index * 2 + 1;
        }
    }

    public static int 桶的应用(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i] < min ? arr[i] : min;
            max = arr[i] > max ? arr[i] : max;
        }
        if (min == max) {
            return 0;
        }
        int[] mins = new int[arr.length];
        int[] maxs = new int[arr.length];
        boolean[] flag = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = bucket(arr[i], arr.length, min, max);
            mins[index] = flag[index] ? Math.min(mins[index], arr[i]) : arr[i];
            maxs[index] = flag[index] ? Math.max(maxs[index], arr[i]) : arr[i];
            flag[index] = true;
        }
        int result = 0;
        int lastMax = maxs[0];
        for (int i = 1; i <= arr.length; i++) {
            if (flag[i]) {
                result = Math.max(maxs[i] - lastMax, result);
                lastMax = maxs[i];
            }
        }
        return result;
    }

    public static int bucket(long num, long len, long min, long max) {
        return (int) ((num - min) * len / (max - min));
    }

    /**
     *  生成随机数组
     */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] help = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < help.length; i++) {
            help[i] = (int) ((maxValue + 1) * Math.random() - maxValue * Math.random());
        }
        return help;
    }

    public static int[] generateArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 3);
        }
        return arr;
    }


    /**
     * 交换
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    /**
     * 绝对正确的方法
     * @param arr
     */
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    /**
     * 克隆数组
     * @param arr
     * @return
     */
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

    /**
     * 判断两个数组是否相等
     * @param arr1
     * @param arr2
     * @return
     */
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

    /**
     * 打印数组
     * @param arr
     */
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
