package singleton;

import com.design.patterns.singleton.InnerClassSingleton;
import com.design.patterns.singleton.LazySingleton;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * User: li.chen
 * Date: 2018-08-10 00:03
 * 反射破坏单例测试
 * 正常获取单例测试
 */
public class InvokeSmashTest {
    /**
     * 正常获取测试
     */
    @Test
    public void normalTest() throws IllegalAccessException {
        System.out.println("正常获取:" + (LazySingleton.getSyncInstance() == LazySingleton.getSyncInstance()));
        System.out.println("正常获取:" + (InnerClassSingleton.getInstance() == InnerClassSingleton.getInstance()));

    }

    @Test
    public void invokeTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
//        //获取无参构造方法
//        Constructor<LazySingleton> constructor = lazySingletonClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        System.out.println("反射获取:" + (constructor.newInstance() == constructor.newInstance()));
    }
}
