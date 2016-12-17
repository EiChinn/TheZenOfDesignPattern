package com.eichinn.state_pattern.Human;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class ChildState extends HumanState {
    @Override
    public void work() {
        System.out.println("Child work");
        human.setHumanState(Human.ADULT_STATE);
    }
}
