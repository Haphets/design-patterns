package com.design.patterns.factory.bean;

/**
 * User: li.chen
 * Date: 2018-08-12 22:08
 */
public class Benz implements Car {
    @Override
    public void create() {
        System.out.println("created Benz");
    }
}
