package com.eichinn.interpreter_pattern;

import java.util.HashMap;

/**
 * Created by ei_chinn on 2016/11/20.
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
