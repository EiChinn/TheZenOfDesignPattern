package com.eichinn.builder_pattern.car_v2;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class CarBuilder extends AbsCarBuilder {

    @Override
    protected String buildWheel() {
        return getBlueprint().getWheel();
    }

    @Override
    protected String buildEngine() {
        return getBlueprint().getEngine();
    }
}
