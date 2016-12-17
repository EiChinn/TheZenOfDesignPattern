package com.eichinn.command_pattern.v2;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class UncompressReceiver implements IReceiver {
    @Override
    public boolean zipExec(String source, String to) {
        System.out.println(source + " --> " + to + " zip uncompress success!");
        return true;
    }

    @Override
    public boolean gzipExec(String source, String to) {
        System.out.println(source + " --> " + to + " gzip uncompress success!");
        return true;
    }
}
