package com.design.patterns.prototype;

/**
 * User: li.chen
 * Date: 2018-08-16 23:31
 * 深克隆
 */
public class DeepClonePrototype implements Cloneable {
    private ScreenClone screen;
    private BatteryClone battery;
    /**
     * 型号
     */
    private int version;
    /**
     * 制造商
     */
    private String maker;

    @Override
    public DeepClonePrototype clone() throws CloneNotSupportedException {
        DeepClonePrototype deepClonePrototype = (DeepClonePrototype) super.clone();
        this.battery = (BatteryClone) deepClonePrototype.battery.clone();
        this.screen = (ScreenClone) deepClonePrototype.screen.clone();
        return deepClonePrototype;
    }

    public ScreenClone getScreen() {
        return screen;
    }

    public void setScreen(ScreenClone screen) {
        this.screen = screen;
    }

    public BatteryClone getBattery() {
        return battery;
    }

    public void setBattery(BatteryClone battery) {
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
