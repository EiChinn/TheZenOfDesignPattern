package com.eichinn.builder_pattern.car_v2;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class Clinet {
    public static void main(String[] args) {
        Director director = new Director();
        ICar benzSuv = director.createBenzSuv();
        System.out.println(benzSuv);
        ICar complexCar = director.createComplexCar();
        System.out.println(complexCar);
    }
}
