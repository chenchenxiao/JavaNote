package com.basic.java8.Optional;

import com.basic.java8.stream.Employee;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @author Blse
 * @date 2017/11/2
 * @description Optional测试类
 * Optional容器类：用于尽量避免空指针异常
 * Optional.of（T t）:创建一个Optional实例
 * Optional.empty（）：创建一个空的Optional实例
 * Optional.ofNullable（T t）：若t不为null，创建Optional实例，否则创建空实例
 * isParsent（）：判断是否包含值
 * orElse（T t）：如果调用对象包含值，返回该值，否则返回t
 * orElseGet（Supplier s）：如果调用对象包含值，返回该值，否则返回s获取的值
 * map（Function f）：如果有值对其处理，并返回处理后的Optional，否则返回Optional.empty（）
 * flatMap（Function mapper）：与map类似，要求返回值必须是Optional
 */
public class TestOptional {

    @Test
    public void test1() {
        Optional<Employee> op = Optional.of(new Employee());
        Employee emp = op.get();
        System.out.println(emp);
    }

    @Test
    public void test2() {
        Optional<Employee> op = Optional.ofNullable(new Employee());
        System.out.println(op.get());
        Optional<Employee> op2 = Optional.empty();
        System.out.println(op2.get());
    }

    @Test
    public void test3() {
        Optional<Employee> op = Optional.ofNullable(new Employee());
        Employee employee = op.get();
        System.out.println(employee);
    }

    @Test
    public void test4() {
        Optional<Employee> op = Optional.of(new Employee(101, "张三", 18, 9999.99));
        Optional<String> op2 = op.map(Employee :: getName);
        System.out.println(op2.get());
        Optional<String> op3 = op.flatMap((e) -> Optional.of(e.getName()));
        System.out.println(op3.get());
    }

    @Test
    public void test5() {
        Man man = new Man();
        String name = getGodnessName(man);
        System.out.println(name);
    }

    /**
     * 获取一个God的名字
     * @param man
     * @return
     */
    public String getGodnessName(Man man) {
        if (man != null) {
            Godness g = man.getGod();
            if (g != null) {
                return g.getName();
            }
        }
        return "A";
    }

    public String getGodnessName2(Optional<NewMan> man) {
        return man.orElse(new NewMan())
                  .getGodness()
                  .orElse(new Godness("C"))
                  .getName();
    }


    /**
     * 运用Optional的实体类
     */
    @Test
    public void test6() {
        Optional<Godness> godness = Optional.ofNullable(new Godness("haha"));
        Optional<NewMan> newMan= Optional.ofNullable(new NewMan(godness));
        System.out.println(getGodnessName2(newMan));
    }

}
