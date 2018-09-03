package com.design.patterns.adapter.bean;

/**
 * User: li.chen
 * Date: 2018-08-20 23:35
 *
 */
public class KeyBoardClient {
    /**
     * 键盘输入usb信号
     */
    public void reciveExtendsUsbSingle(){
        System.out.println("类适配器，接受到USB信号.开始适配为Thunderbolt信号");
        USBTarget usbTarget = new KeyBoardExtendThunderAdapter();
        usbTarget.reciveInputSingle();
    }
    /**
     * 键盘输入usb信号
     */
    public void reciveObjUsbSingle(){
        System.out.println("对象适配器，接受到USB信号.开始适配为Thunderbolt信号");
        MacAdaptee macAdaptee = new MacAdaptee();
        USBTarget usbTarget = new KeyBoardObjAdapter(macAdaptee);
        usbTarget.reciveInputSingle();
    }

}
