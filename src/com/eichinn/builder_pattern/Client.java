package com.eichinn.builder_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class Client {
    public static void main(String[] args) {
        SuperMan adultSuperMan = Director.getAdultSuperMan();
        System.out.println(adultSuperMan.getSpecialSymbol());
    }
}
