package com.eichinn.facade_pattern;

import java.util.Date;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class HRFacade {
    private SalaryProvider s = new SalaryProvider();
    private Attendance attendance = new Attendance();

    public int querySalary(String name, Date date) {
        return s.totalSalary();
    }

    public int queryWorkDays(String name) {
        return attendance.getWorkDays();
    }
}
