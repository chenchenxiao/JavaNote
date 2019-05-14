package com.basic.java.多线程.高并发.Condition;

import java.util.concurrent.TimeUnit;

/**
 * @author Blse
 * @date 2019/4/15
 * @description
 */
public class ComBetweenThreads {
    private static int data = 0;

    private static boolean noUse = true;

    private final static Object MONITOR = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            for (;;) {
                buildData();
            }
        }).start();
        new Thread(()->{
            for (;;) {
                useData();
            }
        }).start();
    }


    private static void buildData() {
       synchronized (MONITOR) {
           while (noUse) {
               try {
                   MONITOR.wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           data++;
           try {
               TimeUnit.SECONDS.sleep(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("p:" + data);
           noUse = true;
           MONITOR.notifyAll();
       }

    }

    private static void useData() {
        synchronized (MONITOR) {
            while (!noUse) {
                try {
                    MONITOR.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("c:" + data);
            noUse = false;
            MONITOR.notifyAll();
        }
    }


}
