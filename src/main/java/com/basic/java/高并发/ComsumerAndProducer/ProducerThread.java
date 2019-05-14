package com.basic.java.高并发.ComsumerAndProducer;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Blse
 * @date 2019/4/7
 * @description
 */
public class ProducerThread extends Thread{

    private final MessageQueue messageQueue;

    private final static Random random = new Random(System.currentTimeMillis());

    private final static AtomicInteger counter = new AtomicInteger(0);

    public ProducerThread(MessageQueue messageQueue, int seq) {
        super("PRODUCER" + seq);
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        while (true) {
            Message message = new Message("Message-" + counter.getAndIncrement());
            try {
                messageQueue.put(message);
                System.out.println(Thread.currentThread().getName() + " put message " + message.getData());
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                break;
            }
        }
    }

}
