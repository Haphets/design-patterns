package com.design.patterns.build.director;

import com.design.patterns.build.Phone;

/**
 * User: li.chen
 * Date: 2018-08-14 23:10
 * 装配者
 * 手机装配者
 */
public interface PhoneDirector {
    /**
     * 构建手机
     * @return
     */
    Phone directorPhone();
}
