package com.design.patterns.build;


import com.design.patterns.build.builder.MiPhoneBuilder;
import com.design.patterns.build.director.MiPhoneDirector;
import com.design.patterns.build.director.PhoneDirector;

/**
 * User: li.chen
 * Date: 2018-08-14 23:43
 * 小米构建工厂
 */
public class MiBuilderFactory implements BuilderFactory {
    public Phone createPhone() {
        PhoneDirector phoneDirector = new MiPhoneDirector(new MiPhoneBuilder());
        Phone phone = phoneDirector.directorPhone();
        return phone;
    }
}
