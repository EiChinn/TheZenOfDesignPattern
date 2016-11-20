package com.eichinn.interpreter_pattern;

import java.util.HashMap;

/**
 * Created by ei_chinn on 2016/11/20.
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return left.interpreter(var) - right.interpreter(var);
    }
}
