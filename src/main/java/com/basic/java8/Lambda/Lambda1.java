package com.basic.java8.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Blse
 * @date 2017/10/31
 * @description
 */
public class Lambda1 {


    List<Employee> employees = Arrays.asList(
            new Employee("A",20,5000),
            new Employee("B",15,4000),
            new Employee("C",20,6000),
            new Employee("D",20,3000)
    );

    /**
     * 策略设计模式
     * @param emps
     * @param mp
     * @return
     */
    public List<Employee> filterEmployee(List<Employee> emps, MyPredicate<Employee> mp) {
        List<Employee> list = new ArrayList<>();

        for (Employee employee : emps) {
            if(mp.test(employee)){
                list.add(employee);
            }
        }

        return list;
    }

    /**
     * Lambda表达式
     */
    @Test
    public void test1() {
        List<Employee> list = filterEmployee(employees,(e) -> e.getSalary() >= 5000 );
        list.forEach(System.out :: println);
    }

    /**
     * Stream  API
     */
    @Test
    public void test2() {
        employees.stream()
                 .filter((e) -> e.getSalary() >= 5000)
                 .limit(1)
                 .forEach(System.out :: println);
    }
}
