package com.basic.java.高并发.ComsumerAndProducer;

import java.util.Random;

/**
 * @author Blse
 * @date 2019/4/7
 * @description
 */
public class ConsumerThread extends Thread{

    private final MessageQueue messageQueue;

    private final static Random random = new Random(System.currentTimeMillis());

    public ConsumerThread(MessageQueue messageQueue, int seq) {
        super("Consumer" + seq);
        this.messageQueue = messageQueue;
    }


    @Override
    public void run() {
        while (true) {
            try {
                Message message = messageQueue.take();
                System.out.println(Thread.currentThread().getName() + " take a message " + message.getData());
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
