package exer1;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author gjx
 * @create 2021-12-14 17:48
 */
public class fileTest1 {


    public static void main(String[] args) throws IOException {
        //1.输入文件对象
        File file = new File("D:\\idea\\workspace\\data25_12_14\\hello.txt");
        //2.提供流
        FileReader fileReader = new FileReader(file);
        //3.文件读取
        int read = fileReader.read();
        //read 返回当前读取的一个字符 ，若找不到则返回-1
        while (read != -1) {
            System.out.print((char) read);
            //指针下移
            read = fileReader.read();
        }
        System.out.println();
        //4.流的关闭
        fileReader.close();
    }

    //改进后的！！！！使用try catch finally
    // ！！！！！！！！！很重要！！！
    @Test
    public void test2() {
        FileReader fileReader = null;
        try {
            //1.输入文件对象
            File file = new File(".\\hello.txt");
            //2.提供流
            fileReader = new FileReader(file);
            //3.文件读取
            int read = fileReader.read();
            //read() 返回当前读取的一个字符 ，若找不到则返回-1
            while (read != -1) {
                System.out.print((char) read);
                //指针下移
                read = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //防止流出问题
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    /**
     * 一次读取多个字符
     * 调用 fileread . read(char[] char)的构造器,返回读取的个数 并把读取的数据赋给char[] char!!!!
     * 后面遍历就只需要遍历char[] 即可
     * * @throws IOException
     */
    @Test
    public void test3() throws IOException {
        //1.获取文件
        File file = new File(".\\hello.txt");
        //2.创建流
        FileReader fileReader = new FileReader(file);
        //读取文件
        //每次读取的个数
        char[] chr = new char[5];
        int number;
        //每次读取的个数
        while ((number = fileReader.read(chr)) != -1) {
            for (int i = 0; i < number; i++) {
                System.out.print(chr[i]);
            }
//            System.out.println(number);
        }
        //4.流的关闭
        fileReader.close();
    }



}