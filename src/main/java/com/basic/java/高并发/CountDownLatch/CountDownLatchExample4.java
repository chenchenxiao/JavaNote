package com.basic.java.高并发.CountDownLatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Blse
 * @date 2019/4/13
 * @description
 */
public class CountDownLatchExample4 {

    private static Random random = new Random(System.currentTimeMillis());

    static class Event{
        int id = 0;

        public Event(int id) {
            this.id = id;
        }
    }

    interface Watcher{
        void done(Table table);
    }

    static class TaskBatch implements Watcher{

        private CountDownLatch countDownLatch;

        private TaskGroup taskGroup;

        public TaskBatch(TaskGroup taskGroup, int size) {
            this.taskGroup = taskGroup;
            this.countDownLatch = new CountDownLatch(size);
        }

        @Override
        public void done(Table table) {
            countDownLatch.countDown();
            if (countDownLatch.getCount() == 0) {
                System.out.println("TABLE - " + table.tableName + "FINISHED WORK" + table);
                taskGroup.done(table);
            }
        }
    }

    static class TaskGroup implements Watcher{

        private CountDownLatch countDownLatch;

        private Event event;

        public TaskGroup(int size, Event event) {
            this.countDownLatch = new CountDownLatch(size);
            this.event = event;
        }

        @Override
        public void done(Table table) {
            countDownLatch.countDown();
            if (countDownLatch.getCount() == 0) {
                System.out.println("ALL OF TABLE DONE IN EVENT" + event.id);
            }
        }
    }

    static class Table {
        String tableName;
        long sourceRecordCount = 10;
        long targetCount;
        String sourceColumnSchema = "sourceColumnSchema===";
        String targetCloumnSchema = "targetCloumnSchema";

        public Table(String tableName, int sourceRecordCount) {
            this.tableName = tableName;
            this.sourceRecordCount = sourceRecordCount;
        }

        @Override
        public String toString() {
            return "Table{" +
                    "tableName='" + tableName + '\'' +
                    ", sourceRecordCount=" + sourceRecordCount +
                    ", targetCount=" + targetCount +
                    ", sourceColumnSchema='" + sourceColumnSchema + '\'' +
                    ", targetCloumnSchema='" + targetCloumnSchema + '\'' +
                    '}';
        }
    }
    public static List<Table> capture(Event event) {
        List<Table> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Table("table-" + event.id + " " + i, i * 1000));
        }
        return list;
    }

    public static void main(String[] args) {
        Event[] events = {new Event(1), new Event(2)};
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (Event event : events) {
            List<Table> tables = capture(event);
            TaskGroup taskGroup = new TaskGroup(tables.size(), event);

            for (Table table : tables) {
                TaskBatch taskBatch = new TaskBatch(taskGroup,2);
                TrustSourceColumns columnsRunnable = new TrustSourceColumns(table, taskBatch);
                TrustSourceRecordCount recordCountRunnable = new TrustSourceRecordCount(table, taskBatch);
                executorService.submit(columnsRunnable);
                executorService.submit(recordCountRunnable);
            }

        }
    }

    static class TrustSourceRecordCount implements Runnable{
        private final Table table;

        private final TaskBatch taskBatch;

        public TrustSourceRecordCount(Table table, TaskBatch taskBatch) {
            this.table = table;
            this.taskBatch = taskBatch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            table.targetCount = table.sourceRecordCount;
//            System.out.println("Table - " + table.tableName + " " + table.sourceRecordCount + " DONE AND UPDATE DATA");
            taskBatch.done(table);
        }
    }


    static class TrustSourceColumns implements Runnable{
        private final Table table;

        private final TaskBatch taskBatch;

        public TrustSourceColumns(Table table, TaskBatch taskBatch) {
            this.table = table;
            this.taskBatch = taskBatch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            table.targetCloumnSchema = table.sourceColumnSchema;
//            System.out.println("Table - " + table.tableName + " " + table.targetCloumnSchema + " DONE AND UPDATE DATA");
            taskBatch.done(table);
        }
    }
}
