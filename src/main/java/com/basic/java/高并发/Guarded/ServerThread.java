package com.basic.java.高并发.Guarded;

import java.util.Random;

/**
 * @author Blse
 * @date 2019/4/3
 * @description
 */
public class ServerThread extends Thread {

    private final RequestQueue queue;

    private final Random random;

    private volatile  boolean closed = false;

    public ServerThread(RequestQueue queue) {
        this.queue = queue;
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public void run() {
        while (!closed) {
            Request request = queue.getRequest();
            if (null == request) {
                System.out.println("Received the empty request.");
                continue;
            }
            System.out.println("Server ->" + request.getValue());
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public void close() {
        this.closed = true;
        this.interrupt();
    }
}
