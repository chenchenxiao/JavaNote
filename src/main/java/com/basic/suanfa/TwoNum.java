package com.basic.suanfa;

/**
 * @author Blse
 * @date 2018/3/29
 * @description
 */
public class TwoNum {

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if (j == i) {
                    continue;
                }
                int num = nums[i] + nums[j];
                if (num == target) {
                    nums = new int[]{i,j};
                    return nums;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        nums = new TwoNum().twoSum(nums,6);
        for (int i  : nums) {
            System.out.print(i + " ");
        }
    }
}
