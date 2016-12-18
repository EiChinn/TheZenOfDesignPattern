package com.eichinn.specification_pattern;

/**
 * Created by ei_chinn on 2016/12/18.
 */
public class UserByNameEqual extends CompositeSepcification {
    private String name;

    public UserByNameEqual(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getName().equals(name);
    }
}
