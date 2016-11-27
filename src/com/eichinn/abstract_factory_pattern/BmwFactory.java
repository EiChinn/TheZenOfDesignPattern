package com.eichinn.abstract_factory_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class BmwFactory implements CarFactory {
    @Override
    public ICar createSuv() {
        return new BmwSuv();
    }

    @Override
    public ICar createVan() {
        return new BmwVan();
    }
}
