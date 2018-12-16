package com.basic.java.多线程;

import org.springframework.ui.Model;

/**
 * @author Blse
 * @date 2018/7/8
 * @description
 */
public class 练习一 {

    private static Integer num = 1;

    public static void main(String[] args) throws InterruptedException {
        num.wait();
        num.notifyAll();

//        new ThreadPrictaceA(ThreadPrictaceA.MODE_RECIVE).start();
//        new ThreadPrictaceA(ThreadPrictaceA.MODE_SEND).start();
    }


}

class ThreadPrictaceA extends Thread{

    public static Integer flag = 1;

    public static final int MODE_RECIVE = 2;

    public static final int MODE_SEND = 0;

    private int mode;

    public ThreadPrictaceA(Integer mode) {
        this.mode = mode;
    }

    @Override
    public void run() {
        super.run();
        if (mode == MODE_RECIVE) {
            receive();
        } else {
            send();
        }
    }

    private void send() {
        try{
            for (int i = 0; i < 10; i++) {
                synchronized (flag) {
                    while (flag != 1) {
                        flag.wait();
                    }
                    System.out.println("Message Send");
                    flag = 0;
                    flag.notifyAll();
                }
                sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void receive() {
        try{
            for (int i = 0; i < 10; i++) {
                synchronized (flag) {
                    while (flag != 0) {
                        System.out.println("Received Wait");
                        flag.wait();
                    }
                    System.out.println("Message Received");
                    flag = 1;
                    flag.notifyAll();
                }
                sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}