package com.eichinn.decorator_pattern;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class Client {
    public static void main(String[] args) {
        IRunner runner = new Runner();
        IRunner runnerWithJet = new RunnerWithJet(runner);
        runnerWithJet.run();
    }
}
