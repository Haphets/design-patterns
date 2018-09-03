package com.design.patterns.factory.abstractfc;

/**
 * User: li.chen
 * Date: 2018-08-12 23:14
 */
public interface Seat {
    void massage();
}

class HighSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("High-开始按摩");
    }
}

class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("Low-普通座椅");
    }
}
