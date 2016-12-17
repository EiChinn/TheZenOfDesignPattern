package com.eichinn.command_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public abstract class AbstractCmd {
    protected IReceiver zip = new ZipReceiver();
    protected IReceiver gzip = new GzipReceiver();

    public abstract boolean execute(String source, String to);
}
