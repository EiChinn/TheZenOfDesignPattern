package com.eichinn.command_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class GzipReceiver implements IReceiver {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " gzip compress success!");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " gzip uncompress success!");
        return true;
    }
}
