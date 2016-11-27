package com.eichinn.factory_method_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class SuperManFactory {
    enum SuperManType {
        Adult, Child
    }

    public static ISuperMan createSuperMan(SuperManType type) {
        switch (type) {
            case Adult:
                return new AdultSuperMan();
            case Child:
                return new ChildSuperMan();
            default:
                return null;
        }
    }
}
