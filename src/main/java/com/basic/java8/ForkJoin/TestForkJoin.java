package com.basic.java8.ForkJoin;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

/**
 * @author Blse
 * @date 2017/11/2
 * @description java8并行流和串行流
 */
public class TestForkJoin {

    /**
     * 通过StreamApi可以声明式性地通过parallerl()与sequential(),在并行流与顺序流间进行切换。
     */
    @Test
    public void test1() {
        Instant start = Instant.now();
        long reduce = LongStream.rangeClosed(0, 1000000000L)
                .parallel()
                .reduce(0, Long::sum);
        Instant end = Instant.now();
        System.out.println(Duration.between(start,end).toMillis());
    }
}
