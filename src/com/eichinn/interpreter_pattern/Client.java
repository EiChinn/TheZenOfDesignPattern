package com.eichinn.interpreter_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by ei_chinn on 2016/11/20.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("The result of the expression is: " + calculator.run(var));

    }

    //获得表达式
    public static String getExpStr() throws IOException {
        System.out.println("please input the expression: ");
        InputStreamReader isr = new InputStreamReader(System.in, "utf-8");
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }

    //获得值映射
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> result = new HashMap<>();
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!result.containsKey(String.valueOf(ch))) {
                    System.out.println("please input the value of " + ch + ": ");
                    InputStreamReader isr = new InputStreamReader(System.in, "utf-8");
                    BufferedReader br = new BufferedReader(isr);
                    Integer value = Integer.valueOf(br.readLine());
                    result.put(String.valueOf(ch), value);
                }
            }
        }

        return result;
    }
}
