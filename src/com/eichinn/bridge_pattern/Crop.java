package com.eichinn.bridge_pattern;

/**
 * Created by ei_chinn on 2016/11/26.
 */
public abstract class Crop {
    private Product product;

    public Crop(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        product.produce();
        product.sell();
    }
}
