package com.basic.java.高并发.WorkThread;

/**
 * @author Blse
 * @date 2019/4/8
 * @description
 */
public class WorkerClient {

    public static void main(String[] args) {
        final Channel channel = new Channel(5);
        channel.startWorker();

        new TransportThread("Alex", channel).start();
        new TransportThread("Jack", channel).start();
        new TransportThread("William", channel).start();
    }

}
