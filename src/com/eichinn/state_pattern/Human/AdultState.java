package com.eichinn.state_pattern.Human;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class AdultState extends HumanState {
    @Override
    public void work() {
        System.out.println("Adult work");
        human.setHumanState(Human.OLD_STATE);
    }
}
