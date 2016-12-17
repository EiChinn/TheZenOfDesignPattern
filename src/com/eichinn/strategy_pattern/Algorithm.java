package com.eichinn.strategy_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public interface Algorithm {
    boolean compress(String source, String to);
    boolean uncompress(String source, String to);
}
