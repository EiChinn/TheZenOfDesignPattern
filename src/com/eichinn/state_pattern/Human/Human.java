package com.eichinn.state_pattern.Human;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Human {
    public static final HumanState CHILD_STATE = new ChildState();
    public static final HumanState ADULT_STATE = new AdultState();
    public static final HumanState OLD_STATE = new OldState();

    private HumanState humanState;

    public void setHumanState(HumanState humanState) {
        this.humanState = humanState;
        humanState.setHuman(this);
    }

    public void work() {
        humanState.work();
    }
}
