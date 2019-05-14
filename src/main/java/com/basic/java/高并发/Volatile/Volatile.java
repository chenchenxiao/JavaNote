package com.basic.java.多线程.高并发.Volatile;

/**
 * @author Blse
 * @date 2019/4/2
 * @description
 */
public class Volatile {

    private static  int INIT_VALUE = 0;

    private final static int MAX_LIMIT = 500;

    public static void main(String[] args) {
        new Thread( () -> {
           int localValue = INIT_VALUE;
            while (localValue < MAX_LIMIT) {
                if (localValue != INIT_VALUE) {
                    System.out.println("the value - > " + INIT_VALUE);
                    localValue = INIT_VALUE;
                }
            }
        },"RENDER").start();



        new Thread(() -> {
            int localValue = INIT_VALUE;
            while (INIT_VALUE < MAX_LIMIT) {
                System.out.println("update ->" +  (++localValue));
                INIT_VALUE = localValue;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "UPDATER").start();

    }






}
