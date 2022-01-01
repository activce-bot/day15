package data28.exer;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**读取文件内容！！！
 * @author gjx
 * @create 2021-12-17 15:22
 */
public class propertiesTest {
    @Test
    public void test1() throws IOException {
        Properties pro = new Properties();

        //在src下
//        FileInputStream fis = new FileInputStream("src\\data.properties");
        //在当前mod下
        FileInputStream fis = new FileInputStream("data1.properties");

        pro.load(fis);

        String name = pro.getProperty("name");
        String passwd = pro.getProperty("passwd");
        System.out.println(name);
        System.out.println(passwd);
    }
}
