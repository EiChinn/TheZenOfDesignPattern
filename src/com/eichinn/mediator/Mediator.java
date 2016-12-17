package com.eichinn.mediator;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Mediator extends AbsMediator {
    @Override
    public void up(ISalary salary) {
        upSalary();
        upTax();
    }

    @Override
    public void up(IPosition position) {
        upPosition();
        upSalary();
        upTax();
    }

    @Override
    public void up(ITax tax) {
        upTax();
        downSalary();
    }

    @Override
    public void down(IPosition position) {
        downPosition();
        downSalary();
        downTax();
    }

    @Override
    public void down(ISalary salary) {
        downSalary();
        downTax();
    }

    @Override
    public void down(ITax tax) {
        downTax();
        upSalary();
    }

    private void upPosition() {
        System.out.println("upPosition");
    }
    private void upSalary() {
        System.out.println("upSalary");
    }
    private void upTax() {
        System.out.println("upTax");
    }
    private void downPosition() {
        System.out.println("downPosition");
    }
    private void downSalary() {
        System.out.println("downSalary");
    }
    private void downTax() {
        System.out.println("downTax");
    }
}
