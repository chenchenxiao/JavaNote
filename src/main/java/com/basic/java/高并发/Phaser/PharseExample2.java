package com.basic.java.高并发.Phaser;

import com.basic.设计模式.A;

import java.util.Random;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * @author Blse
 * @date 2019/4/16
 * @description 可用重复去使用
 */
public class PharseExample2 {

    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        final Phaser phaser = new Phaser(5);
        for (int i = 0; i < 6; i++) {
            new Althletes(phaser, i).start();
        }
    }

    static class Althletes extends Thread{
        private final Phaser phaser;

        private final int number;

        Althletes(Phaser phaser, int number) {
            this.phaser = phaser;
            this.number = number;
        }

        @Override
        public void run() {
            try {
                System.out.println(number + "START RUNING");
                TimeUnit.SECONDS.sleep(random.nextInt(5));
                System.out.println(number + "END RUNING");
                phaser.arriveAndAwaitAdvance();
                System.out.println(number + "START BICYCLE");
                TimeUnit.SECONDS.sleep(random.nextInt(5));
                System.out.println(number + "END BICYCLE");
                phaser.arriveAndAwaitAdvance();


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(number + " RUNING");
        }
    }

}
