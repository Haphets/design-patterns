package com.design.patterns.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * User: li.chen
 * Date: 2018-09-17 23:21
 */
public class CglibProxy<T> implements MethodInterceptor {
    private T target;

    public CglibProxy(T target) {
        this.target = target;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用方法前...");
        Object resut = methodProxy.invokeSuper(o,objects);
        System.out.println("调用方法后...");
        return resut;
    }

    /**
     * 获得代理对象
     */
    public T getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }
}
