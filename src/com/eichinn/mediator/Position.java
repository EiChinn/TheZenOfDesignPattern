package com.eichinn.mediator;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Position extends AbsColleague implements IPosition {
    public Position(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void promote() {
        mediator.up(this);
    }

    @Override
    public void demote() {
        mediator.down(this);
    }
}
