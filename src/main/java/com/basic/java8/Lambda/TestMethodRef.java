package com.basic.java8.Lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.*;

/**
 * @author Blse
 * @date 2017/10/31
 * @description 引用
 *               一、方法的引用：若lambda体中的功能，已经有方法提供了实现，可以使用方法引用（可以理解为lambda表达式的另一种表现）
 *                  1、对象的引用::实例方法名
 *                  2、类名::静态方法名
 *                  3、类名::实例方法名
 *                  注意！！
 *                      方法引用所引用的方法的参数列表与返回值类型，需要与函数式接口中方法的参数列表和返回值类型一致
 *                      若Lambda的参数列表的第一个参数，所实例方法的调用者，第二个参数的实例方法的参数时，格式：ClassName::MethodName
 *               二、构造器引用：构造器的参数列表，需要与函数式接口中方法的参数列表一致
 *                  1、类名：：new
 *               三、数组引用
 *                  类型[] ：：new
 */
public class TestMethodRef {

    @Test
    public void test7() {
        Function<Integer,String[]> function = (a) -> new String[a];
        System.out.println(function.apply(10).length);

        Function<Integer,Employee[]> function1 = Employee[] :: new;
        System.out.println(function1.apply(20).length);
    }

    /**
     * 构造器引用
     */
    @Test
    public void test6() {
        Supplier<Employee> supplier = () -> new Employee();
        System.out.println(supplier.get());

        Supplier<Employee> employeeSupplier = Employee :: new;
        System.out.println(supplier.get());
    }

    /**
     * 类名：：实例方法名
     */
    @Test
    public void test5() {
        BiPredicate<String, String> bp = (x,y) -> x.equals(y);
        System.out.println(bp.test("a","a"));
        BiPredicate<String, String> biPredicate = String :: equals;
        System.out.println(biPredicate.test("a","a"));

        Function<Employee, String> function = (e) -> e.show();
        Function<Employee, String> function2 = Employee :: show;
        System.out.println(function.apply(new Employee()));
        System.out.println(function2.apply(new Employee()));

    }

    /**
     * 类名：：静态方法名
     */
    @Test
    public void test4() {
        Comparator<Integer> comparator = (x,y) -> Integer.compare(x,y);
        System.out.println(comparator.compare(1,2));
        Comparator<Integer> comparator1 = Integer :: compare;
        System.out.println(comparator.compare(2,3));
    }

    @Test
    public void test3() {
        BiFunction<Double,Double,Double> function = (x, y) -> Math.max(x,y);
        System.out.println(function.apply(50.d,40.d));
        BiFunction<Double,Double,Double> function1 = Math :: max;
        System.out.println(function1.apply(3.d,40.d));
    }

    /**
     * 对象的引用：：实例方法名
     */
    @Test
    public void test2() {
        Employee employee = new Employee("A",40,2000);
        Supplier<String> supplier = () -> employee.getName();
        System.out.println(supplier.get());
        Supplier<String> supplier1 = employee :: getName;
        System.out.println(supplier1.get());
    }


    @Test
    public void test1() {
        Consumer<String> con = (str) -> System.out.println(str);
        con.accept("HelloWorld");
        Consumer<String> con1 = System.out :: println;
        con1.accept("helloworld");
    }
}
