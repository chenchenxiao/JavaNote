package com.basic.java.高并发.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @author Blse
 * @date 2019/4/13
 * @description CyclicBarrier与CountDownLatch类似，不过是每个线程都要等其他线程执行完await前面的逻辑才会向下继续执行
 *               比如 去露营的时候，我跟你都准备好了，但是第三人还没好，我们两个就要等他准备好才能出发
 *               在实例化时可以传入一个Runnable接口，表示在等待完成后要回调的逻辑
 *               可用调用reset，必须是调用其他线程的主线程调用
 */
public class CyclicBarrierExample1 {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        new Thread() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("T1 IS FINISHED");
                    cyclicBarrier.await();
                    System.out.println("T1 THE OTHER FINISHED");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.println("T2 IS FINISHED");
                    cyclicBarrier.await();
                    System.out.println("T2 THE OTHER FINISHED");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

}
