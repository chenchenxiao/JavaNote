package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.entity.EnA;
import spring.entity.enc;

/**
 * @author Blse
 * @date 2018/5/26
 * @description
 */

public class IOC测试 {

    private ApplicationContext context;

    @Autowired
    EnA enA;

    @Autowired
    enc c;

    @Before
    public void getContainer() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void 测试IOC() {
//        EnA a  = enA;
        EnA a = (EnA) context.getBean("a");
        System.out.println("a + " + a.getName());
        System.out.println("a + " + a.getNumber());
//        enc c = (enc) context.getBean("c");
//        System.out.println(a.getEnc() == c);

    }

    @Test
    public void 测试2() {
        System.out.println(enA);
        System.out.println(c);
    }
}
