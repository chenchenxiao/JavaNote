package com.basic.java.容器;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Blse
 * @date 2018/2/27
 * @description
 */
public class Test {

//3194802   48
    public static void main(String[] args) {
        String s = "haha";
        int hash = s.hashCode();
        int hash2 = hash ^ (hash >>> 16);
        System.out.println(hash2);
        System.out.println(hash2 % 52);
        System.out.println(hash2 & 51);
    }
}
