package com.basic.java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Blse
 * @date 2017/11/1
 * @description 练习
 */
public class TestStream {

    @Test
    public void test1() {
        Integer[] ints = {1,2,3,4,5};

        List<Integer> collect = Arrays.stream(ints).map((e) -> e * e).collect(Collectors.toList());
        collect.forEach(System.out :: println);
    }
}
