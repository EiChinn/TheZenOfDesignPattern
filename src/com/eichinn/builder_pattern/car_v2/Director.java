package com.eichinn.builder_pattern.car_v2;

/**
 * Created by ei_chinn on 2016/11/27.
 */
public class Director {
    private CarBuilder carBuilder = new CarBuilder();

    public ICar createBenzSuv() {
        return createCar(carBuilder, "Benz", "Suv");
    }

    public ICar createBmwVan() {
        return createCar(carBuilder, "BMW", "Van");
    }

    public ICar createComplexCar() {
        return createCar(carBuilder, "Benz", "BMW");
    }
    private ICar createCar(CarBuilder carBuilder, String engine, String wheel) {
        Blueprint blueprint = new Blueprint();
        blueprint.setEngine(engine);
        blueprint.setWheel(wheel);
        carBuilder.receiveBlueprint(blueprint);
        return carBuilder.buildCar();
    }
}
