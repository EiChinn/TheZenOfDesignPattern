package com.eichinn.decorator_pattern.swan;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class BeautifyAppearance extends Decorator {
    public BeautifyAppearance(ISwan swan) {
        super(swan);
    }

    @Override
    public void desAppearance() {
        System.out.println("Swan' beautiful appearance");
    }
}
