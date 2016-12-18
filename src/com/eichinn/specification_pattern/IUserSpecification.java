package com.eichinn.specification_pattern;

/**
 * Created by ei_chinn on 2016/12/18.
 */
public interface IUserSpecification {
    boolean isSatisfiedBy(User user);

    IUserSpecification and(IUserSpecification specification);
    IUserSpecification or(IUserSpecification specification);
    IUserSpecification not();
}
