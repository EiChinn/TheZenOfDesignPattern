package com.eichinn.bridge_pattern;

/**
 * Created by ei_chinn on 2016/11/26.
 */
public class House extends Product {
    @Override
    protected void produce() {
        System.out.println("House produce");
    }

    @Override
    protected void sell() {
        System.out.println("House sell");
    }
}
