package exer1Test;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author gjx
 * @create 2021-12-22 18:52
 */
public class readToCilent {

    @Test
    public void test1() throws URISyntaxException, IOException, InterruptedException {

        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs:/haoop103:9000"), conf, "root");

        FileOutputStream fos = new FileOutputStream("/C:\\Users\\管健雄\\Desktop\\files\\11.txt");
        FSDataInputStream fis = fs.open(new Path("/ggg1.txt"));

        IOUtils.copyBytes(fis, fos, conf);

        fos.close();
        fis.close();
        fs.close();

    }

    /**
     * 自接使用乱码，中文不显示！！！！
     * @throws IOException
     * @throws URISyntaxException
     * @throws InterruptedException
     */
    @Test
    public void test2() throws IOException, URISyntaxException, InterruptedException {

        Configuration conf = new Configuration();

        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");

        FSDataInputStream fis = fs.open(new Path("/ggg1.txt"));


        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\管健雄\\Desktop\\files\\ggj.txt"), true);

        String line;
        while ((line = fis.readLine()) != null) {
            System.out.println(line);
        }
        fos.close();
        fis.close();
        fs.close();

    }


    @Test
    public void test3() throws URISyntaxException, IOException, InterruptedException {
        // 1.获取对象
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");
        //2.获取输出流
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\管健雄\\Desktop\\files\\11.txt"));

        //3.获取输出对象  fs.create
        FSDataOutputStream fos = fs.create(new Path("/ggg1.txt"));

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
     * 读取hdfs的文件到控制台输出不乱码。
     *
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void test4() throws URISyntaxException, IOException, InterruptedException {


        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");

        FSDataInputStream fis = fs.open(new Path("/ggg1.txt"));

        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));

        String line;
        while ((line = bf.readLine()) != null) {
            System.out.println(line);
        }

        bf.close();
        fs.close();
    }


}

