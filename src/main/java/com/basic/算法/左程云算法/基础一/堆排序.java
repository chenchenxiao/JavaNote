package com.basic.算法.左程云算法.基础一;

import java.util.Arrays;

/**
 * @author Blse
 * @date 2018/11/13
 * @description 每次插入一个新元素，时间复杂度是O(logN)，所以堆排序的时间复杂度是O(N * logN)
 *               左孩子  2 * i + 1，右孩子 2 * i + 2，父节点 (i - 1) / 2
 *               做不到排序的稳定性
 */
public class 堆排序 {

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            heapSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        heapSort(arr);
        printArray(arr);
    }

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return ;
        }
        for (int i = 0; i < arr.length; i++) {
            //往堆中添加元素
            heapInsert(arr, i);
        }
        //堆的大小
        int heapSize = arr.length;
        //将最后一个元素与第一个元素换位
        swap(arr, 0, --heapSize);
        //该过程可以看做每次都是弹出堆中最大的值，然后经过一次heapify后，最大值又在0位置，重复此过程对数组进行排序
        while (heapSize > 0) {
            //将堆中的元素进行排序
            heapify(arr, 0, heapSize);
            //将最后一个元素与第一个元素换位
            swap(arr, 0, --heapSize);
        }
    }

    /**
     *  往堆里添加元素
     */
    public static void heapInsert(int[] arr, int index) {
        //判断当前元素是否大于其父节点元素
        while (arr[index] > arr[(index - 1) / 2]) {
            //大于就互换
            swap(arr, index, (index - 1) / 2);
            //将当期元素置为父元素
            index = (index - 1) / 2;
        }
    }

    /**
     *  重新将堆进行排序
     * @param arr
     * @param index
     * @param heapSize
     */
    public static void heapify(int[] arr, int index, int heapSize) {
        // 得出当前元素的左孩子节点的位置
        int left = index * 2 + 1;
        // 当左孩子节点的位置还没越界时
        while (left < heapSize) {
            // 求出当前左右孩子节点中值最大的节点的位置
            int largest = (left + 1 < heapSize) && arr[left + 1] > arr[left] ? left + 1 : left;
            //判断最大孩子节点的值是否大于父节点的值
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            //交换孩子节点和父节点的值
            swap(arr, largest, index);
            //将父节点变为最大孩子节点的位置
            index = largest;
            //变为孩子左节点
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // for test
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    // for test
    public static int[] generateRandomArray(int maxheapSize, int maxValue) {
        int[] arr = new int[(int) ((maxheapSize + 1) * Math.random())];
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
