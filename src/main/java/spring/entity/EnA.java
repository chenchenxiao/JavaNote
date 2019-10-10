package spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Blse
 * @date 2018/5/26
 * @description
 */

@Component(value = "a")
public class EnA {

    private String name = "CXH";

    public String number = null;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public EnA() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
