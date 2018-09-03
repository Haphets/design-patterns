package prototype;

import com.design.patterns.prototype.ShallowPhonePrototype;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-08-20 22:41
 * 通过new产生一个对象需要繁琐的数据准备或访问权限。
 * 可以考虑使用
 */
public class EfficiencyCloneTest {
    /**
     * 测试结果
     * 创建1000个对象耗时:[2541]
     * 创建1000个Clone对象耗时:[0]
     * @throws CloneNotSupportedException
     * @throws InterruptedException
     */
    @Test
    public void efficiencyCloneTest() throws CloneNotSupportedException, InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i ++){
            createClass();
        }
        long endClass = System.currentTimeMillis();
        for (int i = 0; i < 1000; i ++){
            ShallowPhonePrototype shallowPhonePrototype = new ShallowPhonePrototype();
            cloneClass(shallowPhonePrototype);
        }
        long endClone = System.currentTimeMillis();
        System.out.println("创建1000个对象耗时:[" + (endClass - start) + "]");
        System.out.println("创建1000个Clone对象耗时:[" + (endClone - endClass) + "]");
    }

    /**
     * 创建新对象
     * @return
     * @throws InterruptedException
     */
    public ShallowPhonePrototype createClass() throws InterruptedException {
        //模拟创建新对象时需要复杂的数据准备
        Thread.sleep(2);
        ShallowPhonePrototype shallowPhonePrototype = new ShallowPhonePrototype();
        return shallowPhonePrototype;
    }

    /**
     * clone 对象
     * @param shallowPhonePrototype
     * @return
     * @throws CloneNotSupportedException
     */
    public ShallowPhonePrototype cloneClass(ShallowPhonePrototype shallowPhonePrototype) throws CloneNotSupportedException {
        return (ShallowPhonePrototype) shallowPhonePrototype.clone();
    }
}
