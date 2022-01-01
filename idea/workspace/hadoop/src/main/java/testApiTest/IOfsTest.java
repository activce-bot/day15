package testApiTest;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author gjx
 * @create 2021-12-19 15:01
 */
public class IOfsTest {
    /**
     * hdfs文件的上传 io操作
     *
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void test1() throws URISyntaxException, IOException, InterruptedException {

        // 1.获取对象
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");
        //2.获取输出流
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\管健雄\\Desktop\\files\\11.txt"));
        //3.获取输出对象  fs.create
        FSDataOutputStream fos = fs.create(new Path("/ggg1.txt"));

//        //4.流的对拷 方式一
//        IOUtils.copyBytes(fis, fos, conf);
//        //5.关闭流的资源
//        IOUtils.closeStream(fos);
//        IOUtils.closeStream(fis);
        //4.文件的写入 方式二
        byte[] abyte = new byte[10];
        int number;
        while ((number = fis.read(abyte)) != -1) {
            fos.write(abyte, 0, number);
        }
        //5.关闭流的资源
        fos.close();
        fis.close();
        fs.close();
    }

    /**
     * hdfs文件的下载 io操作
     *
     * @throws IOException
     */
    @Test
    public void test2() throws IOException {
        // 1.获取对象
        FileSystem fs = null;
        FSDataInputStream fis = null;
        FileOutputStream fos = null;
        try {
            Configuration conf = new Configuration();

            fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");

            //2.获取输入流  fs.open()!!!
            fis = fs.open(new Path("/ggg.txt"));

            //3.获取输入对象 加上true就写入，不加就是覆盖
            fos = new FileOutputStream(new File("C:\\Users\\管健雄\\Desktop\\files\\ggj.txt"), true);

            //方式一 流的对拷
//            IOUtils.copyBytes(fis, fos, conf);

            //4.读取操作方式二
            byte[] bytes = new byte[10];
            int number;
            while ((number = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            //5.关闭流的资源
            fos.close();
            fis.close();
            fs.close();
        }


    }

    /**
     * hdfs
     * 文件的定位读取 读取大文件
     * 截断读取文件
     * 下载第一块128M
     */
    @Test
    public void test3() throws URISyntaxException, IOException, InterruptedException {

        //1.获取对象
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");

        //2.获取输入流
        FSDataInputStream fis = fs.open(new Path("/hadoop-2.7.1.tar.gz"));

        //3.获取输出流
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\管健雄\\Desktop\\files\\hadoop-2.1.tar"));


        //4.读取操作  下载128M
        byte[] bytes = new byte[1024];
        for (int i = 0; i < 1024 * 128; i++) {
            fis.read(bytes);
            fos.write(bytes);
        }

        //5.关闭资源
        IOUtils.closeStream(fos);
        IOUtils.closeStream(fis);
        IOUtils.closeStream(fs);
    }

    /**
     * //定位到从128M开始下载
     *
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void test4() throws URISyntaxException, IOException, InterruptedException {

        Configuration conf = new Configuration();

        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");

        FSDataInputStream fis = fs.open(new Path("/hadoop-2.7.1.tar.gz"));

        //3.获取输出流
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\管健雄\\Desktop\\files\\hadoop-2.2.tar"));

        //定位到从128M开始下载
        fis.seek(1024 * 1024 * 128);

        IOUtils.copyBytes(fis, fos, conf);

        fos.close();
        fis.close();
        fs.close();

    }

    /**
     * 定位到从10M开始下载10m
     */

    @Test
    public void test5() throws IOException {
        FileSystem fs = null;
        FSDataInputStream fis = null;
        FileOutputStream fos = null;
        try {
            Configuration conf = new Configuration();
            fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");

            //输入流
            fis = fs.open(new Path("/hadoop-2.7.1.tar.gz"));

            //输出流
            fos = new FileOutputStream("C:\\Users\\管健雄\\Desktop\\files\\hadoop-10-10m.tar", true);

            //定位到10m的位置
            fis.seek(10 * 1024 * 1024);

            byte[] bytes = new byte[1024];
            for (int i = 0; i < 10 * 1024; i++) {
                fis.read(bytes);
                fos.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            fos.close();
            fis.close();
            fs.close();
        }
    }

    /**
     * 文件下载俩次
     */
    @Test
    public void test6() throws URISyntaxException, IOException, InterruptedException {
        // 1.获取对象
        FileSystem fs = null;
        FSDataInputStream fis = null;
        FileOutputStream fos = null;
        try {
            Configuration conf = new Configuration();

            fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");

            //2.获取输入流  fs.open()!!!
            fis = fs.open(new Path("/ggg.txt"));

            //3.获取输入对象 加上true就写入，不加就是覆盖
            fos = new FileOutputStream(new File("C:\\Users\\管健雄\\Desktop\\files\\ggj.txt"));

//            //方式一 流的对拷
//            IOUtils.copyBytes(fis, fos, conf);

            //4.读取操作方式二
            byte[] bytes = new byte[10];
            int number;
            while ((number = fis.read(bytes)) != -1) {
                fos.write(bytes,0,number);
                System.out.println(bytes);
            }
            fis.seek(0);
            IOUtils.copyBytes(fis, fos, conf);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            //5.关闭流的资源
            fos.close();
            fis.close();
            fs.close();
        }






    }


}





















