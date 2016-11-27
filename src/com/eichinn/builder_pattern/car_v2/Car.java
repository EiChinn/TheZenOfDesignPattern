package com.eichinn.builder_pattern.car_v2;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class Car implements ICar {
    private String wheel;
    private String engine;

    public Car(String wheel, String engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    public String getWheel() {
        return null;
    }

    @Override
    public String getEngine() {
        return null;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel='" + wheel + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
