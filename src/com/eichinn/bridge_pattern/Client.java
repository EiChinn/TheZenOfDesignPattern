package com.eichinn.bridge_pattern;

/**
 * Created by ei_chinn on 2016/11/26.
 */
public class Client {
    public static void main(String[] args) {
        HouseCrop houseCrop = new HouseCrop(new House());
        houseCrop.makeMoney();
        System.out.println();
        ShanZhaiCrop shanZhaiCrop = new ShanZhaiCrop(new IPod());
        shanZhaiCrop.makeMoney();
    }
}
