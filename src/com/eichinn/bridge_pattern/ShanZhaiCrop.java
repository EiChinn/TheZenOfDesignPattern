package com.eichinn.bridge_pattern;

/**
 * Created by ei_chinn on 2016/11/26.
 */
public class ShanZhaiCrop extends Crop {
    public ShanZhaiCrop(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("ShanZhai product make money");
    }
}
