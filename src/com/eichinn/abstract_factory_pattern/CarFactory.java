package com.eichinn.abstract_factory_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public interface CarFactory {
    ICar createSuv();
    ICar createVan();
}
