package com.basic.算法.练习;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/10/18
 * @description
 */
public class 安排机器 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //机器的最大工作时间
        int[][] numArrs = new int[n][2];
        //任务完成完成需要的时间
        int[][] workArrs = new int[m][2];
        for (int i = 0; i < n; i++) {
            numArrs[i][0] = sc.nextInt();
            numArrs[i][1] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            workArrs[i][0] = sc.nextInt();
            workArrs[i][1] = sc.nextInt();
        }
        int num = 0;
        int result = 0;
        int machineNum = n;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int machineTime = numArrs[i][0];
            int machineLevel = numArrs[i][1];
            int moneyTemp = 0;
            int mostMoney = 0;
            for (int j = 0; j < m; j++) {
                int workTime = workArrs[j][0];
                int workLevel = workArrs[j][1];
                if (workTime != 0 && machineTime >= workTime && machineLevel >= workLevel) {
                    if (index < 0 || (workArrs[index][0] <= workTime && workArrs[index][1] <= workLevel)) {
                        mostMoney = 200 * workTime + 3 * workLevel;
                        index = j;
                    } else {
                        moneyTemp = 200 * workTime + 3 * workLevel;
                    }
                }
            }
            //收益大于0，表示有完成任务
            if (mostMoney > 0 || moneyTemp > 0) {
                //完成的任务数目加一，总收益增加
                num++;
                if (mostMoney > 0) {
                    result += mostMoney;
                } else {
                    result += moneyTemp;
                }
                //机器数量减一
                machineNum--;
                //把最大收益的机器的等级改为0
                workArrs[index][0] = 0;
            }
        }

        //有多少个任务

        System.out.println(num + "  " + result);
    }
}


