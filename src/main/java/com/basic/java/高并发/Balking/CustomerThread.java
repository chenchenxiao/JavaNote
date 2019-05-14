package com.basic.java.高并发.Balking;

import java.io.IOException;
import java.util.Random;

/**
 * @author Blse
 * @date 2019/4/7
 * @description
 */
public class CustomerThread extends Thread {

    private final BalkingData balkingData;

    private final Random random = new Random(System.currentTimeMillis());

    public CustomerThread(BalkingData balkingData) {
        super("Customer");
        this.balkingData = balkingData;
    }

    @Override
    public void run() {
        try {
            balkingData.save();
            for (int i = 0; i < 20; i++) {
                balkingData.change("NO." + i);
                Thread.sleep(random.nextInt(1000));
                balkingData.save();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
