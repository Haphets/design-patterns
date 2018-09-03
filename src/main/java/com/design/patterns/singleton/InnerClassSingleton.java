package com.design.patterns.singleton;

/**
 * User: li.chen
 * Date: 2018-08-07 00:05
 * 单例模式
 * 静态内部类实现单例模式
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
        System.out.println("我InnerClassSingleton被实例化了");
    }

    private static class InnerClass {
        private static final InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }

    /**
     * 线程安全
     * 调用效率高 并且是懒加载
     *
     * @return
     */
    public static InnerClassSingleton getInstance() {
        return InnerClass.innerClassSingleton;
    }
}
