package com.design.patterns.prototype;

import com.design.patterns.build.builder.Battery;
import com.design.patterns.build.builder.Screen;

import java.io.Serializable;

/**
 * User: li.chen
 * Date: 2018-08-16 22:45
 * 原型模式
 * 用的最多的就是深复制和浅复制
 * 需实现 Cloneable 接口
 */
public class ShallowPhonePrototype implements Cloneable,Serializable {
    private Screen screen;
    private Battery battery;
    /**
     * 型号
     */
    private int version;
    /**
     * 制造商
     */
    private String maker;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
