package com.eichinn.visitor_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ei_chinn on 2016/11/12.
 */
public class Client {
    public static void main(String[] args) {
        IShowVisitor showVisitor = new ShowVisitor();
        ITotalVisitor totalVisitor = new TotalVisitor();
        for (Employee employee : mockEmployee()) {
            employee.accept(showVisitor);
            employee.accept(totalVisitor);
        }
        showVisitor.report();
        totalVisitor.totalSalary();
    }

    private static List<Employee> mockEmployee() {
        List<Employee> employeeList = new ArrayList<>();

        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("Java");
        zhangSan.setName("ZhangSan");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.Sex.MALE);
        employeeList.add(zhangSan);

        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("UI");
        lisi.setName("LiSi");
        lisi.setSalary(1900);
        lisi.setSex(Employee.Sex.FEMALE);
        employeeList.add(lisi);

        Manager wangWu = new Manager();
        wangWu.setPerformance("negative");
        wangWu.setName("WangWu");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.Sex.MALE);
        employeeList.add(wangWu);

        return employeeList;

    }
}
