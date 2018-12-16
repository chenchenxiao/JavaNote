package com.basic.test;

/**
 * @author Blse
 * @date 2018/10/8
 * @description
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test.B().getValue());
    }
}

class Test {
    static class A {
        protected int value;
        public A (int v) {
            setValue(v);
        }
        public void setValue(int value) {
            System.out.println("parentSet");
            this.value= value;
        }
        public int getValue() {
            try {
                value ++;
                return value;
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
        }
    }
    static class B extends A {
        public B () {
            super(5);
            setValue(getValue()- 3);
        }
        public void setValue(int value) {
            System.out.println("childSet");
            super.setValue(2 * value);
        }
    }
}