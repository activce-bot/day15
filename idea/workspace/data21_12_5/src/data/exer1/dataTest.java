package data.exer1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * * jdk 8之前的日期时间的API测试
 * 1. System类中currentTimeMillis();
 * 2. java.util.Date和子类java.sql.Date
 * 3. SimpleDateFormat
 * 4. Calendar
 *
 * @author gjx
 * @create 2021-12-05 20:01
 */


public class dataTest {
    //system.currentTimeMillis 返回时间
    @Test
    public void run100() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long stop = System.currentTimeMillis();

        System.out.println("\n" + (stop - start));


    }

    //Java.util.data
    @Test
    public void UtilData() {
        Date data1 = new Date();
        System.out.println(data1);//Sun Dec 05 20:10:40 CST 2021

    }

    @Test
    public void testsimpleDateFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date data1 = new Date();
        System.out.println(data1);//Sun Dec 05 20:28:34 CST 2021

        //format 转换为字符串
        String format = sdf.format(data1);//21-12-5 下午8:28
        System.out.println(format);

        //解析 字符串转换为 日期  格式要相同 要不会报错

        String str = "21-12-5 下午8:28";
        Date parse = sdf.parse(str);//21-12-5 下午8:28
        System.out.println(parse);

//*********************************
        //自定义格式
        SimpleDateFormat simp1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = simp1.format(data1);
        System.out.println(format1);
        //要求格式符合构造器的格式，否这抛异常
        Date data2 = simp1.parse("2021-12-05 08:41:14");
        System.out.println(data2);


    }

    /**
     * java.unti.data 转化为 java.sql.Date
     * @throws ParseException
     */
    @Test
    public void Testexer123() throws ParseException {
        String birth = "2021-12-05";
        System.out.println(birth);
        SimpleDateFormat simpp = new SimpleDateFormat("yyyy-MM-dd");
        Date parse1 = simpp.parse(birth);
        System.out.println(parse1);
        // 构造器来转换为sql date
        java.sql.Date birthDate=new java.sql.Date(parse1.getTime());
        System.out.println(birthDate);
    }
}