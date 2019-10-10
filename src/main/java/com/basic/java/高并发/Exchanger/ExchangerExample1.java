package com.basic.java.多线程.高并发.Exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/**
 * @author Blse
 * @date 2019/4/13
 * @description 用于交换数据，两个线程是配对的，如果其中一个BLOCK了，另一个会等待他唤醒后马上把数据给他
 *               Exchanger只能是配对两个线程，如果超过2个其他的会BLOCK。因为没有线程给他配对
 */
public class ExchangerExample1 {


    public static void main(String[] args) {
        final Exchanger<String> exchanger = new Exchanger<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "start");
                try {
                    String result = exchanger.exchange("FORM A");
                    System.out.println(Thread.currentThread().getName() + "GET VALUE" + result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "==A==").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "start");
                try {
                    TimeUnit.SECONDS.sleep(5);
                    String result = exchanger.exchange("FORM B");
                    System.out.println(Thread.currentThread().getName() + "GET VALUE" + result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "==B==").start();
    }

}
