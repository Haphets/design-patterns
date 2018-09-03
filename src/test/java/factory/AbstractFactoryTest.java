package factory;

import com.design.patterns.factory.abstractfc.CarFactory;
import com.design.patterns.factory.abstractfc.HighFactory;
import com.design.patterns.factory.abstractfc.LowFactory;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-08-12 23:21
 * 抽象工厂
 * 模式测试
 */
public class AbstractFactoryTest {
    /**
     * 高端产品族生产
     */
    @Test
    public void HighTest(){
        CarFactory carFactory = new HighFactory();
        carFactory.createEngin().start();
        carFactory.createSeat().massage();
        carFactory.createCar().createCar();
    }

    /**
     * 低端产品族生产
     */
    @Test
    public void LowTest(){
        CarFactory carFactory = new LowFactory();
        carFactory.createEngin().start();
        carFactory.createSeat().massage();
        carFactory.createCar().createCar();
    }
}
