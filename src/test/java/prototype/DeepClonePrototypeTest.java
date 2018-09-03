package prototype;

import com.design.patterns.factory.bean.PhoneEnum;
import com.design.patterns.prototype.BatteryClone;
import com.design.patterns.prototype.DeepClonePrototype;
import com.design.patterns.prototype.ScreenClone;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-08-16 22:52
 * 分深克隆和浅克隆测试
 */
public class DeepClonePrototypeTest {
    /**
     * 测试深克隆
     * 测试结果 为不同对象
     * 原型:com.design.patterns.prototype.DeepClonePrototype@1a93a7ca
     * 深克隆体:com.design.patterns.prototype.DeepClonePrototype@3d82c5f3
     */
    @Test
    public void shallowClone() throws CloneNotSupportedException {

        BatteryClone batteryClone = new BatteryClone("MI");
        ScreenClone screenClone = new ScreenClone("MI");
        //phone 原型
        DeepClonePrototype phonePrototype = new DeepClonePrototype();
        phonePrototype.setBattery(batteryClone);
        phonePrototype.setScreen(screenClone);
        phonePrototype.setMaker(PhoneEnum.MI.name());
        phonePrototype.setVersion(8);

        System.out.println("原型:" + phonePrototype);
        //测试深克隆

        DeepClonePrototype deepPhonePrototype = phonePrototype.clone();

        System.out.println("深克隆体:" + deepPhonePrototype);
    }

    /**
     * 测试修改浅克隆对象
     * 测试结果 想使用克隆体进行一些特殊操作 达到目的
     * 对比测试结果
     * 深克隆体里面的对象是 原型里面的对象
     * 原型对象里面方的是clone后的对象
     *
     * 原型:com.design.patterns.prototype.DeepClonePrototype@1a93a7ca
     * 原型Version:8
     * 原型Battery:com.design.patterns.prototype.BatteryClone@3d82c5f3
     * 原型Screen:com.design.patterns.prototype.ScreenClone@2b05039f
     * 原型Maker:MI
     * 做了一系列操作后...
     * 遇到特殊情况需要对原型进行修改,比如小米8测出一个重大BUG，但是非小米8版本可以正常使用，那么修改了原型值以后就不能影响非小米8对这个对象的使用.
     * 深克隆体:com.design.patterns.prototype.DeepClonePrototype@61e717c2
     * 小米8需要改为小米7再进行后面的操...
     *
     *
     * 深克隆体Version:7
     * 深克隆体Battery对象:com.design.patterns.prototype.BatteryClone@3d82c5f3
     * 深克隆体Battery值:HUAWEI
     * 深克隆体Screen对象:com.design.patterns.prototype.ScreenClone@2b05039f
     * 深克隆体Screen值:SANSUM
     * 深克隆体Maker:HUAWEI
     *
     *
     * 非小米8不做改动...
     * 原型Version:8
     * 原型Battery对象:com.design.patterns.prototype.BatteryClone@66cd51c3
     * 原型Battery:MI
     * 原型Screen对象:com.design.patterns.prototype.ScreenClone@4dcbadb4
     * 原型Screen:MI
     * 原型Maker:MI
     *
     * Process finished with exit code 0
     */
    @Test
    public void shallowModifyClone() throws CloneNotSupportedException {
        BatteryClone battery = new BatteryClone("MI");
        ScreenClone screen = new ScreenClone("MI");
        String maker = "MI";
        int version = 8;
        //phone 原型
        DeepClonePrototype phonePrototype = new DeepClonePrototype();
        phonePrototype.setBattery(battery);
        phonePrototype.setScreen(screen);
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
        DeepClonePrototype deepPhonePrototype = phonePrototype.clone();

        System.out.println("深克隆体:" + deepPhonePrototype);
        if (8 == versionP) {
            System.out.println("小米8需要改为小米7再进行后面的操...");

            System.out.println("");
            System.out.println("");
            //修改版本
            int versionm = deepPhonePrototype.getVersion();
            versionm = 7;
            deepPhonePrototype.setVersion(versionm);

            //修改制造商和嗲吃
            BatteryClone batterym = deepPhonePrototype.getBattery();
            batterym.setBattery("HUAWEI");
            deepPhonePrototype.setBattery(batterym);

            String makerm = deepPhonePrototype.getMaker();
            makerm = "HUAWEI";
            deepPhonePrototype.setMaker(makerm);

            //修改 屏幕
            ScreenClone screenm = deepPhonePrototype.getScreen();
            screenm.setScreen("SANSUM");
            deepPhonePrototype.setScreen(screenm);
            System.out.println("深克隆体Version:" + deepPhonePrototype.getVersion());
            System.out.println("深克隆体Battery对象:" + deepPhonePrototype.getBattery());
            System.out.println("深克隆体Battery值:" + deepPhonePrototype.getBattery().getBattery());
            System.out.println("深克隆体Screen对象:" + deepPhonePrototype.getScreen());
            System.out.println("深克隆体Screen值:" + deepPhonePrototype.getScreen().getScreen());
            System.out.println("深克隆体Maker:" + deepPhonePrototype.getMaker());
        }
        System.out.println("");
        System.out.println("");
        System.out.println("非小米8不做改动...");
        System.out.println("原型Version:" + phonePrototype.getVersion());
        System.out.println("原型Battery对象:" + phonePrototype.getBattery());
        System.out.println("原型Battery:" + phonePrototype.getBattery().getBattery());
        System.out.println("原型Screen对象:" + phonePrototype.getScreen());
        System.out.println("原型Screen:" + phonePrototype.getScreen().getScreen());
        System.out.println("原型Maker:" + phonePrototype.getMaker());

    }
}
