package com.design.patterns.build.director;


import com.design.patterns.build.Phone;
import com.design.patterns.build.builder.Battery;
import com.design.patterns.build.builder.Mainboard;
import com.design.patterns.build.builder.PhoneBuilder;
import com.design.patterns.build.builder.Screen;

/**
 * User: li.chen
 * Date: 2018-08-14 23:15
 * StringBuilder DomBuilder
 * 小米手机装配者
 */
public class MiPhoneDirector implements PhoneDirector {

    private PhoneBuilder phoneBuilder;

    public MiPhoneDirector(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    public Phone directorPhone() {
        // 构建者
        Battery battery = phoneBuilder.builderBattery();
        Mainboard mainboard = phoneBuilder.builderBoard();
        Screen screen = phoneBuilder.builderScreen();

        //组装
        Phone phone = new Phone();
        phone.setBattery(battery);
        phone.setMainboard(mainboard);
        phone.setScreen(screen);
        return phone;
    }
}
