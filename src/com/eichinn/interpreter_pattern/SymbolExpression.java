package com.eichinn.interpreter_pattern;

/**
 * Created by ei_chinn on 2016/11/20.
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
