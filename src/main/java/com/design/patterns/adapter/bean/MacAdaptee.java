package com.design.patterns.adapter.bean;

/**
 * User: li.chen
 * Date: 2018-08-20 23:29
 * 适配器模式角色:Adaptee
 * 需要适配的对象
 */
public class MacAdaptee {
    /**
     * 接受到输入信号
     */
    public void thunderboltInputSingle(){
        System.out.println("接受到Thunderbolt接口的输入信号，开始触发对应功能...");
    }
    /**
     * 接受到关机信号
     */
    public void closeMacSingle(){
        System.out.println("接受到Thunderbolt接口的关机信号，开始关机...");
    }
}
