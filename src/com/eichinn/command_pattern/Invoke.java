package com.eichinn.command_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Invoke {
    private AbstractCmd cmd;

    public Invoke(AbstractCmd cmd) {
        this.cmd = cmd;
    }

    public boolean execute(String source, String to) {
        return cmd.execute(source, to);
    }
}
