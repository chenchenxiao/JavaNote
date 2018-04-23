package com.basic.java.内部类;
import java.util.Date;
/**
 * @author Blse
 * @date 2017/11/27
 * @description
 */
public class Static {

    class StaA{
        class B {

        }
    }

    public static void main(String[] args) {
        new Static();
        Date date = new Date();
        System.out.println(date.getTime());
        String str = date.toString();
        System.out.println(str);
    }
}
