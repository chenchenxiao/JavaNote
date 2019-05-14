package com.basic.java.多线程.高并发.executors;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Blse
 * @date 2019/4/17
 * @description
 */
public class TimerScheduler {


    public static void main(String[] args) {
        Timer timer = new Timer();
        final TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("=======" + System.currentTimeMillis());
            }
        };
        timer.schedule(task, 1000, 1000);
    }

}
