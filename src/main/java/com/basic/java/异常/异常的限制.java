package com.basic.java.异常;

/**
 * @author Blse
 * @date 2018/1/27
 * @description
 */
public class 异常的限制 {

}

class Parent{
    public void mA() {}
}

interface P{
    public void methodB() throws NullPointerException;
}

class Son extends Parent implements P{
    @Override
    public void mA() throws NullPointerException, IndexOutOfBoundsException {
    }

    @Override
    public void methodB() throws NullPointerException {

    }
}
