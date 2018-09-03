package com.design.patterns.singleton;

/**
 * User: li.chen
 * Date: 2018-08-06 23:47
 * 单例模式
 * 懒汉式
 * 懒加载
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() throws IllegalAccessException {
        if (null != lazySingleton) {
            throw new IllegalAccessException("非法访问");
        }
    }

    /**
     * 线程不安全
     *
     * @return
     */
    public static LazySingleton getInstance() throws IllegalAccessException {
        //A、B线程都有可能进入到这个条件
        if (lazySingleton == null) {
            //A线程进入这里后，未执行 new LazySingleton() 便挂起了
            //因为没有 new LazySingleton() B线程进入这里，new了一个对象。
            //A线程恢复后，又会重新new 对象
            lazySingleton = new LazySingleton();
            return lazySingleton;
        }
        return lazySingleton;
    }

    /**
     * 线程安全 但是效率低
     *
     * @return
     */
    public static LazySingleton getSyncInstance() throws IllegalAccessException {
        //同步所
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
                return lazySingleton;
            }
            return lazySingleton;
        }
    }

    /**
     * 线程安全
     * 执行效率还不错
     *
     * @return
     */
    public static LazySingleton getDoubleCheckInstance() throws IllegalAccessException {
        //A、B线程都有可能进入到这个条件
        if (lazySingleton == null) {
            //同步锁进行判断
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
