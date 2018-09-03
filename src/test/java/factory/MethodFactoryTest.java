package factory;

import com.design.patterns.factory.bean.Car;
import com.design.patterns.factory.method.AudiFactory;
import com.design.patterns.factory.method.BenzFactory;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-08-12 22:36
 * 工厂方法
 * 模式测试
 */
public class MethodFactoryTest {
    @Test
    public void createAudiTest(){
        AudiFactory audiFactory = new AudiFactory();
        Car car = audiFactory.createCar();
        car.create();
    }
    @Test
    public void createBenzTest(){
        BenzFactory benzFactory = new BenzFactory();
        Car car = benzFactory.createCar();
        car.create();
    }
}
