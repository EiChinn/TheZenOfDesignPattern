package com.eichinn.decorator_pattern.swan;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class StrongBehavior extends Decorator {
    public StrongBehavior(ISwan swan) {
        super(swan);
    }

    @Override
    public void fly() {
        System.out.println("Swan can fly");
    }
}
