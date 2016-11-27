package com.eichinn.abstract_factory_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class BenzVan extends AbsBenz {
    private final static String R_SERIES = "Benz Van";

    @Override
    public String getModel() {
        return R_SERIES;
    }
}
