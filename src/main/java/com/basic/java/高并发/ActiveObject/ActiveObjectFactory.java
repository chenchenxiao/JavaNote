package com.basic.java.高并发.ActiveObject;

/**
 * @author Blse
 * @date 2019/4/8
 * @description
 */
public class ActiveObjectFactory {

    private ActiveObjectFactory() {
    }

    public static ActiveObject createActiveObject(){
        Servant servant = new Servant();
        ActivationQueue queue = new ActivationQueue();
        SchedulerThread schedulerThread = new SchedulerThread(queue);
        ActiveObjectProxy proxy = new ActiveObjectProxy(schedulerThread, servant);
        schedulerThread.start();
        return proxy;
    }

}
