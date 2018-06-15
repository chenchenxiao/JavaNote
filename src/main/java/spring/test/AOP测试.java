package spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.AOP.ServiceImpl;

/**
 * @author Blse
 * @date 2018/5/26
 * @description
 */
public class AOP测试 {

    ApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testA() {
        ServiceImpl service = (ServiceImpl) context.getBean("serviceImpl");
        service.methodA();
    }

}
