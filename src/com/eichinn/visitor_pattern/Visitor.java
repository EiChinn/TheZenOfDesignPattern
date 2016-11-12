package com.eichinn.visitor_pattern;

/**
 * Created by ei_chinn on 2016/11/12.
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
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


}
