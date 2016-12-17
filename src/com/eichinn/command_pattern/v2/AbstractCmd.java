package com.eichinn.command_pattern.v2;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public abstract class AbstractCmd {
    protected IReceiver compressReceiver = new CompressReceiver();
    protected IReceiver umcompressReceiver = new UncompressReceiver();

    public abstract boolean execute(String resource, String to);
}
