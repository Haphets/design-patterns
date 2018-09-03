package singleton;

import com.design.patterns.singleton.HungrySingleton;
import org.junit.Test;

import java.io.*;

/**
 * User: li.chen
 * Date: 2018-08-10 00:04
 * 反序列化破坏单例测试
 * 正常获取单例测试
 */
public class SerializableSmashTest {
    /**
     * 正常获取
     */
    @Test
    public void normalTest(){
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton hungrySingletonAnother = HungrySingleton.getInstance();
        System.out.println("正常获取:" + (hungrySingleton == hungrySingletonAnother));
    }

    /**
     * 反序列化获取
     * readResolve 防止
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public void serializableTest() throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
//            HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//            String path = "/Users/li.chen/Downloads/DesignPattern/Serializable.txt";
//            //序列化
//            fileOutputStream = new FileOutputStream(path);
//            outputStream = new ObjectOutputStream(fileOutputStream);
//            outputStream.writeObject(hungrySingleton);
//            System.out.println("序列化完成");
//            //反序列化
//
//            fileInputStream = new FileInputStream(path);
//            objectInputStream = new ObjectInputStream(fileInputStream);
//            HungrySingleton hungrySingletonSer = (HungrySingleton) objectInputStream.readObject();
//            System.out.println("反序列化获取:" + (hungrySingletonSer == hungrySingleton));
        } finally {
            if(null != fileOutputStream){
                fileOutputStream.close();
            }
            if(null != outputStream){
                outputStream.close();
            }
            if(null != fileInputStream){
                fileInputStream.close();
            }
            if(null != objectInputStream){
                objectInputStream.close();
            }
        }
    }
}
