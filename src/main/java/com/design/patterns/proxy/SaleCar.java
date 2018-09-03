package com.design.patterns.proxy;

/**
 * User: li.chen
 * Date: 2018-08-29 22:43
 * 目标对象 实现 car 接口
 */
public class SaleCar implements Car {
    public void saleCar() {
        System.out.println("销售了汽车");
    }
}
