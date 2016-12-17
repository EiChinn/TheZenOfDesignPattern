package com.eichinn.command_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class ZipReceiver implements IReceiver {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " zip compress success!");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " zip uncompress success!");
        return true;
    }
}
