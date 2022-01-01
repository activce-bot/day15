package testApiTest;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author gjx
 * @create 2021-12-17 20:52
 */
public class FsTest {
    /**
     * 下载文件到本地
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {

        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");
        //copyToLocalFile(src,dsc)
        // 将src下载到dsc
        //fs.copyToLocalFile(new Path("/hello/gjx.txt"),new Path("C:\\Users\\管健雄\\Desktop\\files"));
        //copyToLocalFile(是否删除元数据，src，des，是否校验数据)
        //校验数据就是会生成一个 .crc 文件！，不校验就不会生成
        fs.copyToLocalFile(false, new Path("/hello/gjx.txt"), new Path("C:\\Users\\管健雄\\Desktop\\files\\ggg.txt"), true);

        fs.close();
    }

    /**
     * 文件的删除 delete()
     *
     * @throws Exception
     */
    @Test
    public void test2() {

        FileSystem fs = null;
        try {
            Configuration con = new Configuration();

            fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), con, "root");
            //.....true表示删除目录，否则抛出异常  (我的设置true和false一样。。。。)
            // 设置ture表示删除文件目录下的全部文件  true表示递归！！！
            fs.delete(new Path("/hello/gjx.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } finally {
            if (fs != null) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 文件改名 rename()
     */
    @Test
    public void test3() {
        FileSystem fs = null;
        try {
            Configuration con = new Configuration();

            fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), con, "root");
            fs.rename(new Path("/hello/gjx.txt"), new Path("/hello/jjj.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } finally {
            if (fs != null) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 文件详情的查看  ListFile()
     * (path,recursive) 是否递归
     */
    @Test
    public void test4() throws IOException, URISyntaxException, InterruptedException {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");
        //获取一个迭代器
        RemoteIterator<LocatedFileStatus> reit = fs.listFiles(new Path("/"), true);

        while (reit.hasNext()) {
            //获取到每个文件
            LocatedFileStatus next = reit.next();

            System.out.println("nema:"+next.getPath().getName());//获取名字
            System.out.println("long:"+next.getLen());//获取长度、
            System.out.println("hdfs :"+next.getPermission());//获取文件权限

            //获取副本数
            BlockLocation[] block = next.getBlockLocations();
            for (BlockLocation o : block) {
                //获取每个副本所在的位置
                String[] hosts = o.getHosts();
                //主机名称是一个数组，接着遍历
                for (String p : hosts) {
                    System.out.println("hosts:"+p);
                }
            }
            System.out.println("**********************");
        }
        fs.close();

    }

    /**
     * 判断文件是否时文件还是目录
     *
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void test5() throws URISyntaxException, IOException, InterruptedException {

        Configuration conf = new Configuration();

        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");

        //获取文件状态
        FileStatus[] fsfile = fs.listStatus(new Path("/"));

        for (FileStatus o : fsfile) {
            //判断是否是文件
            if (o.isFile()) {
                System.out.println("file:" + o.getPath().getName());
            } else {
                System.out.println("dir:" + o.getPath().getName());
            }
        }
        fs.close();
    }
}












