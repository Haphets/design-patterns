package com.design.patterns.adapter.bean;

/**
 * User: li.chen
 * Date: 2018-08-21 23:51
 */
public abstract class AbstractUSBTarget implements USBTarget {
    /**
     * 接受输入信号
     */
    public void reciveInputSingle(){}

    /**
     * 关闭电脑指令
     */
    public void colseMac(){}
}
