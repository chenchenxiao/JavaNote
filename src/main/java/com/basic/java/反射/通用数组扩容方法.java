package com.basic.java.反射;

import java.lang.reflect.Array;

/**
 * @author Blse
 * @date 2018/2/1
 * @description
 */
public class 通用数组扩容方法 {

    static Object goodArrayGrow(Object o) {
        Class clazz = o.getClass();
        System.out.println("clazz-->" + clazz);
        if (!clazz.isArray()) {
            return null;
        }
        Class compentype = clazz.getComponentType();
        System.out.println("compentype-->" + compentype);
        int length = Array.getLength(o);
        int newLength = length * 11 / 10 + 10;
        Object newArray = Array.newInstance(compentype, newLength);
        System.arraycopy(o, 0, newArray, 0, length);
        return newArray;
    }

    public static void main(String[] args) {
        goodArrayGrow(new Panana[]{new Panana()});
    }
}

class Panana{
}