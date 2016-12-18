package com.eichinn.specification_pattern;

/**
 * Created by ei_chinn on 2016/12/18.
 */
public abstract class CompositeSepcification implements IUserSpecification {

    @Override
    public IUserSpecification and(IUserSpecification specification) {
        return new AndSpecification(this, specification);
    }

    @Override
    public IUserSpecification or(IUserSpecification specification) {
        return new OrSpecification(this, specification);
    }

    @Override
    public IUserSpecification not() {
        return new NotSpecification(this);
    }
}
