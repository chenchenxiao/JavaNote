package com.basic.java.高并发;

/**
 * @author Blse
 * @date 2019/4/7
 * @description
 */
public class JoinTest {


    static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (i < 500) {
                    System.out.println("11111111");
                    i++;
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                while (i < 500) {
                    System.out.println("222222");
                    i++;
                }
            }
        });
        t1.start();
        t2.start();
        System.out.println("333333333333333");
        t1.join();
        t2.join();



    }


}
