package com.design.patterns.build.builder;

import java.io.Serializable;

/**
 * User: li.chen
 * Date: 2018-08-14 23:01
 */
public class Screen implements Serializable {
    public Screen(String screen) {
        this.screen = screen;
    }

    /**
     * 屏幕
     */
    private String screen;

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
}
