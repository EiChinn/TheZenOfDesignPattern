package com.eichinn.mediator;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Salary extends AbsColleague implements ISalary {
    public Salary(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void increaseSalary() {
        mediator.up(this);
    }

    @Override
    public void decreaseSalary() {
        mediator.down(this);
    }
}
