package spring.AOP.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynProxyLawyer implements InvocationHandler {
     private Object target;//被代理的对象

     public DynProxyLawyer(Object obj){
         this.target=obj;
     }

     @Override
     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         System.out.println("案件进展："+method.getName());
         Object result=method.invoke(target,args); return result;
     }
}
