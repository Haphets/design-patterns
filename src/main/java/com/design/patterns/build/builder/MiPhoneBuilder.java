package com.design.patterns.build.builder;

/**
 * User: li.chen
 * Date: 2018-08-14 23:19
 * 小米手机构建器
 */
public class MiPhoneBuilder implements PhoneBuilder {
    public Battery builderBattery() {
//        System.out.println("小米电池");
        return new Battery("小米电池");
    }

    public Mainboard builderBoard() {
//        System.out.println("小米主板");
        return new Mainboard("小米主板");
    }

    public Screen builderScreen() {
//        System.out.println("小米屏幕");
        return new Screen("小米屏幕");
    }
}
