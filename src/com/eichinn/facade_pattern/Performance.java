package com.eichinn.facade_pattern;

import java.util.Random;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Performance {
    private BasicSalary basicSalary = new BasicSalary();

    public int getPerformance() {
        int perf = (new Random()).nextInt(100);
        return basicSalary.getBasicSalary() * perf / 100;
    }
}
