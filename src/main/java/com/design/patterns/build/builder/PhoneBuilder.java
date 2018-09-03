package com.design.patterns.build.builder;

/**
 * User: li.chen
 * Date: 2018-08-14 23:00
 * 构建器
 * 手机构建器
 */
public interface PhoneBuilder {
    /**
     * 电池
     * @return
     */
    Battery builderBattery();

    /**
     * 主板
     * @return
     */
    Mainboard builderBoard();

    /**
     * 屏幕
     * @return
     */
    Screen builderScreen();
}
