package data21.exer1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author gjx
 * @create 2021-12-08 14:28
 */

public class testDate {


    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String format= sdf.format("2017-08-16");
//
//        System.out.println(format);
        java.util.Date data = sdf.parse("2017-08-16");
        System.out.println(data);
    }
}
