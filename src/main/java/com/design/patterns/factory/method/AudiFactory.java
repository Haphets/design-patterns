package com.design.patterns.factory.method;


import com.design.patterns.factory.MethodFatory;
import com.design.patterns.factory.bean.Audi;
import com.design.patterns.factory.bean.Car;

/**
 * User: li.chen
 * Date: 2018-08-12 22:35
 * 创建car的子类
 */
public class AudiFactory implements MethodFatory {

    public Car createCar() {
        return new Audi();
    }
}
