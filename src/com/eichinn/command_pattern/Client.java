package com.eichinn.command_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Client {
    public static void main(String[] args) {
        AbstractCmd cmd = new ZipCompressCmd();

        Invoke invoke = new Invoke(cmd);

        invoke.execute("c:\\windows", "d;\\windows.zip");

        System.out.println("------------------");
        invoke = new Invoke(new GzipCompressCmd());

        invoke.execute("c:\\windows", "d;\\windows.gz");
    }
}
