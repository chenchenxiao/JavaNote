package com.basic.java.高并发.executors;

import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * @author Blse
 * @date 2019/4/17
 * @description
 */
public class QuartzSchedule {
    /**
     * 如果一个任务完成要5秒，定时是2秒，会以周期为主，另起一个
     * @param args
     * @throws SchedulerException
     */
    public static void main(String[] args) throws SchedulerException {
        JobDetail job = newJob(com.basic.java.多线程.高并发.executors.SimpleJob.class).withIdentity("Job1", "Group1").build();
        Trigger trigger = newTrigger().withIdentity("trigger1", "group1")
                .withSchedule(cronSchedule("0/2 * * * * ?")).build();
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);
    }

}
