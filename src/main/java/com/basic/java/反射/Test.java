package com.basic.java.反射;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Blse
 * @date 2018/1/31
 * @description
 */
public class Test<T>{

    private Class<?> beanClass;

    private Class<?> clazz;

    public Test() {
        Class c = this.getClass();
        Type t = c.getGenericSuperclass();
        if (t instanceof ParameterizedType) {
//          System.out.println("in if");
            Type[] p = ((ParameterizedType) t).getActualTypeArguments();
//          System.out.println(Arrays.toString(p));
            this.clazz = (Class<?>) p[0];
            System.out.println(clazz.getName());
        }
    }

    public static void main(String[] args) {
        new Test<Apple>();
    }

}

class Apple{

}
