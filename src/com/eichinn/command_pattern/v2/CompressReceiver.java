package com.eichinn.command_pattern.v2;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class CompressReceiver implements IReceiver {
    @Override
    public boolean zipExec(String source, String to) {
        System.out.println(source + " --> " + to + " zip compress success!");
        return true;
    }

    @Override
    public boolean gzipExec(String source, String to) {
        System.out.println(source + " --> " + to + " gzip compress success!");
        return true;
    }
}
