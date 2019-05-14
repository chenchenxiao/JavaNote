package spring.AOP.JDK动态代理;

/**
 * @author Blse
 * @date 2019/3/26
 * @description
 */
public class Main {

    public static void main(String[] args) {
        ILawSuit proxy= (ILawSuit) ProxyFactory.getDynProxy(new CuiHuaNiu());
        proxy.submit("工资流水在此");
        proxy.defend();
    }
}
