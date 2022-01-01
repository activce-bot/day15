package come.data27.exer2;

import org.junit.Test;

import java.io.*;

/**
 * 对象流的使用
 *
 * @author gjx
 * @create 2021-12-16 12:34
 */
public class objectTest {

    /**
     * 对象流的输入操作
     * 使用 FileOutputStream  和 ObjectOutputStream
     */
    @Test
    public void test1() {
        ObjectOutputStream oot = null;
        try {
            FileOutputStream fots = new FileOutputStream(".\\object.data");
            oot = new ObjectOutputStream(fots);
            //写入为objecj类型！！！！
            oot.writeObject(new String("hello word!!"));
            oot.flush();
            //对于自定义类
            //需要对自定义类加上可序列化接口 Serializable 和加上序列化的id！！
            // 一般自接点击 string 类就可以获取
            //NotSerializableException
            oot.writeObject(new person("蔡徐坤!!!",25));
            oot.flush();
            oot.writeObject(new person("篮球王子",25,1.8));
            oot.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oot != null) {
                try {
                    oot.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 对象流的读取操作
     *
     * 特别注意的是！！
     * 写入读取的类型需要一致才行！！！！！！
     * oot.writeObject(new String("hello word!!"));
     * ois.readObject();
     */
    @Test
    public void test2() {
        ObjectInputStream ois = null;
        try {
            FileInputStream fps = new FileInputStream(".\\object.data");
            ois = new ObjectInputStream(fps);

            //接收为objecj类型，！！！
            Object obj1 = ois.readObject();
            Object obj2 = ois.readObject();
            Object obj3 = ois.readObject();

            String str = (String) obj1;
            person per=(person) obj2;
            person per1=(person) obj3;

            System.out.println(str);
            System.out.println(per);
            System.out.println(per1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
