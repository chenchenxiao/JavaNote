package com.basic.java.多线程.高并发.ActiveObject;

/**
 * @author Blse
 * @date 2019/4/8
 * @description
 */
public class RealResult implements Result {

    private final Object resultValue;

    public RealResult(Object resultValue) {
        this.resultValue = resultValue;
    }




    @Override
    public Object getResultValue() {
        return resultValue;
    }
}
