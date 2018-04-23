package com.basic.java.正则;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Blse
 * @date 2018/2/7
 * @description
 */
public class Test {
    public static void main(String[] args) {
//        number("12345a");
//          phone("11414057676");
//          email("125043312@qq.com");
        nameCh("12345612");
    }

    //手机号
    public static void phone(String phone){
        System.out.println(phone.matches("1[3578]\\d{9}"));
    }

    //1-6位数字或字母
    public static void number(String num){
        System.out.println(num.matches("[\\d\\w]{1,6}"));
    }

    //邮箱
    public static void email(String email){
        System.out.println(email.matches("[.]+@[.]+\\.com"));
    }

    //用户名. 字母数字下划线10位以内, 必须是字母开头
    public static void nameCh(String name){
//        String regex = "[a-zA-Z]\\w{0,9}";
        System.out.println(name.matches("[[a-zA-z]+[a-zA-z0-9_]]{0,9}"));
    }
}
