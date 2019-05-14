package com.basic.java.高并发.ActiveObject;

/**
 * @author Blse
 * @date 2019/4/8
 * @description
 */
public interface ActiveObject {

    Result makeString(int count, char fileChar);

    void displayString(String text);

}
