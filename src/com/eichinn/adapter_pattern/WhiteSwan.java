package com.eichinn.adapter_pattern;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class WhiteSwan implements ISwan {
    @Override
    public void fly() {
        System.out.println("WhiteSwan fly");
    }

    @Override
    public void cry() {
        System.out.println("WhiteSwan cry");
    }

    @Override
    public void desAppearance() {
        System.out.println("WhiteSwan desAppearance");
    }
}
