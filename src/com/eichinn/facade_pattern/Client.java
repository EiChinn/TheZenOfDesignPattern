package com.eichinn.facade_pattern;

import java.util.Date;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Client {
    public static void main(String[] args) {
        HRFacade hrFacade = new HRFacade();

        System.out.println(hrFacade.querySalary("ei_chinn", new Date()));
        System.out.println(hrFacade.queryWorkDays("Shana"));
    }
}
