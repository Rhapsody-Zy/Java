package bilibili.src.pt19.a01JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://localhost:3306/itcast";
        String username = "root";
        String password = "zy020305";
        Connection conn = DriverManager.getConnection(url, username, password);

        //定义sql
        String sql = "update account set money = 2000 where id = 1";

        //获取sql的statement对象
        Statement stmt = conn.createStatement();

        //执行sql
        int count = stmt.executeUpdate(sql);
        //受影响的行数
        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();


    }

}
