package com.eichinn.proxy_pattern;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class Client {
    public static void main(String[] args) {
        IRunner runner = new Runner();
        IRunner runnerAgent = new RunnerAgent(runner);
        runnerAgent.run();
    }
}
