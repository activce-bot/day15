package exer1;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * file测试
 * 并没有涉及到文件内容的修改
 *
 * @author gjx
 * @create 2021-12-14 13:30
 */
public class fileTest {

    @Test
    public void test1() {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\fileTest\\fiile1");
        System.out.println(file1.exists());//文件是否存在
        System.out.println(file2.isFile());
        System.out.println(file2.isAbsolute());//是不是绝对路径
        System.out.println(file2.isDirectory());
        System.out.println(file2.isHidden());//是否是隐藏的

//        boolean renameTo = file1.renameTo(new File("helloword.txt"));
//        System.out.println(renameTo);
    }

    @Test
    public void test2() throws IOException {
        //新文件
        File file1 = new File("D:\\fileTest\\file1.txt");
        //文件不存在
        if (!file1.exists()) {
            //创建新   文件
            file1.createNewFile();
            System.out.println("创建成功！！！");
        } else {
            //文件存在，删除
            file1.delete();
            System.out.println("删除成功！！！");
        }
    }

    @Test
    public void test3() {
        File file1 = new File("D:\\idea\\workspace\\data25_12_14\\data25_12_14");
        //创建目录
        File file = new File("D:\\fileTest\\file\\fileTest.txt");
        //返回是否创建成功
        boolean b = file.mkdirs();
        System.out.println(b);
        //mkdir 创建单级目录
        //mkdirs 创建多级目录

        //查看文件的目录下的文件  不带路径  list
        //查看文件的目录下的文件 带路径   listFile
        String[] list = file1.list();
        for (String o : list) {
            System.out.println(o);
        }

    }

    //注意使用的时候，需要调整到main方法下使用，
    //要不会爆错误，在idea中 文件绝对路径使用main和test方法不一样
    //而eclipse 则相同！！！！！
    //如果希望不报错的话需要加上对应的模块名
    //或者加上.\\即可
    public static void main(String[] args) {

        File file1 = new File("D:\\idea\\workspace\\data25_12_14");
        //创建目录
        File file = new File("D:\\fileTest\\file\\fileTest.txt");
        //返回是否创建成功
        boolean b = file.mkdirs();
        System.out.println(b);
        //mkdir 创建单级目录
        //mkdirs 创建多级目录

        //查看文件的目录下的文件  不带路径  list
        //查看文件的目录下的文件 带路径   listFile
        String[] list = file1.list();
        for (String o : list) {
            System.out.println(o);
        }

        File file3 = new File("D:\\fileTest");
        File file4 = new File("D:\\fileTest\\filetest");
        boolean mkdir = file4.mkdir();
        System.out.println(mkdir);
    }

}