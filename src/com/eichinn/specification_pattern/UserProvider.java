package com.eichinn.specification_pattern;

import java.util.ArrayList;

/**
 * Created by ei_chinn on 2016/12/18.
 */
public class UserProvider implements IUserProvider {
    private ArrayList<User> users;

    public UserProvider(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public ArrayList<User> findUser(IUserSpecification userSpec) {
        ArrayList<User> result = new ArrayList<>();
        for (User user : users) {
            if (userSpec.isSatisfiedBy(user)) {
                result.add(user);
            }
        }
        return result;
    }
}
