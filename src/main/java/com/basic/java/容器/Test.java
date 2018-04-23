package com.basic.java.容器;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Blse
 * @date 2018/2/27
 * @description
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
//        list.add(2,10);
        list.remove(2);
        System.out.println(list.toString());
    }
}
