package com.eichinn.strategy_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new Zip());

        context.compress("c:\\windows", "d;\\windows.zip");
        context.uncompress("c:\\windows.zip", "d;\\windows");

        System.out.println("-------------------");
//        context = new Context(new Gzip());
        context.setAl(new Gzip());

        context.compress("c:\\windows", "d;\\windows.gz");
        context.uncompress("c:\\windows.gz", "d;\\windows");
    }
}
