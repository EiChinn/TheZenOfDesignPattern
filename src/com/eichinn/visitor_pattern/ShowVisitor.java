package com.eichinn.visitor_pattern;

/**
 * Created by ei_chinn on 2016/11/12.
 */
public class ShowVisitor implements IShowVisitor {
    private StringBuilder info = new StringBuilder(32);
    @Override
    public void visit(CommonEmployee commonEmployee) {
        getCommonEmployeeInfo(commonEmployee);
    }

    @Override
    public void visit(Manager manager) {
        getManagerInfo(manager);
    }

    private StringBuilder getBasicInfo(Employee employee) {
        StringBuilder info = new StringBuilder(32);
        info.append("name: ").append(employee.getName()).append("\t");
        info.append("sex: ").append(employee.getSex()).append("\t");
        info.append("salary: ").append(employee.getSalary()).append("\t");
        return info;
    }

    private void getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        info.append(getBasicInfo(commonEmployee)).append("job: ").append(commonEmployee.getJob()).append("\t\n");
    }
    private void getManagerInfo(Manager manager) {
        info.append(getBasicInfo(manager)).append("performance: ").append(manager.getPerformance()).append("\t\n");
    }

    @Override
    public void report() {
        System.out.println(this.info);
    }
}
