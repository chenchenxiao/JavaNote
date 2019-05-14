package com.basic.java.多线程.高并发.Guarded;

import java.util.LinkedList;

/**
 * @author Blse
 * @date 2019/4/3
 * @description
 */
public class RequestQueue {

    private final LinkedList<Request> queue = new LinkedList<>();

    public Request getRequest() {
        synchronized (queue) {
            while (queue.size() <= 0) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Request request = queue.removeFirst();
            return request;
        }
    }

    public void putRequest(Request request) {
        synchronized (queue) {
            queue.addLast(request);
            queue.notifyAll();
        }
    }

}
