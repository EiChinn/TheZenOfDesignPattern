package com.eichinn.visitor_pattern.double_dispatch;

/**
 * Created by ei_chinn on 2016/11/13.
 */
public class OldActor extends AbsActor{
    @Override
    public void act(KungFuRole kungFuRole) {
        System.out.println("An old actor can't play a kungfu role because of his age");
    }
}
