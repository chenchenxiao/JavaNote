package com.basic;

/**
 * @author Blse
 * @date 2018/6/26
 * @description
 */
public class 引用测试 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "A";
        new 引用测试().change(student);
        System.out.println(student.name);
    }

    public  void change(Student student) {
        student.name = "B";
        student = null;
    }

}


class Student{
    public String name;
}