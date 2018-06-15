package com.basic.jvm.GC;

/**
 * @author Blse
 * @date 2018/1/2
 * @description
 */
public class 常用参数 {
    public static void main(String[] args) {
        byte[] bytes = new byte[1024 * 1024 ];
        //最大可用内存，对应-Xmx
        System.out.println("MaxMemory = " + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
        //当前JVM空闲内存
        System.out.println("FreeMemory = " + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
        //当前JVM占用的内存总数，其值相当于当前JVM已使用的内存及freeMemory()的总和
        System.out.println("TotalMemory = " + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
    }
}
