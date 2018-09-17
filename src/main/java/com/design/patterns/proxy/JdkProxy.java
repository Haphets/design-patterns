package com.design.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * User: li.chen
 * Date: 2018-09-17 22:59
 * Jdk 动态代理只能代理接口
 */
public class JdkProxy<T> implements InvocationHandler {
    /**
     * 需要代理的对象
     */
    private T target;

    public JdkProxy(T target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用方法前....");
        Object result = method.invoke(this.target,args);
        System.out.println("调用方法后....");
        return result;
    }

    /**
     * 获取代理对象
     * @return
     */
    public T getProxy(){
        T t = (T)Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
        return t;
    }
}
