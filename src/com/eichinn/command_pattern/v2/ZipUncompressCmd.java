package com.eichinn.command_pattern.v2;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class ZipUncompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String resource, String to) {
        return umcompressReceiver.zipExec(resource, to);
    }
}
