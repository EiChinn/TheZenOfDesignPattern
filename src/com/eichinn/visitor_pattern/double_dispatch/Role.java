package com.eichinn.visitor_pattern.double_dispatch;

/**
 * Created by ei_chinn on 2016/11/13.
 */
public interface Role {
    void accept(AbsActor actor);
}
