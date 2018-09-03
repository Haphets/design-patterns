package com.design.patterns.factory.bean;

/**
 * User: li.chen
 * Date: 2018-08-12 22:08
 */
public class Audi implements Car {
    public void create() {
        System.out.println("created Audi");
    }
}
