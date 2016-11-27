package com.eichinn.abstract_factory_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public abstract class AbsBmw implements ICar {
    private final static String BMW_BAND = "bmw";
    @Override
    public String getBand() {
        return BMW_BAND;
    }
}
