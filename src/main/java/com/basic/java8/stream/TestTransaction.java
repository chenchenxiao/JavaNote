package com.basic.java8.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Blse
 * @date 2017/11/1
 * @description
 */
public class TestTransaction {

    List<Transaction> transactions = null;

    @Before
    public void before(){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    /**
     * 找出所有2011年发送的交易，并按从低到高的顺序排序
     */
    @Test
    public void test1() {
        Stream<Transaction> sorted = transactions.stream()
                .filter((e) -> e.getYear() == 2011)
                .sorted((x, y) ->  - Integer.compare(x.getValue(), y.getValue()));
        sorted.forEach(System.out :: println);

    }

    /**
     * 交易员都在哪些不同的地区工作过
     */

    @Test
    public void test2() {
        transactions.stream().map((e) -> e.getTrader().getCity())
                    .distinct().forEach(System.out :: println);
    }

    /**
     * 查找所有来自剑桥的交易员，按名字排序
     */

    @Test
    public void test3() {
       transactions.stream().filter((e) -> e.getTrader().getCity().equals("Cambridge"))
                   .map(Transaction :: getTrader).sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
                   .forEach(System.out :: println);

    }

    /**
     * 返回所有的交易员的姓名字符串，按字母顺序排序
     */

    @Test
    public void test4() {
        transactions.stream().map((e) -> e.getTrader().getName()).sorted().forEach(System.out :: println);
    }

    /**
     * 有没有员工所在米兰工作过的
     */
    @Test
    public void test5() {
        transactions.stream().filter((e) -> e.getTrader().getCity().equals("Milan")).forEach(System.out :: println);
    }

    /**
     * 打印生活在剑桥的交易员的所有交易额
     */
    @Test
    public void test6() {
        transactions.stream().filter((e) -> e.getTrader().getCity().equals("Cambridge"))
                    .map(Transaction :: getValue).forEach(System.out :: println);
    }

    /**
     * 所有交易中，最高交易额是多少
     */
    @Test
    public void test7() {
        Optional<Integer> max = transactions.stream().map(Transaction::getValue).max(Double::compare);
        System.out.println(max.get());
    }

    /**
     * 找到交易额最小的交易
     */
    @Test
    public void test8() {
        Optional<Transaction> min = transactions.stream().min((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()));
        System.out.println(min.get());
    }
}
