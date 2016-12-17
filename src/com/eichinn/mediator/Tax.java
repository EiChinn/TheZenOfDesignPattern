package com.eichinn.mediator;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Tax extends AbsColleague implements ITax {
    public Tax(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void raise() {
        mediator.up(this);
    }

    @Override
    public void drop() {
        mediator.down(this);
    }
}
