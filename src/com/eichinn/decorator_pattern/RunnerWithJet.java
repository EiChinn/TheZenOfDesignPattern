package com.eichinn.decorator_pattern;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class RunnerWithJet implements IRunner {
    private IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        System.out.println("Runner With Jet");
        runner.run();
    }
}
