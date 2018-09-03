package com.design.patterns.build;


import com.design.patterns.build.builder.MiPhoneBuilder;
import com.design.patterns.build.director.MiPhoneDirector;
import com.design.patterns.build.director.PhoneDirector;
import com.design.patterns.factory.bean.PhoneEnum;

/**
 * User: li.chen
 * Date: 2018-08-14 23:46
 * 建造者模式
 * 配合简单工厂模式
 */
public class SimpleBuilderFacotory {
    public static Phone createPhone(PhoneEnum phoneEnum) {
        switch (phoneEnum) {
            case MI:
                PhoneDirector phoneDirector = new MiPhoneDirector(new MiPhoneBuilder());
                Phone phone = phoneDirector.directorPhone();
                return phone;
            case HUAWEI:
                return null;
            default:
                return null;
        }
    }
}
