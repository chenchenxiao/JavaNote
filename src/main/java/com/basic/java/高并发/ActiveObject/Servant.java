package com.basic.java.高并发.ActiveObject;

import com.basic.java.高并发.ActiveObject.ActiveObject;
import com.basic.java.高并发.ActiveObject.RealResult;
import com.basic.java.高并发.ActiveObject.Result;

/**
 * @author Blse
 * @date 2019/4/8
 * @description
 */
public class Servant implements ActiveObject {


    @Override
    public Result makeString(int count, char fillChar) {
        char[] buf = new char[count];
        for (int i = 0; i < count; i++) {
            buf[i] = fillChar;
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
        return new RealResult(new String(buf));
    }

    @Override
    public void displayString(String text) {
        try {
            System.out.println("Display:" + text);
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
