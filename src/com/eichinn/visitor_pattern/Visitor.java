package com.eichinn.visitor_pattern;

/**
 * Created by ei_chinn on 2016/11/12.
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        calCommonSalary(commonEmployee);
        System.out.println(getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        calManagerSalary(manager);
        System.out.println(getManagerInfo(manager));
    }

    private StringBuilder getBasicInfo(Employee employee) {
        StringBuilder info = new StringBuilder(32);
        info.append("name: ").append(employee.getName()).append("\t");
        info.append("sex: ").append(employee.getSex()).append("\t");
        info.append("salary: ").append(employee.getSalary()).append("\t");
        return info;
    }

    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        StringBuilder basicInfo = getBasicInfo(commonEmployee);
        basicInfo.append("job: ").append(commonEmployee.getJob()).append("\t");
        return basicInfo.toString();
    }
    private String getManagerInfo(Manager manager) {
        StringBuilder basicInfo = getBasicInfo(manager);
        basicInfo.append("performance: ").append(manager.getPerformance()).append("\t");
        return basicInfo.toString();
    }

    private final static int MANAGER_COEFFICIENT = 5;
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    private int commonTotalSalary = 0;
    private int managerTotalSalary = 0;
    @Override
    public int getTotalSalary() {
        return commonTotalSalary + managerTotalSalary;
    }

    private void calManagerSalary(Manager manager) {
        managerTotalSalary += manager.getSalary() * MANAGER_COEFFICIENT;
    }

    private void calCommonSalary(CommonEmployee commonEmployee) {
        commonTotalSalary += commonEmployee.getSalary() * COMMONEMPLOYEE_COEFFICIENT;
    }

}
