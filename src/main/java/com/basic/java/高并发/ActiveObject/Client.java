package com.basic.java.高并发.ActiveObject;

import org.omg.PortableInterceptor.ACTIVE;

/**
 * @author Blse
 * @date 2019/4/8
 * @description  Active Object模式是一种异步编程模式。它通过对方法的调用与方法的执行进行解耦来提高并发性。
 *               若以任务的概念来说，Active Object模式的核心则是它允许任务的提交（相当于对异步方法的调用）和任务的执行（相当于异步方法的真正执行）分离。
 *               这有点类似于System.gc()这个方法：客户端代码调用完gc()后，一个进行垃圾回收的任务被提交，但此时JVM并不一定进行了垃圾回收，而可能是在gc()方法调用返回后的某段时间才开始执行任务——回收垃圾。
 *              我们知道，System.gc()的调用方代码是运行在自己的线程上（通常是main线程派生的子线程），而JVM的垃圾回收这个动作则由专门的线程（垃圾回收线程）来执行的。
 *              换言之，System.gc()这个方法所代表的动作（其所定义的功能）的调用方和执行方是运行在不同的线程中的，从而提高了并发性。
 */
public class Client {

    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new MakerClientThread(activeObject, "Alice").start();
        new MakerClientThread(activeObject, "Bobby").start();

        new DisplayClientThread("Chris", activeObject).start();
    }

}
