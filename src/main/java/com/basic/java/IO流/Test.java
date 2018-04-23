package com.basic.java.IO流;

import java.io.*;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

/**
 * @author Blse
 * @date 2018/2/6
 * @description
 */
public class Test {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("I:\\basic\\src\\main\\java\\com\\basic\\java\\text.txt"),true);
        out.print("test");
        out.close();
//        File file = new File("D:\\software");
//        for (int i = 0; i < file.list().length; i++){
//            System.out.println(file.list()[i]);
//
//        }
//        File file = new File("text.txt");
//        System.out.println(file.getCanonicalFile().getAbsolutePath());
    }
}
