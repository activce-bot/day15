import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author gjx
 * @create 2021-12-17 10:23
 */
public class hadoopTest {
    public static void main(String[] args) {
        FileSystem fs = null;

        try {
            // 1 获取文件系统
            Configuration configuration = new Configuration();
            //org.apache.hadoop.conf.Configuration;

            fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), configuration, "root");
            //java.net.URI;
            //org.apache.hadoop.fs.FileSystem
            //org.apache.hadoop.fs.Path

            // 2 创建目录
            fs.mkdirs(new Path("/data21/12"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } finally {
            // 3 关闭资源
            try {
                if (fs != null) {
                    fs.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 创建文价夹
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void test1() throws URISyntaxException, IOException, InterruptedException {


        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), new Configuration(), "root");

        fs.mkdirs(new Path("/hello/txt/123"));

        fs.close();

    }

    /**
     * 文件下载！！
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void test2() throws URISyntaxException, IOException, InterruptedException {

        //1.获取fs对象
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), new Configuration(), "root");

        //2.执行上传操作
        //复制文件到指定的位置
        //copyFromLocalFile(src,des) 把src的文件上传到des
//        fs.copyFromLocalFile(new Path("D:\\gjx.txt"), new Path("/hello/"));
        //把文件上传到对于位置并改名为gjx1.txt
        fs.copyFromLocalFile(new Path("D:\\gjx.txt"), new Path("/hello/gjx1.txt"));
        //3.关闭资源

        fs.close();
        System.out.println("over!");

    }

    /**
     * 优先级的测试，本身设置的高于系统设置的！！！！
     *
     * @throws Exception
     */
    @Test
    public void test4() throws Exception {
        //1.获取fs对象
        Configuration con = new Configuration();
        //设置dfs.replicatino 的副本数！！！
        //不配置的话就是使用resources下导入的配置！！
        con.set("dfs.replication", "2");
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), con, "root");

        //2.获取对象
        fs.copyFromLocalFile(new Path("D:\\gjx.txt"), new Path("/hello/txt/123/"));
        //3.关闭对象

        fs.close();
    }
}