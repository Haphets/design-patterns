package com.design.patterns.factory;

import com.design.patterns.factory.bean.Car;

/**
 * User: li.chen
 * Date: 2018-08-12 22:34
 * 工厂方法模式
 * 定义工厂为接口
 * 要生产哪种车，就需要构建哪种车的工厂即可
 * 满足了开闭原则  但是 会生成很多类
 */
public interface MethodFatory {
    Car createCar();
}
