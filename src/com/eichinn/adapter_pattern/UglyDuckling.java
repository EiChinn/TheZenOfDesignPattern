package com.eichinn.adapter_pattern;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class UglyDuckling extends WhiteSwan implements IDuck {
    @Override
    public void cry() {
        super.cry();
    }

    @Override
    public void desAppearance() {
        super.desAppearance();
    }

    @Override
    public void desBehavior() {
        System.out.println("can swim");
        super.fly();
    }
}
