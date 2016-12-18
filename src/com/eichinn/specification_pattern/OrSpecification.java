package com.eichinn.specification_pattern;

/**
 * Created by ei_chinn on 2016/12/18.
 */
public class OrSpecification extends CompositeSepcification {
    private IUserSpecification left;
    private IUserSpecification right;

    public OrSpecification(IUserSpecification left, IUserSpecification right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) || right.isSatisfiedBy(user);
    }
}
