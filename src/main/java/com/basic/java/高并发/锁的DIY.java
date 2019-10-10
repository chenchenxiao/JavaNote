package com.basic.java.高并发;

/**
 * @author Blse
 * @date 2019/9/22
 * @description
 */
public class 锁的DIY {

    public static void main(String[] args) throws InterruptedException {
       DiyLock lock = new DiyLock();
       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   lock.lock();
                   lock.lock();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }).start();
       new Thread(new Runnable() {
           @Override
           public void run() {
               lock.unLock();
           }
       }).start();
    }

}

class DiyLock{

    private int val;



   public void lock() throws InterruptedException {
       synchronized (this) {
           if (val == 0) {
               val++;
           } else {
               wait();
           }
       }
       System.out.println("lockSuccess");
   }

   public void unLock(){
       synchronized (this) {
           if (val > 0) {
               val--;
               notify();
           }
       }

   }


}
