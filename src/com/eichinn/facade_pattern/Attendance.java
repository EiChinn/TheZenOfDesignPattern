package com.eichinn.facade_pattern;

import java.util.Random;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Attendance {
    public int getWorkDays() {
        return (new Random()).nextInt(30);
    }
}
