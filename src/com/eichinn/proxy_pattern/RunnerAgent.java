package com.eichinn.proxy_pattern;

import java.util.Random;

/**
 * Created by ei_chinn on 2016/12/4.
 */
public class RunnerAgent implements IRunner {
    private IRunner runner;

    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("RunnerAgent agree the runner run");
            runner.run();
        } else {
            System.out.println("RunnerAgent disagree the runner run");
        }
    }
}
