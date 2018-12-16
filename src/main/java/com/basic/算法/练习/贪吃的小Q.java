package com.basic.算法.练习;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/10/22
 * @description
 */
public class 贪吃的小Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(SearchMaxChocolate(m, n));
    }

    public static int SumChocolate(int num,int day){
        int sum = 0;
        for(int i = 1;i <= day;i++){
            sum = sum + num;
            num = (int)Math.ceil((double)num/2);
        }
        return sum;
    }

    public static int SearchMaxChocolate(int total, int day){
        int first = 1;
        int last = total;
        int sum = 0;
        int mid = (first + last)/2;;

        if(day == total)
            return 1;
        while(first <= last){
            sum = SumChocolate(mid, day);
            if(sum < total){
                first = mid + 1;
            }else if( sum == total){
                return mid;
            }else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }

        return mid;
    }

}
