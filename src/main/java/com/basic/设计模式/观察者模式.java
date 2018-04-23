package com.basic.设计模式;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/4/6
 * @description
 */
public class 观察者模式 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionalDisplay currentDisplay = new CurrentConditionalDisplay(weatherData);
        weatherData.setMeasurements(80,70,60.f);
    }
}

interface  Observer{

    void update(float temperature, float humidity, float pressure);
}

interface Subject{
    /**
     * 注册观察者
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 删除观察者
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 当主题改变时，这个方法会调用，通知所有观察者
     */
    void notifyObservers();
}

interface DisplayElement{
    void dispaly();
}

class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

class CurrentConditionalDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionalDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        dispaly();
    }

    @Override
    public void dispaly() {
        System.out.println("CurrentConditionalDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", weatherData=" + weatherData +
                '}');
    }
}
