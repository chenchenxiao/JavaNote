package com.basic.java.高并发.Condition;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Blse
 * @date 2019/4/15
 * @description     调用await和signal方法都必须在Lock的lock()方法和unlock方法之间，否则会报IME异常
 *                   可以选择不响应中断，可以设置响应超时时间,超过指定时间无论是否别唤醒都会结束线程
 */
public class ConditionExample {

    private final static ReentrantLock lock = new ReentrantLock();

    private final static Condition condition = lock.newCondition();

    private static int data = 0;

    private static volatile boolean noUse = true;

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
      try {
          lock.lock();
          while (noUse) {
              condition.await();
          }
          data++;
          System.out.println("P:" + data);
          TimeUnit.SECONDS.sleep(1);
          noUse = true;
          condition.signal();
      } catch (InterruptedException e) {
          e.printStackTrace();
      } finally {
          lock.unlock();
      }

    }

    private static void useData() {
        try {
            lock.lock();
            while (!noUse) {
                condition.await();
            }
            TimeUnit.SECONDS.sleep(1);
            System.out.println("C:" + data);
            noUse = false;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
