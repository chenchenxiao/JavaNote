package com.basic.java.高并发.Observer;

/**
 * @author Blse
 * @date 2019/4/3
 * @description
 */
public interface LifeCycleListener {

    void onEvent(ObserverableRunnable.RunnableEvent event);

}
