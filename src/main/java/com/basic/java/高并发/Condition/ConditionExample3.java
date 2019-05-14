package com.basic.java.高并发.Condition;

import org.omg.CORBA.TIMEOUT;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * @author Blse
 * @date 2019/4/15
 * @description
 */
public class ConditionExample3 {

    private final static Lock lock = new ReentrantLock();

    private final static Condition PRODUCER_COND = lock.newCondition();

    private final static Condition CONUSE_COND = lock.newCondition();

    private final static LinkedList<Long> TIMPSTAMP_POOL = new LinkedList<>();

    private final static int MAX_CAPACITY = 100;

    public static void main(String[] args) {
        IntStream.range(0, 6).boxed().forEach(ConditionExample3 :: beginProduce);
        IntStream.range(6, 13).boxed().forEach(ConditionExample3 :: beginConsume);
    }

    private static void beginProduce(int i){
        new Thread(() -> {
            for (; ;) {
                produce();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "P"+ i).start();
    }

    private static void beginConsume(int i) {
        new Thread( () -> {
            for (; ;) {
                consume();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C" + i).start();
    }
     
    private static void produce() {
        try{
            lock.lock();
            while (TIMPSTAMP_POOL.size() >= MAX_CAPACITY) {
                PRODUCER_COND.await();
            }
            long value = System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName() + "P->" + value);
            TIMPSTAMP_POOL.addLast(value);
            CONUSE_COND.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void consume() {
        try {
            lock.lock();
            while (TIMPSTAMP_POOL.isEmpty()) {
                System.out.println("TIMPSTAMP_POOL.isEmpty");
                CONUSE_COND.await();
            }
            Long value = TIMPSTAMP_POOL.removeFirst();
            System.out.println(Thread.currentThread().getName() + "C:" + value);
            PRODUCER_COND.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
