package com.basic.java.高并发.Guarded;

/**
 *  这种模式就相当于你每次给我的请求我都要完成，如果没有请求我就会Block
 */
public class SuspensionClient {
    public static void main(String[] args) throws InterruptedException {

        final RequestQueue queue = new RequestQueue();
        new ClientThread(queue, "Alex").start();
        ServerThread serverThread = new ServerThread(queue);
        serverThread.start();
        //serverThread.join();

        Thread.sleep(10000);
        serverThread.close();
    }
}
