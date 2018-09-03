package com.design.patterns.prototype;

/**
 * User: li.chen
 * Date: 2018-08-16 23:36
 */
public class BatteryClone implements Cloneable {
    public BatteryClone(String battery) {
        this.battery = battery;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 电池
     */
    private String battery;

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}
