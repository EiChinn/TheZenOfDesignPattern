package com.eichinn.mediator;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        IPosition position = new Position(mediator);
//        ISalary salary = new Salary(mediator);
//        ITax tax = new Tax(mediator);

        position.demote();
    }
}
