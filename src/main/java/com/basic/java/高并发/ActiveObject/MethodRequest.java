package com.basic.java.高并发.ActiveObject;

/**
 * @author Blse
 * @date 2019/4/8
 * @description
 */
public abstract class MethodRequest {

    protected final Servant servant;

    protected final FutureResult futureResult;

    public MethodRequest(Servant servant, FutureResult futureResult) {
        this.servant = servant;
        this.futureResult = futureResult;
    }
    public abstract void execute();
}
