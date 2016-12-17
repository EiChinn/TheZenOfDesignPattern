package com.eichinn.command_pattern.v2;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public interface IReceiver {
    boolean zipExec(String source, String to);
    boolean gzipExec(String source, String to);
}
