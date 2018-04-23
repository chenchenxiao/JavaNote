package com.basic.java.String字符串;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Blse
 * @date 2018/1/29
 * @description     find(),matches,lookingAt都可以看是否匹配成功
 *                   find在任意位置匹配，matches匹配整个输入的字符串，lookingAt匹配字符串的第一部分
 */
public class 正则表达式 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^Java");
        String str = "Java now has regular expression";
        Matcher matcher = pattern.matcher(str);
        while (matcher.matches()) {
            System.out.println(matcher.group());
        }
    }
}
