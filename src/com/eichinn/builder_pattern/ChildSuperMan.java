package com.eichinn.builder_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class ChildSuperMan extends Builder {
    @Override
    protected SuperMan getSuperMan() {
        setBody("ChildSuperMan's body");
        setSpecialTalent("ChildSuperMan's special talent");
        setSpecialSymbol("ChildSuperMan's special symbol");
        return superMan;
    }
}
