package com.eichinn.command_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Client {
    public static void main(String[] args) {
        AbstractCmd cmd = new ZipCompressCmd();

        Invoker invoker = new Invoker(cmd);

        invoker.execute("c:\\windows", "d;\\windows.zip");

        System.out.println("------------------");
        invoker = new Invoker(new GzipCompressCmd());

        invoker.execute("c:\\windows", "d;\\windows.gz");
    }
}
