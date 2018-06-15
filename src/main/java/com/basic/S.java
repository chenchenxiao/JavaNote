package com.basic;

import java.util.*;

/**
 * @author Blse
 * @date 2017/12/4
 * @description
 */
public class S extends p {

//    public void m1(List<String> l){
//
//    }
//    public void m1(List<Integer> l){
//
//    }

    static {
        System.out.println("SSSSSSSSS");
    }

    public S() {

    }

    public static void main(String[] args) {
//        Map map = new HashMap();
//        map.put("1",new p());
//        new p();
//        System.out.println("Xmx=" + Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");     //系统的最大空间
//
//        System.out.println("free mem=" + Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");   //系统的空闲空间
//
//        System.out.println("total mem=" + Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");   //当前可用的总空间
//        byte[] b = new byte[1 * 1024 * 1024];
//
//        System.out.println("Xmx=" + Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");   //系统的最大空间
//
//        System.out.println("free mem=" + Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");   //系统的空闲空间
//
//        System.out.println("total mem=" + Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");
//        System.out.println(test1());
//        Integer a = 1;
//        Integer b = 2;
//        Integer c = 3;
//        Integer d = 3;
//        Integer e = 321;
//        Integer f = 321;
//        Long g = 3L;
//        System.out.println(c == d);
//        System.out.println(e == f);
//        System.out.println(c == (a + b));
//        System.out.println(c.equals(a + b));
//        System.out.println(g == (a + b));
//        System.out.println(g.equals(a + b));
//        test2();
       String ss = replaceSpace(new StringBuffer("hello world"));
       System.out.println(ss);
       System.out.println(ss.length());
    }

    public static  String replaceSpace(StringBuffer str) {
        char s = 0;
        int i = 0;
        int length = str.length();
        boolean flag = true;
        while (flag) {
            s = str.charAt(i);
            if (s == ' ') {
                str.setCharAt(i, '%');
                str.insert(i + 1, '2');
                str.insert(i + 2, '0');
                i += 2;
                length += 2;
                str.setLength(length);
                continue;
            }
            i++;
            if (i == length) {
                flag = false;
            }
            System.out.println(i);
        }
        return str.toString();
    }

    static void test2() {
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 =Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.println(i03 == i04);
    }

    public static int test1() {
        int j = 0;
        int i = 0;
        try{
            i = 1;
            return i;
        }finally {
            j = 1;
            i = 2;
            System.out.println("finally" + i);
        }

    }
}
