package com.basic.java.高并发.ActiveObject;

/**
 * @author Blse
 * @date 2019/4/8
 * @description
 */
public class MakeStringRequest extends MethodRequest {

    private final int count;
    private final char fillchar;

    public MakeStringRequest( Servant servant, FutureResult futureResult,int count, char fillchar) {
        super(servant, futureResult);
        this.fillchar = fillchar;
        this.count = count;
    }



    @Override
    public void execute() {
        Result result = servant.makeString(count, fillchar);
        futureResult.setResult(result);
    }
}
