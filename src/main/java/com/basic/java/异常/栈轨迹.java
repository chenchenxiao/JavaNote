package com.basic.java.异常;

/**
 * @author Blse
 * @date 2018/1/26
 * @description     getStackTrace方法可以直接访问printStackTrace方法所提供的信息(Class,方法名等)
 *                   该方法将返回一个由栈轨迹的元素所构成的元素数组，每个元素都是一桢
 *                   如果用throws把异常往上抛，那么处理的程序的printStackTrace方法只会显示抛出点的信息
 *                   要用fillInStackTrace才会显示处理点的信息
 */
public class 栈轨迹 {
    static void mA(){
        try{
            throw new Exception();
        }catch (Exception e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement.getMethodName());
            }
        }
    }

    static void mB(){
        mA();
    }

    public static void main(String[] args) {
        mA();
        System.out.println("-------------");
        mB();
    }
}
