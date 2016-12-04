package com.eichinn.decorator_pattern.swan;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class Decorator implements ISwan {
    private ISwan swan;

    public Decorator(ISwan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void cry() {
        swan.cry();
    }

    @Override
    public void desAppearance() {
        swan.desAppearance();
    }
}
