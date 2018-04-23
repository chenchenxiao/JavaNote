package com.basic.java8.Lambda;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Blse
 * @date 2017/10/31
 * @description Lambda表达式的操作符 ->  ，将Lambda拆分成两部分
 *               左侧：表达式的参数列表
 *               右侧：表达式中所需执行的功能
 *               Lambda表达式需要“函数式接口的支持”,可以使用@FunctionalInterface注解来修饰，检查是否是函数式接口
 *               函数式接口：只有一个抽象方法的接口
 *               四大内置函数式接口：
 *                  1.Consumer<T>：消费型接口
 *                      void accept(T t)
 *                  2.Supplier<T>：供给型接口
 *                      T get()
*                  ３.Function<T,R>：函数式接口
 *                      R apply(T t)
 *                 4.Predicate<T>:断言型接口
 *                     boolean test(T t)
 */
public class Lambda2 {

    /**
     * 语法一：
     * 无参，无返回值
     */
    @Test
    public void test1() {
        Runnable r = () -> System.out.println("语法一：无参，无返回值");
        r.run();
    }

    /**
     * 语法二：
     * 有一个参数，无返回值
     * 如果只有一个参数，小括号可以不写
     */
    @Test
    public void test2() {
        Consumer con = x -> System.out.println(x);
        con.accept("语法二：有一个参数，无返回值");
    }

    /**
     *语法三：
     * 有多个参数，多条执行语句，有返回值
     * 多条语句要写在大括号内
     */
    @Test
    public void test3() {
        Comparator<Integer> comparator = (x,y) -> {
            System.out.println("语法三：有多个参数，多条语句，有返回值");
            return Integer.compare(x,y);
        };
    }

    /**
     *语法四：
     * 有多个参数，只有一条执行语句，有返回值
     * 大括号和return都可以省略不写
     */
    @Test
    public void test4() {
        Comparator<Integer> comparator = (x, y) ->  Integer.compare(x,y);
    }

    /**
     * 语法五：
     * Lambda表达式的参数类型可以不写，因为JVM可以通过上下推断出数据类型，即“类型推断”
     * 如果要类型的话就所有参数都要写
     */
    @Test
    public void test5() {
        Comparator<Integer> comparator = (Integer x, Integer y) ->  Integer.compare(x,y);
    }


    @Test
    public void test6(){
        System.out.println(operation(100, (y) -> y + 100));
    }

    public Integer operation(int num, MyFun myFun) {
        return myFun.getValue(num);
    }

    /**
     * 消费型接口
     */
    @Test
    public void test7() {
        happy(100,(m) -> System.out.println("哈哈哈:" + m));
    }

    public void happy(double money, Consumer<Double> con) {
        con.accept(money);
    }

    /**
     * 供给型接口
     */
    @Test
    public void test8() {
        getNums(100, () ->  (int)(Math.random() * 100))
        .forEach(System.out :: println);
    }

    public List<Integer> getNums(int num, Supplier<Integer> supplier) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    /**
     * 函数式接口
     */
    @Test
    public void test9() {
        String str = strHandler("你的名字", (s) -> s.substring(2,4));
        System.out.println(str);
    }

    public String strHandler(String str, Function<String, String> fun) {
        return fun.apply(str);
    }

    /**
     * 断言型接口
     */
    @Test
    public void test10() {
        List<String> strings = Arrays.asList("Hello", "you", "are", "so", "handsome");
        filter(strings,(s) -> s.length() > 3).forEach(System.out :: println);

    }

    public List<String> filter(List<String> list, Predicate<String> predicate) {
        List<String> strings = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)){
                strings.add(s);
            }
        }
        return strings;
    }

}


