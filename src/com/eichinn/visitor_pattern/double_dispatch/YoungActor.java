package com.eichinn.visitor_pattern.double_dispatch;

/**
 * Created by ei_chinn on 2016/11/13.
 */
public class YoungActor extends AbsActor {
    @Override
    public void act(KungFuRole kungFuRole) {
        System.out.println("A young actor like to play the kungfu role best");
    }
}
