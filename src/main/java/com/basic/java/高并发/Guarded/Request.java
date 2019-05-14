package com.basic.java.高并发.Guarded;

/**
 * @author Blse
 * @date 2019/4/3
 * @description
 */
public class Request {

    final private String value;

    public Request(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
