package com.eichinn.state_pattern;

/**
 * Created by ei_chinn on 2016/11/19.
 */
public interface ILift {
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;
    void open();
    void close();
    void run();
    void stop();
}
