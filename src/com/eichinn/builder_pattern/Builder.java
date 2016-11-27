package com.eichinn.builder_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public abstract class Builder {
    protected final SuperMan superMan = new SuperMan();

    protected void setBody(String body) {
        superMan.setBody(body);
    }

    protected void setSpecialTalent(String specialTalent) {
        superMan.setSpecialTalent(specialTalent);
    }

    protected void setSpecialSymbol(String specialSymbol) {
        superMan.setSpecialSymbol(specialSymbol);
    }

    protected abstract SuperMan getSuperMan();
}
