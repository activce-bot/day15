package come.data26.exer;

import org.junit.Test;

import java.io.*;

/**字符流的使用！！
 *   FileReader
 *   FileWriter
 * @author gjx
 * @create 2021-12-15 10:38
 */
public class fileWirtetTest {
    /**
     * 字符流的使用
     * 文件的写入操作  使用 filewrite
     */
    @Test
    public void testWrite() {
        FileWriter writer = null;
        try {
            File file = new File("hello.txt");

            //filewrite有构造器  ！！！！
            //filewrite(file,ture)  表示文件的写入
            //filewrite(file,false) 和filewrite(file)  表示文件的覆盖操作

            writer = new FileWriter(file, true);
            writer.write("hello word!!!  123455\nhello word123");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //记得判定是否存在 writer
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 文件的复制操作
     */
    @Test
    public void fileReaffileWriteTest() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File filesrc = new File("read.txt");
            File filedesc = new File("write.txt");

            fileReader = new FileReader(filesrc);
            fileWriter = new FileWriter(filedesc,true);

            char[] chars = new char[5];
            int number;
            while ((number = fileReader.read(chars)) != -1) {
                //write(char ,start,stop)！！！！！！！！！！
                //表示读取数组char从start开始到stop的字符
                fileWriter.write(chars, 0, number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}