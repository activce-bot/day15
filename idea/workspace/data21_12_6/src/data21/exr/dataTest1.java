package data21.exr;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 从键盘输入一个日期 计算到1990—01-01的天数
 * @author gjx
 * @create 2021-12-06 9:52
 */



public class dataTest1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        System.out.println("计算1990—01-01到某天的天数！");
        System.out.println("请输入一个日期（格式为1990—01-01)");
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();

        String for2 = sdf.format("1990—01?-01");
        Date parse = sdf.parse("1990—01-01");
        System.out.println(parse);


    }
}
