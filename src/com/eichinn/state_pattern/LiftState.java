package com.eichinn.state_pattern;

/**
 * Created by ei_chinn on 2016/11/19.
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
