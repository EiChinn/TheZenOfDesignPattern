package com.eichinn.state_pattern.Human;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public abstract class HumanState {
    protected Human human;

    public void setHuman(Human human) {
        this.human = human;
    }

    public abstract void work();
}
