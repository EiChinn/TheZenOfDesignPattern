package com.eichinn.facade_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Bonus {
    private Attendance attendance = new Attendance();
    public int getBonus() {
        int workDays = attendance.getWorkDays();
        int bonus = workDays * 1800 / 30;
        return bonus;
    }
}
