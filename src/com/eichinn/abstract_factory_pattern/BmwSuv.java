package com.eichinn.abstract_factory_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class BmwSuv extends AbsBmw {
    private final static String X_SERIES = "BMW SUV";
    @Override
    public String getModel() {
        return X_SERIES;
    }
}
