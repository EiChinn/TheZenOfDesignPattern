package com.eichinn.strategy_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Zip implements Algorithm {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " zip compress success!");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " zip uncompress success!");
        return true;
    }
}
