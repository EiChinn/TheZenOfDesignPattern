package com.eichinn.abstract_factory_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public abstract class AbsBenz implements ICar {
    private final static String BENZ_BAND = "benz";
    @Override
    public String getBand() {
        return BENZ_BAND;
    }
}
