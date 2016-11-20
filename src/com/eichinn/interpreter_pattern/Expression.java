package com.eichinn.interpreter_pattern;

import java.util.HashMap;

/**
 * Created by ei_chinn on 2016/11/20.
 */
public abstract class Expression {
    //解析公式和数值，其中var中的key值是公式中的参数，value值是具体数字
    public abstract int interpreter(HashMap<String, Integer> var);
}
