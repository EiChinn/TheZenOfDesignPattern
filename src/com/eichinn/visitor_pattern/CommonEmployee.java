package com.eichinn.visitor_pattern;

/**
 * Created by ei_chinn on 2016/11/12.
 */
public class CommonEmployee extends Employee {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    protected String getOtherInfo() {
        return "job: " + this.getJob() + "\t";
    }
}
