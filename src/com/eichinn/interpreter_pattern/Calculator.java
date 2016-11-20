package com.eichinn.interpreter_pattern;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by ei_chinn on 2016/11/20.
 */
public class Calculator {
    private Expression expression;

    public Calculator(String expStr) {
        //定义一个栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        char[] chars = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression((String.valueOf(chars[++i])));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }

        expression = stack.pop();

    }

    public int run(HashMap<String, Integer> var) {
        return expression.interpreter(var);
    }
}
