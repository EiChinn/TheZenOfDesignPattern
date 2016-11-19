package com.eichinn.state_pattern;

/**
 * Created by ei_chinn on 2016/11/19.
 */
public class Lift implements ILift {
    private int state;

    public Lift() {
        this.state = STOPPING_STATE;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    @Override
    public void open() {
        //电梯在什么情况下才能打开
        switch (getState()) {
            case STOPPING_STATE:
            case CLOSING_STATE:
                openWithoutLogic();
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
            case OPENING_STATE:
                //do nothing
                break;
            default:
                break;
        }
    }

    @Override
    public void close() {
        //电梯在什么情况下才能关闭
        switch (getState()) {
            case STOPPING_STATE:
            case RUNNING_STATE:
            case CLOSING_STATE:
                //do nothing
                break;
            case OPENING_STATE:
                closeWithoutLogic();
                setState(CLOSING_STATE);
                break;
            default:
                break;
        }
    }

    @Override
    public void run() {
        //电梯在什么情况下可以运行
        switch (this.state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                runWithoutLogic();
                setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
            case OPENING_STATE:
                //do nothing
                break;
            default:
                break;
        }

    }

    @Override
    public void stop() {
        //电梯在什么情况下可以停止
        switch (this.state) {
            case RUNNING_STATE:
            case CLOSING_STATE:
                stopWithoutLogic();
                setState(STOPPING_STATE);
                break;
            case OPENING_STATE:
            case STOPPING_STATE:
                //do nothing
                break;
            default:
                break;
        }
    }

    private void openWithoutLogic() {
        System.out.println("open");
    }

    private void closeWithoutLogic() {
        System.out.println("close");
    }

    private void runWithoutLogic() {
        System.out.println("run");

    }

    private void stopWithoutLogic() {
        System.out.println("stop");

    }
}
