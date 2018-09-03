package com.design.patterns.factory.abstractfc;

/**
 * User: li.chen
 * Date: 2018-08-12 23:11
 */
public interface Engine {
    void start();
}

class HighEngine implements Engine {

    @Override
    public void start() {
        System.out.println("High-百公里加速2s");
    }
}

class LowEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Low-百公里加速10s");
    }
}
