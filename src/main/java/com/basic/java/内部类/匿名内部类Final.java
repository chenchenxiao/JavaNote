package com.basic.java.内部类;

/**
 * @author Blse
 * @date 2017/11/27
 * @description java8之后，如果内部类要使用外部类的变量就不用加final了
 */
public class 匿名内部类Final {
    String st = null;
    public 匿名内部类Final(String str){
        this.st = str;
    }

    public  classA method(String str){
        return new classA(){
                private String temp = str;
                @Override
                public String innerMethodA(){
                    return temp;
                }
        };
    }

    public static void main(String[] args) {
        System.out.println(new 匿名内部类Final("haha").method("hehe").innerMethodA());
    }
}

interface classA{
    String innerMethodA();
}

