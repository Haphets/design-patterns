package factory;

import com.design.patterns.factory.SimpleFactory;
import com.design.patterns.factory.bean.Car;
import com.design.patterns.factory.bean.CarEnum;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-08-12 22:16
 * 简单工厂模式测试
 * 实现了调用者和实现类的分离
 */
public class SimpleFactoryTest {
    /**
     * 不需要知道audi的具体实现类 只需要告诉工厂你需要什么车就可以。
     */
    @Test
    public void createAudiTest(){
        Car car = SimpleFactory.createCar(CarEnum.AUDI);
        car.create();
    }
    @Test
    public void createBenzTest(){
        Car car = SimpleFactory.createCar(CarEnum.BENZ);
        car.create();
    }
}
