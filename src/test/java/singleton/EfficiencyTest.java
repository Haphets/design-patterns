package singleton;

import com.design.patterns.singleton.InnerClassSingleton;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * User: li.chen
 * Date: 2018-08-10 00:11
 * 各种单例模式运行效率测试
 */
public class EfficiencyTest {
    /**
     * 效率测试
     */
    @Test
    public void efficiencyTest() throws InterruptedException {
        long start = System.currentTimeMillis();
        int threadCount = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for (int j = 0; j < 10; j++){
            new Thread(new Runnable() {
                public void run() {
                    // 循环获取实例1千万次
                    for (int j = 0; j < 10000000; j++){
//                        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
//                        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
                        InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
//                        try {
////                            LazySingleton lazySingleton = LazySingleton.getInstance();
//                            LazySingleton lazySingleton = LazySingleton.getSyncInstance();
//                        } catch (IllegalAccessException e) {
//                            e.printStackTrace();
//                        }
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println( (end - start) + "ms");
    }
}
