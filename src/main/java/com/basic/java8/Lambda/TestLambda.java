package com.basic.java8.Lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Blse
 * @date 2017/10/31
 * @description  练习
 */
public class TestLambda {

    List<Employee> employees = Arrays.asList(
            new Employee("A",20,5000),
            new Employee("B",15,4000),
            new Employee("C",20,6000),
            new Employee("D",20,3000)
    );

    @Test
    public void test1() {
        Collections.sort(employees,(e1,e2) -> {
            if (e1.getAge() == e2.getAge()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });
        employees.forEach(System.out :: println);
    }

    @Test
    public void test2() {
        String str = testTer("abcdefg",(x) -> x.toUpperCase());
        String strFinal = testTer(str,(x) -> x.substring(2,4));
        System.out.println(strFinal);
    }

    public String testTer(String str, inter in) {
        return in.getValue(str);
    }
}


interface inter {
    String getValue(String str);
}