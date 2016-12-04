package com.eichinn.adapter_pattern;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class Client {
    public static void main(String[] args) {
        IDuck duck = new Duckling();
        duck.cry();
        duck.desAppearance();
        duck.desBehavior();

        IDuck uglyDuckling = new UglyDuckling();
        uglyDuckling.cry();
        uglyDuckling.desAppearance();
        uglyDuckling.desBehavior();
    }
}
