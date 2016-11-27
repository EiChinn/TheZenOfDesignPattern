package com.eichinn.abstract_factory_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class BmwVan extends AbsBmw {
    private final static String SEVENT_SERIES = "BMW Van";
    @Override
    public String getModel() {
        return SEVENT_SERIES;
    }
}
