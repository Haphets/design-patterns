package com.design.patterns.build;


import com.design.patterns.build.builder.Battery;
import com.design.patterns.build.builder.Mainboard;
import com.design.patterns.build.builder.Screen;

/**
 * User: li.chen
 * Date: 2018-08-14 23:11
 * 手机构建工厂
 */
public class Phone {
    private Battery battery;
    private Mainboard mainboard;
    private Screen screen;

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
