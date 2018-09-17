package proxy;

import com.design.patterns.proxy.Car;
import com.design.patterns.proxy.CglibProxy;
import com.design.patterns.proxy.SaleCar;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-09-17 23:25
 */
public class CglibProxyTest {
    /**
     * 既可以代理类 也可以代理接口
     * 代理接口测试
     */
    @Test
    public void cglibProxyInterfaceTest(){
        //代理接口
        Car car = new SaleCar();
        CglibProxy<Car> cglibProxy = new CglibProxy<Car>(car);
        Car proxy = cglibProxy.getProxy();
        proxy.saleCar();
    }
    /**
     * 既可以代理类 也可以代理接口
     * 代理类测试
     */
    @Test
    public void cglibProxyClassTest(){
        //代理类
        SaleCar saleCar = new SaleCar();
        CglibProxy<SaleCar> cglibProxy = new CglibProxy<SaleCar>(saleCar);
        SaleCar proxy = cglibProxy.getProxy();
        proxy.saleCar();
    }
}
