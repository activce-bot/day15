package come.data26.exer4;

import org.junit.Test;

import java.io.*;

/**
 * 数据流，使用在数据的存储和写入
 * @author gjx
 * @create 2021-12-15 19:56
 */
public class dataStreamTest {
    @Test
    public void testDataPrint() throws IOException {
        //写入的位置
        //写入时需要 Fileoutputstream 和 DataoutputStream
        FileOutputStream fid = new FileOutputStream("data.txt");
        DataOutputStream dops = new DataOutputStream(fid);

        dops.writeUTF("刘德华");
        //flush 表示刷新内存空间 直接写入
        dops.flush();
        dops.writeInt(45);
        dops.flush();
        dops.writeBoolean(true);
        dops.flush();

        dops.close();
    }
    //对于读取的操作先后有区别！！！
    //先写入的需要先读取！！！
    //读取操作  FileInputStream  DataInputStream
    @Test
    public void testDataOut() throws IOException {

        FileInputStream fid = new FileInputStream("data.txt");
        DataInputStream dis = new DataInputStream(fid);

        String name = dis.readUTF();
        int age = dis.readInt();
        boolean isMale = dis.readBoolean();
        System.out.println("name :"+name+",age:"+age+",isMale:"+isMale);

        fid.close();
    }
}
