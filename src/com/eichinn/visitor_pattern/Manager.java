package com.eichinn.visitor_pattern;

/**
 * Created by ei_chinn on 2016/11/12.
 */
public class Manager extends Employee {
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    protected String getOtherInfo() {
        return "performance: " + this.getPerformance() + "\t";
    }
}
