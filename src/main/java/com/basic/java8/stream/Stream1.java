package com.basic.java8.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Blse
 * @date 2017/10/31
 * @description Stream
 *               Stream的操作步骤
 *               1、创建Stream
 *               2、中间操作
 *               3、终止操作
 */
public class Stream1 {

    List<Employee> emps = Arrays.asList(
            new Employee(102, "李四", 59, 6666.66, Employee.Status.BUSY),
            new Employee(101, "张三", 18, 9999.99, Employee.Status.FREE),
            new Employee(103, "王五", 28, 3333.33, Employee.Status.VOCATION),
            new Employee(104, "赵六", 8, 7777.77, Employee.Status.BUSY),
            new Employee(104, "赵六", 8, 7777.77, Employee.Status.FREE),
            new Employee(104, "赵六", 8, 7777.77, Employee.Status.FREE),
            new Employee(105, "田七", 38, 5555.55, Employee.Status.BUSY)
    );


    /**
     * 2. 中间操作
     * map——接收 Lambda ， 将元素映射转换成其他形式或提取信息。接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
     * flatMap——接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
     */

    @Test
    public void test1(){
        Stream<String> str = emps.stream()
                .map((e) -> e.getName());

        System.out.println("-------------------------------------------");

        List<String> strList = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");

        Stream<String> stream = strList.stream()
                .map(String::toUpperCase);

        stream.forEach(System.out::println);

        Stream<Stream<Character>> stream2 = strList.stream()
                .map(Stream1::filterCharacter);

        stream2.forEach((sm) -> {
            sm.forEach(System.out::println);
        });
        System.out.println("---------------------------------------------");
        Stream<Character> stream3 = strList.stream()
                .flatMap(Stream1::filterCharacter);

        stream3.forEach(System.out::println);
    }


    public static Stream<Character> filterCharacter(String str){
        List<Character> list = new ArrayList<>();

        for (Character ch : str.toCharArray()) {
            list.add(ch);
        }

        return list.stream();
    }

    /**
     * sorted()——自然排序   重写hashCode和equals方法进行排序
     * sorted(Comparator com)——定制排序    自定义排序规则
     */
    @Test
    public void test2(){
        emps.stream()
                .map(Employee::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        emps.stream()
                .sorted((x, y) -> {
                    if(x.getAge() == y.getAge())	{
                        return x.getName().compareTo(y.getName());
                    }else{
                        return Integer.compare(x.getAge(), y.getAge());
                    }
        }).forEach(System.out::println);
    }


    /**
     * 3、终止操作,流进行了终止操作后，不能再次使用
     * allMatch——检查是否匹配所有元素
     * anyMatch——检查是否至少匹配一个元素
     * noneMatch——检查是否没有匹配的元素
     * findFirst——返回第一个元素
     * findAny——返回当前流中的任意元素
     * count——返回流中元素的总个数
     * max——返回流中最大值
     * min——返回流中最小值
     *
     */

    @Test
    public void test10() {
        boolean b1 = emps.stream().allMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);
    }

    @Test
    public void test11() {
        Optional<Employee> first = emps.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .findFirst();
        System.out.println(first.get());
    }

    @Test
    public void test12() {
        long count = emps.stream().filter((e) -> e.getStatus().equals(Employee.Status.FREE))
                .count();
        System.out.println(count);
        Optional<Double> max = emps.stream()
                                   .map(Employee::getSalary)
                                   .max(Double::compare);
        System.out.println(max.get());
    }

    @Test
    public void test13() {
        Stream<Employee> stream = emps.stream()
                                      .filter((e) -> e.getStatus().equals(Employee.Status.FREE));
        long count = stream.count();
        stream.map(Employee :: getSalary).max(Double :: compare);
    }

    /**
     * 归约
     * reduce(T identity, BinaryOperator) / reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。
     */
    @Test
    public void test14() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer sum = list.stream().reduce(0, (x,y) -> x + y);
        System.out.println(sum);

        Optional<Double> reduce = emps.stream().map(Employee::getSalary).reduce(Double::sum);
        System.out.println(reduce.get());
    }

    /**
     * 搜索名字中“六”出现的次数
     */
    @Test
    public void test15() {
       Optional<Integer> sum = emps.stream()
                .map(Employee :: getName)
                .flatMap(Stream1 :: filterCharacter)
                .map((ch) -> {
                    if (ch.equals("六")) {
                        return 1;
                    } else {
                        return 0;
                    }
                }).reduce(Integer :: sum);
        System.out.println(sum.get());
    }

    /**
     * collect将流转换成其他形式，接收一个Collector接口的实现，用于给Stream中元素做汇总的方法
     * 
     */
    @Test
    public void test16() {
        List<Employee> list = emps.stream()
                .filter((e) -> e.getSalary() > 5000)
//                .map(Employee :: getName)
                .collect(Collectors.toList());
        list.forEach(System.out :: println);
    }

    /**
     * 求值
     * 最大值，最小值，平均值等
     */
    @Test
    public void test17() {
        Optional<Double> max = emps.stream().map(Employee :: getSalary)
                .collect(Collectors.maxBy(Double :: compare));
        System.out.println(max.get());

        Optional<Employee> op = emps.stream()
                .collect(Collectors.minBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));

        System.out.println(op.get());
    }

    /**
     * 分组
     */
    @Test
    public void test18() {
        Map<Employee.Status, Map<String, List<Employee>>> map = emps.stream()
                .collect(Collectors.groupingBy(Employee::getStatus, Collectors.groupingBy((e) -> {
            if (e.getAge() >= 60) {
                return "老年";
            } else if (e.getAge() >= 35) {
                return "中年";
            } else {
                return "成年";
            }
        })));
        System.out.println(map);
    }

    /**
     * 分区
     */
    @Test
    public void test7(){
        Map<Boolean, List<Employee>> map = emps.stream()
                .collect(Collectors.partitioningBy((e) -> e.getSalary() >= 5000));

        System.out.println(map);
    }


    @Test
    public void test8(){
        String str = emps.stream()
                .map(Employee::getName)
                .collect(Collectors.joining("," , "----", "----"));

        System.out.println(str);
    }

    @Test
    public void test9(){
        Optional<Double> sum = emps.stream()
                .map(Employee::getSalary)
                .collect(Collectors.reducing(Double::sum));

        System.out.println(sum.get());
    }
}
