package com.basic.jvm.GC;

/**
 * @author Blse
 * @date 2018/1/2
 * @description   对象的可触及性，finalize只会执行一次，只会在GC时执行
 */
public class 对象的可触及性 {
    public static 对象的可触及性 obj;

    public 对象的可触及性() {
        super();
    }

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
    public static void main(String[] args) throws InterruptedException {
        obj = new 对象的可触及性();
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


