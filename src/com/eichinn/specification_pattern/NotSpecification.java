package com.eichinn.specification_pattern;

/**
 * Created by ei_chinn on 2016/12/18.
 */
public class NotSpecification extends CompositeSepcification {
    private IUserSpecification specification;

    public NotSpecification(IUserSpecification specification) {
        this.specification = specification;
    }
    @Override
    public boolean isSatisfiedBy(User user) {
        return !specification.isSatisfiedBy(user);
    }
}
