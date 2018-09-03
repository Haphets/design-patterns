package com.design.patterns.prototype;

/**
 * User: li.chen
 * Date: 2018-08-16 23:36
 */
public class ScreenClone implements Cloneable {
    public ScreenClone(String screen) {
        this.screen = screen;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
