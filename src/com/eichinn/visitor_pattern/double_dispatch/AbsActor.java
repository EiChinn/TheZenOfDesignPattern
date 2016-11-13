package com.eichinn.visitor_pattern.double_dispatch;

/**
 * Created by ei_chinn on 2016/11/13.
 */
public abstract class AbsActor {
    public void act(Role role) {
        System.out.println("An actor can play any Role");
    }

    public void act(KungFuRole kungFuRole) {
        System.out.println("An actor can play the kungfu role");
    }
}
