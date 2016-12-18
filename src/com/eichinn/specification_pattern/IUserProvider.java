package com.eichinn.specification_pattern;

import java.util.ArrayList;

/**
 * Created by ei_chinn on 2016/12/18.
 */
public interface IUserProvider {
    ArrayList<User> findUser(IUserSpecification userSpec);
}
