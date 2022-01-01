package come.data26.exer;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 抽象基类         节点流（或文件流）                               缓冲流（处理流的一种）
 * InputStream     FileInputStream   (read(byte[] buffer))        BufferedInputStream (read(byte[] buffer))
 * OutputStream    FileOutputStream  (write(byte[] buffer,0,len)  BufferedOutputStream (write(byte[] buffer,0,len) / flush()
 * Reader          FileReader (read(char[] cbuf))                 BufferedReader (read(char[] cbuf) / readLine())
 * Writer          FileWriter (write(char[] cbuf,0,len)           BufferedWriter (write(char[] cbuf,0,len) / flush()
 *
 *
 * 转换流的使用！！！
 * InputStreamReader:将输入的字节流转换为输入的字符流。 解码
 * OutputStreamWriter：将输出的字符流转换为输出的字节流。编码
 * @author gjx
 * @create 2021-12-15 10:02
 */
public class fileTest3 {
    @Test
    public void test1() {
        FileReader fileReader = null;
        try {
            File file = new File(".\\hello.txt");
            fileReader = new FileReader(file);

            char[] chars = new char[5];
            int number;
            while ((number = fileReader.read(chars)) != -1) {
                for (int i = 0; i < number; i++) {
                    //记得输出的是char数组！！！！！！！
                    System.out.print(chars[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileReader!=null)
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
