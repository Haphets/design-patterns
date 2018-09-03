package builder;


import com.design.patterns.build.BuilderFactory;
import com.design.patterns.build.MiBuilderFactory;
import com.design.patterns.build.Phone;
import com.design.patterns.build.SimpleBuilderFacotory;
import com.design.patterns.build.builder.MiPhoneBuilder;
import com.design.patterns.build.director.MiPhoneDirector;
import com.design.patterns.build.director.PhoneDirector;
import com.design.patterns.factory.bean.PhoneEnum;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-08-14 23:33
 * 建造者模式
 * 单元测试
 */
public class BuilderPatternTest {
    /**
     * 调用
     * 建造者模式
     */
    @Test
    public void builderPatternTest(){
        PhoneDirector phoneDirector = new MiPhoneDirector(new MiPhoneBuilder());
        Phone phone = phoneDirector.directorPhone();
        System.out.println(phone.getBattery().getBattery());
        System.out.println(phone.getMainboard().getBoard());
        System.out.println(phone.getScreen().getScreen());
    }

    /**
     * 建造者模式配合工厂方法模式
     * 工厂方法模式
     */
    @Test
    public void builderFactoryPatternTest(){
        BuilderFactory builderFactory = new MiBuilderFactory();
        Phone phone = builderFactory.createPhone();
        System.out.println(phone.getBattery().getBattery());
        System.out.println(phone.getMainboard().getBoard());
        System.out.println(phone.getScreen().getScreen());
    }

    /**
     * 建造者模式配合简单工厂模式
     * 简单工厂模式
     */
    @Test
    public void builderSimFactoryPatternTest(){
        Phone phone = SimpleBuilderFacotory.createPhone(PhoneEnum.MI);
        System.out.println(phone.getBattery().getBattery());
        System.out.println(phone.getMainboard().getBoard());
        System.out.println(phone.getScreen().getScreen());
    }
}
