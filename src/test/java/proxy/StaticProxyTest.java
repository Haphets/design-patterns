package proxy;

import com.design.patterns.proxy.Car;
import com.design.patterns.proxy.SaleCar;
import com.design.patterns.proxy.SaleProxy;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-08-29 22:46
 * 静态代理类测试
 */
public class StaticProxyTest {
    /**
     * 静态代理类测试
     * SaleProxy - 代理对象
     * SaleCar - 目标对象
     * Car - 抽象对象
     */
    @Test
    public void staticProxy(){
        Car car = new SaleProxy(new SaleCar());
        car.saleCar();
    }
}
