package come.data26.exer2;

import org.junit.Test;

import java.io.*;

/**转换流的操作
 * InputStreamReader
 * OutputStreamWriter
 *  转换字节流！！使用  FileInputStream  和  OutputStreamWriter
 * @author gjx
 * @create 2021-12-15 17:31
 */
public class inputweiterStreamTest {
    //更改编码  utf-8 -->gbk
    @Test
    public void test1() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("hello.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("hello_gbk.txt");

        //使用构造器来决定使用什么解码编码，不加的话使用默认编码集！
        InputStreamReader input = new InputStreamReader(fileInputStream);
        OutputStreamWriter output = new OutputStreamWriter(fileOutputStream,"gbk");

        char[] cbuf = new char[2];
        int number;
        while((number=input.read(cbuf))!=-1){
            output.write(cbuf,0,number);
        }
        output.close();
        input.close();
    }
}
