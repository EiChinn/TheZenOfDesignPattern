package com.eichinn.decorator_pattern.swan;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Long long age, there is a uglyDuckling");
        ISwan uglyDuckling = new UglyDuckling();
        uglyDuckling.cry();
        uglyDuckling.fly();
        uglyDuckling.desAppearance();
        System.out.println("finally, she has found out she is a swan");
        uglyDuckling = new BeautifyAppearance(uglyDuckling);
        uglyDuckling = new StrongBehavior(uglyDuckling);
        uglyDuckling.cry();
        uglyDuckling.fly();
        uglyDuckling.desAppearance();
    }
}
