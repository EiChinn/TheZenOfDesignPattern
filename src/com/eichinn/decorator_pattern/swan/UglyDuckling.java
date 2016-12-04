package com.eichinn.decorator_pattern.swan;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class UglyDuckling implements ISwan {
    @Override
    public void fly() {
        System.out.println("UglyDuckling fly");
    }

    @Override
    public void cry() {
        System.out.println("UglyDuckling cry");
    }

    @Override
    public void desAppearance() {
        System.out.println("UglyDuckling desAppearance");
    }
}
