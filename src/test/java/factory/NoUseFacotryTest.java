package factory;

import com.design.patterns.factory.bean.Audi;
import com.design.patterns.factory.bean.Benz;
import com.design.patterns.factory.bean.Car;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-08-12 22:10
 * 不使用
 * 工厂模式
 */
public class NoUseFacotryTest {
    /**
     * 生产车
     * 需要知道Audi车的具体实现类
     */
    @Test
    public void createAudiTest(){
        Car audi = new Audi();
        audi.create();
    }
    @Test
    public void createBenzTest(){
        Car benz = new Benz();
        benz.create();
    }
}
