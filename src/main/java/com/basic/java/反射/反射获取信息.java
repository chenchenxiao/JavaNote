package com.basic.java.反射;

import java.lang.reflect.Field;

/**
 * @author Blse
 * @date 2018/2/1
 * @description
 */
public class 反射获取信息 {
    public static void main(String[] args) {
        Class clazz = String.class;
        for (Field field : clazz.getDeclaredFields()){
            System.out.println(field);
        }
        try {
            System.out.println(clazz.getDeclaredField("value").get(new String()));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
