package com.basic.算法.练习;

import java.util.Scanner;

/**
 * @author Blse
 * @date 2018/10/18
 * @description 小Q有X首长度为A的不同的歌和Y首长度为B的不同的歌，现在小Q想用这些歌组成一个总长度正好为K的歌单，
 *               每首歌最多只能在歌单中出现一次，在不考虑歌单内歌曲的先后顺序的情况下，请问有多少种组成歌单的方法。
 *   要构建杨辉三角
 */
public class 小Q的歌单 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int X = sc.nextInt();
        int B = sc.nextInt();
        int Y = sc.nextInt();
        int[][] arrs = new int[105][105];
        arrs[0][0] = 1;
        for (int i = 1; i <= 100; i++) {
            arrs[i][0] = 1;
            for (int j = 1; j <= 100; j++) {
                arrs[i][j] = (arrs[i - 1][j - 1] + arrs[i - 1][j]) % 1000000007;
            }
        }
        int sum = 0;
        for (int i = 0; i <= X; i++) {
            if (i * A <= K && (K - A * i) % B == 0 && (K - A * i) / B <= Y) {
                sum = (sum + (arrs[X][i] * arrs[Y][(K - A * i) / B]) % 1000000007) % 1000000007;
            }
        }
        System.out.println(sum);
        sc.close();
    }

}
