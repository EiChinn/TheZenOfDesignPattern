package com.eichinn.state_pattern;

/**
 * Created by ei_chinn on 2016/11/19.
 */
public class ClosingState extends LiftState {
    @Override
    public void open() {
        context.setLiftState(Context.openningState);
        context.open();
    }

    @Override
    public void close() {
        System.out.println("close");
    }

    @Override
    public void run() {
        context.setLiftState(Context.runningState);
        context.run();
    }

    @Override
    public void stop() {
        context.setLiftState(Context.stoppingState);
        context.stop();
    }
}
