package com.basic.算法;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/5/5
 * @description
 */
public class 独立生活 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("有多少钱");
        int money = scanner.nextInt();
        System.out.println("有多少个水果");
        int fruitNum = scanner.nextInt();
        System.out.println("每个水果多少钱");
        int fruitMoney = scanner.nextInt();
        System.out.println("每天房租多少");
        int houseMoney = scanner.nextInt();
        int days = 0;
        int leftMoney = money - (fruitNum * houseMoney);
        if (leftMoney > 0) {
            days = leftMoney / (fruitMoney + houseMoney) + fruitNum;
        } else {
            days = leftMoney / houseMoney;
        }
        System.out.println(days);
    }
}
