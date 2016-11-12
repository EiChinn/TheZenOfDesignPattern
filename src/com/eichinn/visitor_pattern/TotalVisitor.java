package com.eichinn.visitor_pattern;

/**
 * Created by ei_chinn on 2016/11/12.
 */
public class TotalVisitor implements ITotalVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        commonTotalSalary += commonEmployee.getSalary() * COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public void visit(Manager manager) {
        managerTotalSalary += manager.getSalary() * MANAGER_COEFFICIENT;
    }

    @Override
    public void totalSalary() {
        System.out.println("total salary is " + (commonTotalSalary + managerTotalSalary));
    }

    private final static int MANAGER_COEFFICIENT = 5;
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    private int commonTotalSalary = 0;
    private int managerTotalSalary = 0;

}
