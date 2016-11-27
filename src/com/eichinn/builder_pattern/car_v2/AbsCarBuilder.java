package com.eichinn.builder_pattern.car_v2;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public abstract class AbsCarBuilder {
    private Blueprint bp;

    public void receiveBlueprint(Blueprint bp) {
        this.bp = bp;
    }

    public Blueprint getBlueprint() {
        return bp;
    }

    public ICar buildCar() {
        return new Car(buildWheel(), buildEngine());
    }

    protected abstract String buildWheel();

    protected abstract String buildEngine();
}
