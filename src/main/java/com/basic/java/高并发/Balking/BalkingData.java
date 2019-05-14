package com.basic.java.高并发.Balking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author Blse
 * @date 2019/4/7
 * @description
 */
public class BalkingData {

    private final String fileName;

    private String content;

    private boolean changed;

    public BalkingData(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
        this.changed = true;
    }

    public synchronized  void change(String newContent) {
        this.changed = true;
        this.content = content;
    }

    public synchronized void save() throws IOException {
        if (!changed) {
            return ;
        }
        doSave();
        this.changed = false;
    }

    private void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName() + " calls do save,content=" + content);
        try(Writer writer = new FileWriter(fileName, true)) {
            writer.write(content);
            writer.write("\n");
            writer.flush();
        }

    }

}

