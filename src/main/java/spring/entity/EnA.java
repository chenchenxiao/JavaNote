package spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Blse
 * @date 2018/5/26
 * @description
 */


public class EnA {

    @Autowired
    enc enc;

    public EnA() {
        System.out.println("enA---");
    }

    public enc getEnc() {
        return enc;
    }
}
