package come.data26.exer3;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 标准的输入输出流
 *
 * @author gjx
 * @create 2021-12-15 19:16
 */
public class printTest {
    //输入流system.in

    /**
     * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续
     * 进行输入操作，直至当输入“e”或者“exit”时，退出程序。
     */
    @Test
    public void test1() throws IOException {
        //输入流 --> 转换流 --> bufferedreader 的readlind
        InputStreamReader inputread = new InputStreamReader(System.in);
        System.out.println("输入一个字符串，返回大写的（输入e或exit退出）");

        BufferedReader bufferedReader = new BufferedReader(inputread);

        while (true) {
            //readline 表示输入一行数据 ，有换行则去除！！！！
            String data = bufferedReader.readLine();
            if (data.equalsIgnoreCase("e") || data.equalsIgnoreCase("exit")) {
                System.out.println("退出程序");
                break;
            }
            System.out.println(data.toLowerCase());
            break;
        }
        bufferedReader.close();
    }
    /**
     * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续
     * 进行输入操作，直至当输入“e”或者“exit”时，退出程序。
     */
    public static void main(String[] args) throws IOException {

        InputStreamReader inputread = new InputStreamReader(System.in);

        System.out.println("输入一个字符串，返回大写的（输入e或exit退出）");

        BufferedReader bufferedReader = new BufferedReader(inputread);

        while (true) {
            //readline 表示输入一行数据 ，有换行则去除！！！！
            String data = bufferedReader.readLine();
            //equalsIgnoreCase 表示不区分的小写！
            if (data.equalsIgnoreCase("e") || data.equalsIgnoreCase("exit")) {
                System.out.println("退出程序");
                break;
            }
            //转换为大写！！！ toUpperCase()!!!
            System.out.println(data.toUpperCase());
        }
        bufferedReader.close();
    }
}
