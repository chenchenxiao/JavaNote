package com.basic.算法.剑指offer;

/**
 * @author Blse
 * @date 2019/2/24
 * @description
 */
public class 数字在排序数组中出现的次数 {


    public int GetNumberOfK(int[] array , int k) {
        int start = 0;
        int end = array.length - 1;
        int length = array.length;
        int firstK = getFirst(array, k, 0, length-1);
        int lastK = getLastK(array, k, 0, length-1);
        if(firstK != -1 && lastK != -1){
            return lastK - firstK + 1;
        }
        return 0;
    }

   public int getFirst(int[] arr, int k, int start, int end) {
       if (start > end) {
           return -1;
       }
       int mid = (start + end) >> 1;
       if (arr[mid] > k) {
           return getFirst(arr, k, start, mid - 1);
       } else if (arr[mid] < k) {
           return getFirst(arr, k, mid + 1, end);
       } else if (mid - 1 >= 0 && arr[mid - 1] == k) {
            return getFirst(arr, k, start, mid - 1);
       } else {
           return mid;
       }
   }



    public int getLastK(int[] array , int k, int start, int end){
        int length = array.length;
        int mid = (start + end) >> 1;
        while(start <= end){
            if(array[mid] > k){
                end = mid-1;
            }else if(array[mid] < k){
                start = mid+1;
            }else if(mid+1 < length && array[mid+1] == k){
                start = mid+1;
            }else{
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }

}
