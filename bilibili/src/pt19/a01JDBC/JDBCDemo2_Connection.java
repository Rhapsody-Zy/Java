package bilibili.src.pt19.a01JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2_Connection {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://localhost:3306/itcast";
        String username = "root";
        String password = "zy020305";
        Connection conn = DriverManager.getConnection(url, username, password);

        //定义sql
        String sql1 = "update account set money = 2000 where id = 1";
        String sql2 = "update account set money = 2000 where id = 2";

        //获取sql的statement对象
        Statement stmt = conn.createStatement();

        //开启事务

        try {
            conn.setAutoCommit(false);
            //执行sql
            int count1 = stmt.executeUpdate(sql1);
            int count2 = stmt.executeUpdate(sql2);
            //受影响的行数
            System.out.println(count1);
            System.out.println(count2);

            conn.commit();
        } catch (SQLException e) {
            //回滚事务
            conn.rollback();
            throw new RuntimeException(e);
        }


        //释放资源
        stmt.close();
        conn.close();


    }

}
