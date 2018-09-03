package prototype;

import com.design.patterns.buildex.builder.Battery;
import com.design.patterns.buildex.builder.Screen;
import com.design.patterns.prototype.ShallowPhonePrototype;
import org.junit.Test;

import java.io.*;

/**
 * User: li.chen
 * Date: 2018-08-20 22:23
 */
public class SerlizableCLoneTest {
    @Test
    public void serlizableCLoneTest() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Battery battery = new Battery("MI");
        Screen screen = new Screen("MI");
        String maker = "MI";
        int version = 8;
        //phone 原型
        ShallowPhonePrototype phonePrototype = new ShallowPhonePrototype();
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
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("开始序列化。。。");
        int versionP = phonePrototype.getVersion();

        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteOutputStream);
        outputStream.writeObject(phonePrototype);
        byte[] phonePrototypeByte = byteOutputStream.toByteArray();
        System.out.println("序列化完毕。。。");
        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(phonePrototypeByte);
        ObjectInputStream inputStream = new ObjectInputStream(byteInputStream);

        ShallowPhonePrototype shallowPhonePrototype  = (ShallowPhonePrototype) inputStream.readObject();
        System.out.println("反序列化完毕。。。" + shallowPhonePrototype );
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
        System.out.println("原型Battery:" + phonePrototype.getBattery().getBattery());
        System.out.println("原型Screen对象:" + phonePrototype.getScreen());
        System.out.println("原型Screen:" + phonePrototype.getScreen().getScreen());
        System.out.println("原型Maker:" + phonePrototype.getMaker());
    }
}
