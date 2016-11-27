package com.eichinn.builder_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class Director {
    private static Builder adultBuilder = new AdultSuperMan();
    private static Builder childBuilder = new ChildSuperMan();

    public static SuperMan getAdultSuperMan() {
        return adultBuilder.getSuperMan();
    }

    public static SuperMan getChildSuperMan() {
        return childBuilder.getSuperMan();
    }
}
