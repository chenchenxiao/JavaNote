package com.basic.算法;

/**
 * @author Blse
 * @date 2017/10/30
 * @description
 */
public class Sort {

    private int[] arrays = {4,2,3,1,5,4,7,9,8};

    public static void main(String[] args) {
        Sort sort  = new Sort();
//        sort.bubbleSort();
//        sort.insertSort();
//        sort.selectSort();
        sort.mergeSort();
    }


    public void mergeSort(){
        __mergeSort(0,arrays.length - 1);
    }

    private void merge(int l, int mid, int r){
        int[] temps = new int[r - l + 1];

        for (int i = l; i <= r; i++) {
            temps[i - l] = arrays[i];
        }
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arrays[k] = temps[j - l];
                j++;
            } else if (j > r) {
                arrays[k] = temps[i - l];
                i++;
            }
            else if (temps[i - l] < temps[j - l]) {
                arrays[k] = arrays[i - l];
                i++;
            } else {
                arrays[k] = temps[j - l];
                j++;
            }
        }
        prin();
        System.out.println("");
    }

    private void __mergeSort(int l, int r) {
        if (l >= r){
            return ;
        }
        int mid = (l + r) / 2 ;
        __mergeSort(l,mid);
        __mergeSort(mid + 1,r);
        merge(l,mid,r);
    }

    /**
     * 选择排序
     * 原理:每次遍历都选出最小的进行替换
     */
    public void selectSort() {
        for (int i = 0; i < arrays.length - 1; i++) {
           int k = i;
           for (int j = k + 1; j < arrays.length; j++) {
               if (arrays[k] > arrays[j]){
                   //选出两者间小的，记下标
                    k = j;
               }
           }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
           if (i != k) {
               int temp = arrays[i];
               arrays[i] = arrays[k];
               arrays[k] = temp;
           }
        }
        prin();
    }

    /**
     * 插入排序   在近乎有序的数组中效率非常高，因为它可以中断内层循环
     * 原理:选第i个，然后与前面的数比较，小的话就插入进行互换
     */
    public void insertSort() {
        int temp = 0;
        for (int i = 1; i < arrays.length ; i++) {
            prin();
            System.out.println( " " + i + "");
            int e = arrays[i];
            int j;
            for (j = i ; j > 0 && arrays[j - 1] > e; j--) {
                arrays[j] = arrays[j - 1];
            }
            arrays[j] = e;
        }
    }

    /**
     * 冒泡排序
     * 原理:每次都从第i个开始进行比较，如果大就互换，依此类推
     * 如果第二个for改成int j = i，即每次都是从排序好后的那个开始，就是从小到大排序
     * 如果是 int j = 0，会把最大的放最前面，因为如果是4,2,5,现在i = 2,则判断后 5 > 4 ，所以会互换
     */
    public void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < arrays.length; i++) {
            prin();
            System.out.println("");
            for (int j = i; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {
                    temp = arrays[j];
                    arrays[j] = arrays[i];
                    arrays[i] = temp;
                }
            }

        }
        prin();
    }


    /**
     * 遍历输出数组内容
     */
    private void prin() {
        for (int i : arrays) {
            System.out.print(i + " ");
        }
    }
}
