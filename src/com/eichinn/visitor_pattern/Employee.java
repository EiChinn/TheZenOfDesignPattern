package com.eichinn.visitor_pattern;

/**
 * Created by ei_chinn on 2016/11/12.
 */
public abstract class Employee {
    static enum Sex {
        MALE, FEMALE
    }

    private String name;
    private int salary;
    private Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    protected abstract String getOtherInfo();

    public final void report() {
        StringBuilder info = new StringBuilder(32);
        info.append("name: ").append(this.getName()).append("\t");
        info.append("sex: ").append(this.getSex()).append("\t");
        info.append("salary: ").append(this.getSalary()).append("\t");
        info.append(getOtherInfo());
        System.out.println(info);

    }


}
