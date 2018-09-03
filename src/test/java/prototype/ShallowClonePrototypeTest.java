package prototype;

import com.design.patterns.buildex.builder.Battery;
import com.design.patterns.buildex.builder.MiPhoneBuilder;
import com.design.patterns.buildex.builder.Screen;
import com.design.patterns.prototype.ShallowPhonePrototype;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-08-16 22:52
 * 分深克隆和浅克隆测试
 */
public class ShallowClonePrototypeTest {
    /**
     * 测试浅克隆
     * 测试结果 为不同对象
     * 原型:com.design.patterns.prototype.PhonePrototype@1a93a7ca
     * 浅克隆体:com.design.patterns.prototype.PhonePrototype@3d82c5f3
     */
    @Test
    public void shallowClone() throws CloneNotSupportedException {
        MiPhoneBuilder miPhoneBuilder = new MiPhoneBuilder();
        Battery miBattery = miPhoneBuilder.builderBattery();
        Screen miScreen = miPhoneBuilder.builderScreen();
        String maker = "MI";
        //phone 原型
        ShallowPhonePrototype phonePrototype = new ShallowPhonePrototype();
        phonePrototype.setBattery(miBattery);
        phonePrototype.setScreen(miScreen);
        phonePrototype.setMaker(maker);
        phonePrototype.setVersion(8);

        System.out.println("原型:" + phonePrototype);
        //测试浅克隆

        ShallowPhonePrototype shallowPhonePrototype = (ShallowPhonePrototype) phonePrototype.clone();

        System.out.println("浅克隆体:" + shallowPhonePrototype);
    }

    /**
     * 测试修改浅克隆对象
     * 测试结果 想使用克隆体进行一些特殊操作 但是显然达不到目的
     * 但是其中 基本数据类型 和final string 类型 数据未发生改变
     * 对象数据发生改变
     *
     * 原型:com.design.patterns.prototype.ShallowPhonePrototype@1a93a7ca
     * 原型Version:8
     * 原型Battery:com.design.patterns.buildex.builder.Battery@3d82c5f3
     * 原型Screen:com.design.patterns.buildex.builder.Screen@2b05039f
     * 原型Maker:MI
     * 做了一系列操作后...
     * 遇到特殊情况需要对原型进行修改,比如小米8测出一个重大BUG，但是非小米8版本可以正常使用，那么修改了原型值以后就不能影响非小米8对这个对象的使用.
     * 浅克隆体:com.design.patterns.prototype.ShallowPhonePrototype@61e717c2
     * 小米8需要改为小米7再进行后面的操...
     *
     *
     * 浅克隆体Version:7
     * 浅克隆体Battery对象:com.design.patterns.buildex.builder.Battery@3d82c5f3
     * 浅克隆体Battery值:HUAWEI
     * 浅克隆体Screen对象:com.design.patterns.buildex.builder.Screen@2b05039f
     * 浅克隆体Screen值:SANSUM
     * 浅克隆体Maker:HUAWEI
     *
     *
     * 非小米8不做改动...
     * 原型Version:8
     * 原型Battery对象:com.design.patterns.buildex.builder.Battery@3d82c5f3
     * 原型Battery值:HUAWEI
     * 原型Screen对象:com.design.patterns.buildex.builder.Screen@2b05039f
     * 原型Screen值:SANSUM
     * 原型Maker:MI
     */
    @Test
    public void shallowModifyClone() throws CloneNotSupportedException {
        MiPhoneBuilder miPhoneBuilder = new MiPhoneBuilder();
        Battery miBattery = miPhoneBuilder.builderBattery();
        Screen miScreen = miPhoneBuilder.builderScreen();
        String maker = "MI";
        int version = 8;
        //phone 原型
        ShallowPhonePrototype phonePrototype = new ShallowPhonePrototype();
        phonePrototype.setBattery(miBattery);
        phonePrototype.setScreen(miScreen);
        phonePrototype.setMaker(maker);
        phonePrototype.setVersion(version);

        System.out.println("原型:" + phonePrototype);
        System.out.println("原型Version:" + phonePrototype.getVersion());
        System.out.println("原型Battery:" + phonePrototype.getBattery());
        System.out.println("原型Screen:" + phonePrototype.getScreen());
        System.out.println("原型Maker:" + phonePrototype.getMaker());
        System.out.println("做了一系列操作后...");
        System.out.println("遇到特殊情况需要对原型进行修改,比如小米8测出一个重大BUG，但是非小米8版本可以正常使用，那么修改了" +
                "原型值以后就不能影响非小米8对这个对象的使用.");
        // 模拟这种场景
        //先对phonePrototype 进行克隆

        int versionP = phonePrototype.getVersion();
        ShallowPhonePrototype shallowPhonePrototype = (ShallowPhonePrototype) phonePrototype.clone();

        System.out.println("浅克隆体:" + shallowPhonePrototype);
        if (8 == versionP) {
            System.out.println("小米8需要改为小米7再进行后面的操...");
            System.out.println("");
            System.out.println("");
            //修改版本
            int versionm = shallowPhonePrototype.getVersion();
            versionm = 7;
            shallowPhonePrototype.setVersion(versionm);

            //修改制造商和嗲吃
            Battery batterym = shallowPhonePrototype.getBattery();
            batterym.setBattery("HUAWEI");
            shallowPhonePrototype.setBattery(batterym);

            String makerm = shallowPhonePrototype.getMaker();
            makerm = "HUAWEI";
            shallowPhonePrototype.setMaker(makerm);

            //修改 屏幕
            Screen screenm = shallowPhonePrototype.getScreen();
            screenm.setScreen("SANSUM");
            shallowPhonePrototype.setScreen(screenm);
            System.out.println("浅克隆体Version:" + shallowPhonePrototype.getVersion());
            System.out.println("浅克隆体Battery对象:" + shallowPhonePrototype.getBattery());
            System.out.println("浅克隆体Battery值:" + shallowPhonePrototype.getBattery().getBattery());
            System.out.println("浅克隆体Screen对象:" + shallowPhonePrototype.getScreen());
            System.out.println("浅克隆体Screen值:" + shallowPhonePrototype.getScreen().getScreen());
            System.out.println("浅克隆体Maker:" + shallowPhonePrototype.getMaker());
        }
        System.out.println("");
        System.out.println("");
        System.out.println("非小米8不做改动...");
        System.out.println("原型Version:" + phonePrototype.getVersion());
        System.out.println("原型Battery对象:" + phonePrototype.getBattery());
        System.out.println("原型Battery值:" + phonePrototype.getBattery().getBattery());
        System.out.println("原型Screen对象:" + phonePrototype.getScreen());
        System.out.println("原型Screen值:" + phonePrototype.getScreen().getScreen());
        System.out.println("原型Maker:" + phonePrototype.getMaker());

    }
}
