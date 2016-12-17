package com.eichinn.facade_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class SalaryProvider {
    private BasicSalary basicSalary = new BasicSalary();

    private Bonus bonus = new Bonus();

    private Performance performance = new Performance();

    private Tax tax = new Tax();

    public int totalSalary() {
        return basicSalary.getBasicSalary() + bonus.getBonus() + performance.getPerformance() - tax.getTax();
    }
}
