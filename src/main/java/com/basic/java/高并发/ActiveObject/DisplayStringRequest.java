package com.basic.java.高并发.ActiveObject;

/**
 * @author Blse
 * @date 2019/4/8
 * @description
 */
public class DisplayStringRequest extends MethodRequest {

    private final String text;


    public DisplayStringRequest(Servant servant,String text) {
        super(servant, null);
        this.text = text;
    }

    @Override
    public void execute() {
        this.servant.displayString(text);
    }
}
