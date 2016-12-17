package com.eichinn.strategy_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Context {
    private Algorithm al;

    public Context(Algorithm al) {
        this.al = al;
    }

    public boolean compress(String source, String to) {
        return al.compress(source, to);
    }

    public boolean uncompress(String source, String to) {
        return al.uncompress(source, to);
    }
}
