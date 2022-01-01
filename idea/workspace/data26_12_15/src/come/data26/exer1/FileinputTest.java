package come.data26.exer1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流的使用
 *
 * @author gjx
 * @create 2021-12-15 13:10
 */
public class FileinputTest {
    /**
     * 字节流的使用
     *  处理字符流只可以对其进行复制操作
     * 查看操作修改等会乱码
     * FileInputStream
     * FileOutputStream
     *
     */
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fds = null;
        try {
            File filesrc = new File("hello.txt");
            File filedes = new File("hello1.txt");

            fis = new FileInputStream(filesrc);
            fds = new FileOutputStream(filedes);

            byte[] bytes = new byte[512];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                    fds.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fds != null) {
                try {
                    fds.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    /**
     * 包装字节流的方法
     */
     public void  fileInputFileOutTest(String fileStr,String fileDesc){
         long start = System.currentTimeMillis();
         FileInputStream fis = null;
         FileOutputStream fds = null;
         try {
             File filesrc = new File(fileStr);
             File filedes = new File(fileDesc);

             fis = new FileInputStream(filesrc);
             fds = new FileOutputStream(filedes);

             byte[] bytes = new byte[1024];
             int len;
             while ((len = fis.read(bytes)) != -1) {
                 fds.write(bytes,0,len);
             }
             System.out.println("传输完成！");
             long stop = System.currentTimeMillis();
             System.out.println("文件传输的时间为"+(stop-start));
         } catch (IOException e) {
             e.printStackTrace();
         } finally {
             if (fds != null) {
                 try {
                     fds.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
             if (fis != null) {
                 try {
                     fis.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }

         }
    }
    @Test
    public void test3(){
//        long start = System.currentTimeMillis();
        String str="D:\\新11\\01.avi";
         String desc="D:\\新11\\1111.avi";
         fileInputFileOutTest(str,desc);
//        long stop = System.currentTimeMillis();
//        System.out.println("文件传输的时间为"+(stop-start));
    }


}
