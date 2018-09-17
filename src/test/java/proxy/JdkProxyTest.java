package proxy;

import com.design.patterns.proxy.Car;
import com.design.patterns.proxy.JdkProxy;
import com.design.patterns.proxy.SaleCar;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-09-17 23:05
 * 可以看到所有调用了代理类的方法，都会走 invoke 方法。
 */
public class JdkProxyTest {
    /**
     * 代理接口
     */
    @Test
    public void jkdProxyInterfaceTest(){
        Car car = new SaleCar();
        JdkProxy<Car> jdkProxy = new JdkProxy<Car>(car);
        Car proxy = jdkProxy.getProxy();
        proxy.saleCar();
    }
    /**
     * 代理类
     * 测试失败
     */
    @Test
    public void jkdProxyTest(){
        //不能代理类，只能代理接口
        SaleCar saleCar = new SaleCar();
        JdkProxy<SaleCar> jdkProxy = new JdkProxy<SaleCar>(saleCar);
        SaleCar proxy = jdkProxy.getProxy();
        proxy.saleCar();
    }
}
