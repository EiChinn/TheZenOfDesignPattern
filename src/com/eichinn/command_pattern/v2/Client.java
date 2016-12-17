package com.eichinn.command_pattern.v2;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Client {
    public static void main(String[] args) {
        AbstractCmd cmd = new GzipCompressCmd();

        Invoker invoker = new Invoker(cmd);

        invoker.execute("c:\\windows", "d;\\windows.gz");
    }
}
