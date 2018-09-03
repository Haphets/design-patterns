package com.design.patterns.adapter.bean;

/**
 * User: li.chen
 * Date: 2018-08-20 23:41
 * 适配器；类适配器
 * 相当于 转接器
 * 需要把适配者-thunder接口 和 target-usb 接口 进行转化
 */
public class KeyBoardExtendThunderAdapter extends MacAdaptee implements USBTarget {

    public void reciveInputSingle() {
        super.thunderboltInputSingle();
    }

    public void colseMac() {
        super.closeMacSingle();
    }
}
