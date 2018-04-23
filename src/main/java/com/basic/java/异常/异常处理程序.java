package com.basic.java.异常;

/**
 * @author Blse
 * @date 2018/1/27
 * @description     try块后面至少有一个catch块，否则至少一个finally块
 *                   这种情况会导致异常丢失
 */
public class 异常处理程序 {

    public static void main(String[] args) {
        try{
            throw new Exception();
        } finally {
            return;
        }
    }
}
