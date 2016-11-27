package com.eichinn.abstract_factory_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class BenzSuv extends AbsBenz {
    private final static String G_SERIES = "Benz SUV";
    @Override
    public String getModel() {
        return G_SERIES;
    }
}
