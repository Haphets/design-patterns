package com.design.patterns.adapter.bean;

/**
 * User: li.chen
 * Date: 2018-08-21 23:41
 * 对象适配器模式
 */
public class KeyBoardObjAdapter implements USBTarget {
    private MacAdaptee macAdaptee;

    public KeyBoardObjAdapter(MacAdaptee macAdaptee) {
        this.macAdaptee = macAdaptee;
    }

    /**
     * 要如何才能转化为MAC信号呢?
     * 肯定是要得到mac的对象
     */
    public void reciveInputSingle() {
        macAdaptee.thunderboltInputSingle();
    }

    public void colseMac() {
        macAdaptee.closeMacSingle();
    }
}
