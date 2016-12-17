package com.eichinn.mediator;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public abstract class AbsColleague {
    protected AbsMediator mediator;

    public AbsColleague(AbsMediator mediator) {
        this.mediator = mediator;
    }
}
