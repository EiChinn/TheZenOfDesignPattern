package com.eichinn.mediator;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public abstract class AbsMediator {
    protected final IPosition position;
    protected final ISalary salary;
    protected final ITax tax;

    public AbsMediator() {
        position = new Position(this);
        salary = new Salary(this);
        tax = new Tax(this);
    }


    public abstract void up(ISalary salary);
    public abstract void up(IPosition position);
    public abstract void up(ITax tax);
    public abstract void down(IPosition position);
    public abstract void down(ISalary salary);
    public abstract void down(ITax tax);
}
