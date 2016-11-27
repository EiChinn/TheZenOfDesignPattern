package com.eichinn.abstract_factory_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class BenzFactory implements CarFactory {
    @Override
    public ICar createSuv() {
        return new BenzSuv();
    }

    @Override
    public ICar createVan() {
        return new BenzVan();
    }
}
