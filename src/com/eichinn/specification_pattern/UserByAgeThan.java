package com.eichinn.specification_pattern;

/**
 * Created by ei_chinn on 2016/12/18.
 */
public class UserByAgeThan extends CompositeSepcification {
    private int age;

    public UserByAgeThan(int age) {
        this.age = age;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getAge() > age;
    }
}
