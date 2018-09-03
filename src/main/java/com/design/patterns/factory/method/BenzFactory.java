package com.design.patterns.factory.method;

import com.design.patterns.factory.MethodFatory;
import com.design.patterns.factory.bean.Benz;
import com.design.patterns.factory.bean.Car;

/**
 * User: li.chen
 * Date: 2018-08-12 22:35
 */
public class BenzFactory implements MethodFatory {
    public Car createCar() {
        return new Benz();
    }
}
