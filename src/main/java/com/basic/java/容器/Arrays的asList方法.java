package com.basic.java.容器;

import com.basic.model.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Blse
 * @date 2018/1/10
 * @description
 *      下面的方法是会报错的（UnsupportedOperationException  不支持操作类型）
 *      因为asList方法，返回的是Arrays类的静态内部类，并不是寻常的那个
 *      底层是一个用了final声明的数组，所以长度是不可变的
 *      所以不能add和delete，该方法是限制是对所产生的List做出来做理想的假设
 */
public class Arrays的asList方法 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 5);
        list.add(4);
    }
}
