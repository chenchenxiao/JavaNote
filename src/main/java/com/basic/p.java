package com.basic;




import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * @author Blse
 * @date 2017/12/4
 * @description
 */

public class p{

     static String name;


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize");
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
//        new p(a);
//        System.out.println("main");
//        System.gc();
//        int[] i = new int[Integer.MAX_VALUE * 10];
//            p pp = new p();
//        System.out.println(1<<30);
        System.out.println(new Pa().equals(new Pa()));
    }
}

class Pa{
    public int i = 2;

}

class So extends Pa{

    int i = 3;
    {
        System.out.println(i);
    }
}


