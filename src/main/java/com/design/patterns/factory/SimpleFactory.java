package com.design.patterns.factory;

import com.design.patterns.factory.bean.Audi;
import com.design.patterns.factory.bean.Benz;
import com.design.patterns.factory.bean.Car;
import com.design.patterns.factory.bean.CarEnum;

/**
 * User: li.chen
 * Date: 2018-08-12 21:58
 * 简单工厂模式
 * 创建car下面的子类
 * 如果增加一个产品，就需要修改此类
 * 违背了 开闭原则
 */
public class SimpleFactory {
    public static Car createCar(CarEnum carEnum) {
        switch (carEnum) {
            case AUDI:
                return new Audi();
            case BENZ:
                return new Benz();
            default:
                return null;
        }
    }
}
