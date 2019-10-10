package com.basic.题目;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Blse
 * @date 2019/9/19
 * @description
 */
public class 微众 {

    /**
     * 小明想知道 n! ，最后一位不为 0 的数字，你能告诉他吗？ n! = n*(n-1)*(n-2)*....*3*2*1
     */
    public static void getNotZero() {
        Scanner sc = new Scanner(System.in);
        BigInteger val = sc.nextBigInteger();
        BigInteger n = BigInteger.valueOf(1);
        while (val.intValue() > 1) {
            n = n.multiply(val);
            val = val.subtract(BigInteger.valueOf(1));
        }
        System.out.println(n);
        while (n.compareTo(BigInteger.ZERO) > 0) {
            BigInteger temp = n.remainder(BigInteger.valueOf(10));
            if (temp.compareTo(BigInteger.ZERO) != 0) {
                System.out.println(temp);
                break;
            }
            n = n.divide(BigInteger.valueOf(10));
        }

    }

    /**
     * 一般来讲，一个国家级景区，都包含着很多的景点，在这些景点之间，有着很多条路，任意两个景点之间，可能有很多条不重复经过某一景点的道路可以到达。有一位强迫症患者去游览某景区，这个景区中有n个景点，编号为1-n，入口在s景点，出口在t景点，景区中有m条路径连接某两个景点，他通过某些道路从s走向t，但是因为强迫症的缘故，他不希望重复经过某个景点，这就注定了有些景点他是不可能到达的，请问这样的景点有多少个？
     * 输入：
     * 5 4  分别表示景点数量，路的数量
     * 1 2
     * 2 3
     * 4 2
     * 5 2
     * 1 3  表示入口所在景点的编号和出口所在景点的编号
     * 输出
     * 4 5
     *
     */
    public static void road() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //景点数
        int m = sc.nextInt();   //路数
        //数组+map+list
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> temp;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (map.get(a) == null) {
                temp = new ArrayList<>();
                temp.add(b);
                map.put(a, temp);
            } else {
                map.get(a).add(b);
            }
        }
        int start = sc.nextInt();   //开始位置
        int end = sc.nextInt(); //结束位置
        ArrayList<Integer> startList = map.get(start);
        for (int i = 0, k = startList.size(); i < k; i++) {
            int t = startList.get(i);   //跟开始位置相关的景点
        }




        sc.close();
    }



    public static void main(String[] args) {
        getNotZero();
    }


}
