package com.design.patterns.factory.abstractfc;

/**
 * User: li.chen
 * Date: 2018-08-12 23:17
 */
public class HighFactory implements CarFactory {
    public Engine createEngin() {
        return new HighEngine();
    }

    public Seat createSeat() {
        return new HighSeat();
    }

    public CarAsf createCar() {
        return new HighCar();
    }
}
