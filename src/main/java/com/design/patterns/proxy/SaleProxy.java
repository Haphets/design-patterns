package com.design.patterns.proxy;

/**
 * User: li.chen
 * Date: 2018-08-29 22:44
 * 代理类实现 car 接口
 */
public class SaleProxy implements Car {
    private Car car;

    public SaleProxy(Car car) {
        this.car = car;
    }

    public void saleCar() {
        System.out.println("代理销售前...");
        car.saleCar();
        System.out.println("代理销售后....");
    }
}
