package com.basic.算法.左程云算法.基础一;

/**
 * @author Blse
 * @date 2018/11/13
 * @description 给定一个数组arr，和一个数num，把小于等于num的数放在数组的左边，大于num的数放在右边
 */
public class 荷兰国旗问题 {


    public static void main(String[] args) {
        int[] test = generateArray();

        printArray(test);
        int[] res = sort(test, 0, test.length - 1, 1);
        printArray(test);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    public static int[] sort(int[] arr, int l, int r, int num) {
        int less = l - 1;
        int more = r + 1;
        while (l < more) {
            if (arr[l] < num) {
                swap(arr, ++less, l++);
            } else if(arr[l] > num) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        return new int[] {less + 1, more - 1};
    }


    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
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


    // for test
    public static int[] generateArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 3);
        }
        return arr;
    }


}
