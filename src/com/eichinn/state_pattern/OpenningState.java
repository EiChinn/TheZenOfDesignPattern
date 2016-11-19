package com.eichinn.state_pattern;

/**
 * Created by ei_chinn on 2016/11/19.
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void close() {
        context.setLiftState(Context.closingState);
        context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
