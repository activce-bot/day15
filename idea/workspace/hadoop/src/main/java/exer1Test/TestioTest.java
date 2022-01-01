package exer1Test;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author gjx
 * @create 2021-12-20 12:24
 */
public class TestioTest {
    @Test
    public void test1() throws URISyntaxException, IOException, InterruptedException {

        Configuration conf = new Configuration();
        conf.set("dfs.replication", "1");
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop103:9000"), conf, "root");
        FSDataInputStream fis = fs.open(new Path("/ggg.txt"));

        FileOutputStream fos = new FileOutputStream("C:\\Users\\管健雄\\Desktop\\files\\data12_20");

        IOUtils.copyBytes(fis, fos, conf);

        IOUtils.closeStream(fos);
        IOUtils.closeStream(fis);
        IOUtils.closeStream(fs);
    }
}
