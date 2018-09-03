package com.design.patterns.build.builder;

import java.io.Serializable;

/**
 * User: li.chen
 * Date: 2018-08-14 23:01
 */
public class Battery implements Serializable {

    public Battery(String battery) {
        this.battery = battery;
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
