package come.data26.exer1;

import org.junit.Test;

import java.io.*;

/**
 * 缓冲流的使用  可以提高读取速度!!!!!
 * 处理流就是套接在 已有的流上的
 *
 * @author gjx
 * @create 2021-12-15 15:20
 */
public class BufferFileinputTest {
    /*
    BufferedInputStream
    FileOutputStream
     */
    @Test
    public void test1() {
        long start = System.currentTimeMillis();
        BufferedInputStream bffinput = null;
        BufferedOutputStream bffoutput = null;
        try {
            File srcfile = new File("D:\\BaiduNetdiskDownload\\java\\111\\111.avi");
            File descfile = new File("D:\\BaiduNetdiskDownload\\java\\111\\222.avi");

            FileInputStream fileInputStream = new FileInputStream(srcfile);
            FileOutputStream fileOutputStream = new FileOutputStream(descfile);

            bffinput = new BufferedInputStream(fileInputStream);
            bffoutput = new BufferedOutputStream(fileOutputStream);

            byte[] bytes = new byte[1024];
            int number;
            while ((number = bffinput.read(bytes)) != -1) {
                bffoutput.write(bytes, 0, number);
            }
            System.out.println("传输成功！！！");
            long stop = System.currentTimeMillis();
            System.out.println("传输花费的时间为:" + (stop - start));//117
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流的时候，把外层流关闭时，会自动关闭内层流！！！
            //关闭流的时候，把外层流关闭时，会自动关闭内层流！！！
            //关闭流的时候，把外层流关闭时，会自动关闭内层流！！！
            if (bffinput != null) {
                try {
                    bffoutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bffoutput != null) {
                try {
                    bffinput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 字节流的使用
     * BufferedReader
     * BufferedWriter
     *
     * @throws IOException
     */
    @Test
    public void test2() {
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        try {
            bfr = new BufferedReader(new FileReader(new File("hello.txt")));
            bfw = new BufferedWriter(new FileWriter(new File("hello1.txt"), true));
//         方式一
//        char[] chars = new char[10];
//        int number;
//        while ((number = bfr.read(chars)) != -1) {
//            bfw.write(chars,0,number);
//        }
            //方式二  使用  BufferedReader的readLine 读取字符
            //      但是不会返回换行  需要自己添加！！！！！！
            String str;
            while ((str = bfr.readLine()) != null) {
                bfw.write(str + "\t");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bfw != null) {
                try {
                    bfw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bfr != null) {
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}