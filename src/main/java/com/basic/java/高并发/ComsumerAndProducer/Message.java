package com.basic.java.高并发.ComsumerAndProducer;

/**
 * @author Blse
 * @date 2019/4/7
 * @description
 */
public class Message {

    private String data;

    public Message(String s) {
        this.data = s;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
