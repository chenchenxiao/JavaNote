package com.basic.java.内部类;

/**
 * @author Blse
 * @date 2017/11/27
 * @description 接口内部类
 */
public interface Interface {
    void test();
    class Inter implements Interface {
        public void test() {
            System.out.println("test");
        }
    }
    public static void main(String[] args) {
        new Inter().test();
    }
}
