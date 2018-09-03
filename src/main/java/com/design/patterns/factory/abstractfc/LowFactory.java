package com.design.patterns.factory.abstractfc;

/**
 * User: li.chen
 * Date: 2018-08-12 23:18
 */
public class LowFactory implements CarFactory {
    public Engine createEngin() {
        return new LowEngine();
    }

    public Seat createSeat() {
        return new LowSeat();
    }

    public CarAsf createCar() {
        return new LowCar();
    }
}
