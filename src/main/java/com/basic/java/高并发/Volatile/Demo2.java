package com.basic.java.高并发.Volatile;

/**
 * @author Blse
 * @date 2019/5/20
 * @description
 */
public class Demo2 {


    static Object o1 = new Object();
    static Object o2 = new Object();


    public static void main(String[] args) {
        new Thread( () -> {
            synchronized (o1) {
                try {
                    System.out.println("geto1");
                    Thread.sleep(50);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
        new Thread( () -> {
            synchronized (o2) {
                try {
                    Thread.sleep(50);
                    synchronized (o1) {

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }

}
