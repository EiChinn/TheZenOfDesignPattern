package com.eichinn.builder_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class AdultSuperMan extends Builder {
    @Override
    protected SuperMan getSuperMan() {
        setBody("AdultSuperMan's body");
        setSpecialTalent("AdultSuperMan's special talent");
        setSpecialSymbol("AdultSuperMan's special symbol");
        return superMan;
    }
}
