package com.basic.JVM.GC;

/**
 * @author Blse
 * @date 2018/1/2
 * @description
 */
public class 可恢复对象 {
    public static 可恢复对象 obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("called");
        obj = this;
    }

    @Override
    public String toString() {
        return "I am 可恢复对象";
    }

    public static void main(String[] args) {
        obj = new 可恢复对象();
        obj = null;
        System.gc();
        System.out.println("第一次GC");
        if (obj == null) {
            System.out.println("1--- null");
        } else {
            System.out.println("1---  notNull");
        }
        System.out.println("第二次GC");
        obj = null;
        System.gc();
        if (obj == null) {
            System.out.println("2--- null");
        } else {
            System.out.println("2---  notNull");
        }
    }
}
