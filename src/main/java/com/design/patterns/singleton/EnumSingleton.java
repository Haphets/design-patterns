package com.design.patterns.singleton;

/**
 * User: li.chen
 * Date: 2018-08-07 00:10
 * 单例模式
 * 枚举类型本身就是单例对象
 * 缺点：没有延时加载
 */
public enum EnumSingleton {
    INSTANCE;
}
