package com.eichinn.visitor_pattern.double_dispatch;

/**
 * Created by ei_chinn on 2016/11/13.
 */
public class Clinet {
    public static void main(String[] args) {
        AbsActor actor = new OldActor();
        Role role = new KungFuRole();
        actor.act(role);
        actor.act(new KungFuRole());
    }
}
