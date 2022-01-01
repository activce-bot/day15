package jdbc.JDBCUtil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 操作数据库的工具类
 *
 * @author gjx
 * @create 2021-12-25 11:13
 */
public class JDUtil {
    /**
     * 获取数据库连接
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {

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
        return con;
    }

    /**
     * 数据库资源的关闭！！
     *
     * @param conn
     * @param ps
     * @throws SQLException
     */
    public void closeResource(Connection conn, Statement ps) throws SQLException {
        if (conn != null) {
            conn.close();
        }
        if (ps != null) {
            ps.close();
        }
    }

}


