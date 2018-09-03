package com.design.patterns.factory.abstractfc;

/**
 * User: li.chen
 * Date: 2018-08-12 23:31
 */
public interface CarAsf {
    void createCar();
}

class HighCar implements CarAsf {

    public void createCar() {
        System.out.println("High-create Tesla");
    }
}

class LowCar implements CarAsf {

    public void createCar() {
        System.out.println("Low create xxx");
    }
}
