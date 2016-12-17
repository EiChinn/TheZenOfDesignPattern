package com.eichinn.command_pattern.v2;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class ZipCompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String resource, String to) {
        return compressReceiver.zipExec(resource, to);
    }
}
