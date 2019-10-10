package com.basic.java.高并发.Balking;

/**
 * @author Blse
 * @date 2019/4/7
 * @description
 */
public class BalkingClient {

    public static void main(String[] args) {
        BalkingData balkingData = new BalkingData("D:\\balking.txt", "==BEGIN");
        new CustomerThread(balkingData).start();
        new WaiterThread(balkingData).start();
    }

}
