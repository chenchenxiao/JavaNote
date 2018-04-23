package com.basic.java.多线程;

/**
 * @author Blse
 * @date 2018/2/2
 * @description
 */
public class Run和Start {
    public static void main(String[] args) {
//        System.out.println("start");
        Xiancheng xiancheng = new Xiancheng();
        Thread thread = new Thread(xiancheng);
        thread.start();
        System.out.println("main");
        System.out.println(Thread.currentThread());
    }
}

class Xiancheng implements Runnable{
    @Override
    public void run() {
        System.out.println("  " + Thread.currentThread());
        System.out.println("run");
    }
}
