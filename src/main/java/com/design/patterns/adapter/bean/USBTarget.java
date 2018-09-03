package com.design.patterns.adapter.bean;

/**
 * User: li.chen
 * Date: 2018-08-20 23:38
 * 适配器角色: target
 * 客户需要的接口
 */
public interface USBTarget {
    /**
     * 接受输入信号
     */
    public void reciveInputSingle();

    /**
     * 关闭电脑指令
     */
    public void colseMac();
}
