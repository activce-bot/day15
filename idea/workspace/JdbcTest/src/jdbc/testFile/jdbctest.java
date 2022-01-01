package jdbc.testFile;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 * @author gjx
 * @create 2021-12-23 12:25
 */
public class jdbctest {


    @Test
    public void test1() throws SQLException {

        Driver driver = new com.mysql.cj.jdbc.Driver();
        Properties info = new Properties();
        info.getProperty("user", "root");
        info.getProperty("password", "root");

        Connection connect = driver.connect("jdbc:mysql://localhost:3306/jdsc", info);
        System.out.println(connect);

    }

    @Test
    public void test2() throws IOException, ClassNotFoundException, SQLException {

        //1.读取信息
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties ps = new Properties();
        ps.load(is);

        String user = ps.getProperty("user");
        String password = ps.getProperty("password");
        String url = ps.getProperty("url");
        String driverClass = ps.getProperty("driverClass");


        //2.加载驱动！
        Class.forName(driverClass);

        //3.连接数据库
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println(con);


    }

    @Test
    public void test3() throws IOException, ClassNotFoundException, SQLException, ParseException {
        //1.获取信息
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties pa = new Properties();
        pa.load(is);

        String user = pa.getProperty("user");
        String url = pa.getProperty("url");
        String password = pa.getProperty("password");
        String driverClass = pa.getProperty("driverClass");


        //2.加载驱动
        Class.forName(driverClass);

        //3.连接数据库
        Connection con = DriverManager.getConnection(url, user, password);
//        System.out.println(con);
        String sql="insert into emp(emp_id,emp_name,dirthday)values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "哪吒");
        ps.setString(2, "nezha@gmail.com");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = sdf.parse("1000-01-01");
        ps.setDate(3, new Date(date.getTime()));

        ps.close();
        con.close();
    }



}
