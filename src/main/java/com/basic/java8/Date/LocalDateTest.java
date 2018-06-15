package com.basic.java8.Date;


import org.junit.jupiter.api.Test;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

/**
 * @author Blse
 * @date 2017/11/5
 * @description
 */
public class LocalDateTest {
    /**
     * 获取当前时间，有getyear等方法可以获取年份，月份等
     * 有plusYears方法可以增加年份
     */
    @Test
    public void test1() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }

    /**
     * Instant : 时间戳。 （使用 Unix 元年  1970年1月1日 00:00:00 所经历的毫秒值）
     */
    @Test
    public void test2() {
        //默认使用UTC时区
        Instant instant = Instant.now();
        System.out.println(instant);
        //时差相差8个小时
        OffsetDateTime odt = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(odt);
    }

    /**
     * Duration : 用于计算两个“时间”间隔
     * Period : 用于计算两个“日期”间隔
     */
    @Test
    public void test3() {
        Instant ins1 = Instant.now();

        System.out.println("--------------------");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        Instant ins2 = Instant.now();

        Duration distant = Duration.between(ins1, ins2);
        System.out.println(distant);

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2011,1,1);
        System.out.println(Period.between(d1,d2));
    }

    /**
     * TemporalAdjuster : 时间校正器
     */

    @Test
    public void test4() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //把月份改为10
        LocalDateTime ldt2 = ldt.withDayOfMonth(10);
        System.out.println(ldt2);
        LocalDateTime ldt3 = ldt.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(ldt3);
        //自定义：下一个工作日
        LocalDateTime ldt5 = ldt.with((e) -> {
            LocalDateTime ldt4 = (LocalDateTime) e;
            DayOfWeek dow = ldt4.getDayOfWeek();
            if (dow.equals(DayOfWeek.SUNDAY)) {
                return ldt4.plusDays(2);
            }
            return ldt4.plusDays(1);
        });
        System.out.println(ldt5);
    }

    /**
     * DateTimeFormatter : 解析和格式化日期或时间
     */
    @Test
    public void test5() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDateTime ldt = LocalDateTime.now();
        String strDate = ldt.format(dtf);
        System.out.println(strDate);
        LocalDateTime newLdt = LocalDateTime.parse(strDate, dtf);
        System.out.println(newLdt);
    }

    /**
     * 世界各地各城市
     */
    @Test
    public void test6(){
        Set<String> set = ZoneId.getAvailableZoneIds();
        set.forEach(System.out::println);
    }

    /**
     * 6.ZonedDate、ZonedTime、ZonedDateTime ： 带时区的时间或日期
     */
    @Test
    public void test7(){
        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(ldt);
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("US/Pacific"));
        System.out.println(zdt);
    }

    @Test
    public void test8() {
        new B().prin();
    }
}
    class B extends A{
        public int a = 3;
    }
    class A{
        public int a = 2;
        public void prin() {
            System.out.println(this.a);
        }
    }