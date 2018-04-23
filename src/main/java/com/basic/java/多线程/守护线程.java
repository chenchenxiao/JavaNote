package com.basic.java.多线程;

/**
 * @author Blse
 * @date 2018/2/2
 * @description
 */
public class 守护线程 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++){
                    System.out.println("daemon -->" + i);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++){
                    System.out.println("thread2 -->" + i);
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        thread2.start();
    }
}
