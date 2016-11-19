package com.eichinn.state_pattern;

/**
 * Created by ei_chinn on 2016/11/19.
 */
public class Client {
    public static void main(String[] args) {
//        ILift lift = new Lift();
//        lift.open();
//        lift.close();
//        lift.run();
//        lift.stop();

        Context context = new Context();
        context.setLiftState(Context.stoppingState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
