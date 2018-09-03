package com.design.patterns.singleton;

import java.io.Serializable;

/**
 * User: li.chen
 * Date: 2018-08-06 23:44
 * 单例模式
 * 饿汉式
 */
public class HungrySingleton implements Serializable {
    /**
     * 类加载时 就初始化
     */
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private static final long serialVersionUID = 1362232219281385639L;

    /**
     * 私有化构造器
     */
    private HungrySingleton() {
        if( null != hungrySingleton ){
            try {
                throw new IllegalAccessException("非法访问");
            } catch (IllegalAccessException e) {
                System.out.println(e.fillInStackTrace());
            }
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 防止反序列化破坏单例
     * @return
     */
    private Object readResolve(){
        return getInstance();
    }
}
