package com.design.patterns.factory.abstractfc;

/**
 * User: li.chen
 * Date: 2018-08-12 23:18
 */
public interface CarFactory {
    Engine createEngin();
    Seat createSeat();
    CarAsf createCar();
}
