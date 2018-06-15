package com.basic.高并发;

/**
 * @author Blse
 * @date 2018/6/10
 * @description
 */
public class 三个线程 {

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("A ：" + i);
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("B ：" + i);
                }
            }
        });
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("C ：" + i);
                }
            }
        });
        threadA.start();
//        threadA.join();
        threadB.start();
//        threadB.join();
        threadC.start();
        threadA.sleep(1000000000);

    }

}
