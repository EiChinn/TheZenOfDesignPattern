package com.eichinn.adapter_pattern;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class Duckling implements IDuck {
    @Override
    public void desBehavior() {
        System.out.println("Duckling desBehavior");
    }

    @Override
    public void cry() {
        System.out.println("Duckling cry");
    }

    @Override
    public void desAppearance() {
        System.out.println("Duckling desAppearance");
    }
}
