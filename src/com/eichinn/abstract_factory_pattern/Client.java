package com.eichinn.abstract_factory_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class Client {
    public static void main(String[] args) {
        CarFactory benzFactory = new BenzFactory();
        ICar benzSuv = benzFactory.createSuv();
        System.out.println(benzSuv.getBand() + " : " + benzSuv.getModel());
    }
}
