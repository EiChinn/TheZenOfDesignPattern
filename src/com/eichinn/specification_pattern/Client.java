package com.eichinn.specification_pattern;

import java.util.ArrayList;

/**
 * Created by ei_chinn on 2016/12/18.
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("ei_chinn", 27));
        users.add(new User("shana", 25));
        users.add(new User("ei_chinn", 27));
        users.add(new User("shana", 23));
        users.add(new User("ei_chinn", 27));
        users.add(new User("bella", 25));
        users.add(new User("ei_chinn", 25));
        users.add(new User("shana", 25));
        users.add(new User("bella", 27));
        users.add(new User("otamegane", 25));


        IUserProvider userProvider = new UserProvider(users);

        UserByNameEqual userByNameEqual = new UserByNameEqual("shana");
        UserByAgeThan userByAgeThan = new UserByAgeThan(24);
        ArrayList<User> name = userProvider.findUser(userByAgeThan.and(userByNameEqual));
        for (User user : name) {
            System.out.println(user);
        }

    }
}
