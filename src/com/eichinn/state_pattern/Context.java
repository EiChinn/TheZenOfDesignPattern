package com.eichinn.state_pattern;

/**
 * Created by ei_chinn on 2016/11/19.
 */
public class Context {
    //定义出所有的电梯状态
    public final static OpenningState openningState= new OpenningState();
    public final static ClosingState closingState= new ClosingState();
    public final static RunningState runningState= new RunningState();
    public final static StoppingState stoppingState= new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        liftState.open();
    }

    public void close() {
        liftState.close();
    }

    public void run() {
        liftState.run();
    }

    public void stop() {
        liftState.stop();
    }
}
