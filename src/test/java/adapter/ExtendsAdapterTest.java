package adapter;

import com.design.patterns.adapter.bean.ConcreteKeyBoardClient;
import com.design.patterns.adapter.bean.KeyBoardClient;
import org.junit.Test;

/**
 * User: li.chen
 * Date: 2018-08-20 23:44
 * 类适配器模式
 */
public class ExtendsAdapterTest {
    /**
     * 类适配器模式reciveObjUsbSingle
     * 客户端 键盘输入USB信号转化为 雷电接口信号
     */
    @Test
    public void extendsAdapterTest(){
        KeyBoardClient keyBoardClient = new KeyBoardClient();
        keyBoardClient.reciveExtendsUsbSingle();
    }
    /**
     * 对象适配器模式
     * 客户端 键盘输入USB信号转化为 雷电接口信号
     */
    @Test
    public void objAdapterTest(){
        KeyBoardClient keyBoardClient = new KeyBoardClient();
        keyBoardClient.reciveObjUsbSingle();
    }
    /**
     * 缺省适配器模式
     * 客户端 键盘输入USB信号转化为 雷电接口信号
     * 客户端 键盘关机信号转化为 mac关机信号
     */
    @Test
    public void concreteAdapterTest(){
        ConcreteKeyBoardClient concreteKeyBoardClient = new ConcreteKeyBoardClient();
        concreteKeyBoardClient.colseMac();
        concreteKeyBoardClient.reciveInputSingle();
    }
}
