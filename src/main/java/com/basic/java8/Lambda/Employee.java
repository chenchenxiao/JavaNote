package com.basic.java8.Lambda;

/**
 * @author Blse
 * @date 2017/10/31
 * @description
 */
public class Employee {
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public String show() {
        return "测试方法引用！";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
    }
}
