package com.basic.java.容器;

import java.util.*;

/**
 * @author Blse
 * @date 2018/1/10
 * @description     测试集合类
 *      使用addAll方法要比使用构造器初始化实例的方式快
 */
public class Collection的addAll方法 {
    public static void main(String[] args) {
        List list = new ArrayList();

        //直接传入一个集合
        list.addAll(Arrays.asList(1,2,3));
        for (Object j : list) {
            System.out.println(j.toString());
        }
        //传入一个集合类和数组，
        Collections.addAll(list,1,2,3);
        for (Object j : list) {
            System.out.println(j.toString());
        }

        //容器类的构造器可以传入一个集合类，来为这个实例初始化
        ArrayList arrayList  = new ArrayList(list);
        for (Object j : arrayList) {
            System.out.println(j.toString());
        }
    }
}
