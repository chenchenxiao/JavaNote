package com.basic.exception;

/**
 * @author Blse
 * @date 2017/12/3
 * @description
 */
public class 异常 {

    public 异常() {
        super();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(testExcption());
    }

    public static String testExcption() {
            try {
                System.out.println("first");
                return "try" ;
//            int i = 2 / 0;
//            System.out.println("second");
            } catch (Exception e) {
                System.out.println("1");
                throw new Exception("cuole");
            } finally {
                System.out.println("finallly");
                return"finally";
            }

    }
}
