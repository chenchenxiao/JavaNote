package com.basic.java.高并发;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * @author cxh
 * @date: 2020/11/16
 * @description:
 */
public class CB测试 {

    static int n = 0;

    static Object monitor = new Object();
    static boolean flag = true;
    public static void main(String[] args) {
       new Thread(new Runnable() {
           @Override
           public void run() {
               while (n < 26) {
                   synchronized (monitor) {
                       if (flag) {
                           monitor.notifyAll();
                           System.out.print((char)(n + 65));
                           flag = false;
                       } else {
                           try {
                               monitor.wait();
                           } catch (InterruptedException e) {
                               e.printStackTrace();
                           }
                       }
                   }
               }
           }
       }).start();

       new Thread(new Runnable() {
           @Override
           public void run() {
               while (n < 26) {
                   synchronized (monitor) {
                       if (!flag) {
                           System.out.print(++n + " ");
                           flag = true;
                           monitor.notifyAll();
                       } else {
                           try {
                               monitor.wait();
                           } catch (InterruptedException e) {
                               e.printStackTrace();
                           }
                       }
                   }
               }
           }
      }).start();
    }


    public void printf1() {

    }

}
