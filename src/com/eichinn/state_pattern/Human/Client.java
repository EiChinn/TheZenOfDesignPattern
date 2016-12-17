package com.eichinn.state_pattern.Human;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Client {
    public static void main(String[] args) {
        Human human = new Human();
        human.setHumanState(Human.CHILD_STATE);
        human.work();
        human.work();
        human.work();
    }
}
