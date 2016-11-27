package com.eichinn.factory_method_pattern;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class Client {
    public static void main(String[] args) {
        ISuperMan superMan = SuperManFactory.createSuperMan(SuperManFactory.SuperManType.Adult);
        superMan.specialTalent();
    }
}
