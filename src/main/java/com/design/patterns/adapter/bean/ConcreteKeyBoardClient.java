package com.design.patterns.adapter.bean;

/**
 * User: li.chen
 * Date: 2018-08-21 23:54
 * 缺省适配器模式
 * 只接受键盘一种信号
 * 打字就是打字信号
 * 关机就是关机信号
 */
public class ConcreteKeyBoardClient extends AbstractUSBTarget {

    /**
     * 接受输入信号
     */
//    public void reciveInputSingle(){
//        System.out.println("缺省适配器，接受到输入信号.开始适配为Thunderbolt输入信号");
//        MacAdaptee macAdaptee = new MacAdaptee();
//        USBTarget usbTarget = new KeyBoardObjAdapter(macAdaptee);
//        usbTarget.reciveInputSingle();
//    }

    /**
     * 关闭电脑指令
     */
    public void colseMac(){
        System.out.println("缺省适配器，接受到关机信号.开始适配为Thunderbolt输入信号");
        MacAdaptee macAdaptee = new MacAdaptee();
        USBTarget usbTarget = new KeyBoardObjAdapter(macAdaptee);
        usbTarget.colseMac();
    }
}
