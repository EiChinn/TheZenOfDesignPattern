package com.eichinn.state_pattern;

/**
 * Created by ei_chinn on 2016/11/19.
 */
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void stop() {
        context.setLiftState(Context.stoppingState);
        context.stop();
    }
}
