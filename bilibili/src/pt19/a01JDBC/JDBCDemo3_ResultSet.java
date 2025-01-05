package bilibili.src.pt19.a01JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo3_ResultSet {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://localhost:3306/itcast";
        String username = "root";
        String password = "zy020305";
        Connection conn = DriverManager.getConnection(url, username, password);

        //定义sql
        String sql = "select * from account";

        //获取Statement对象
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        //处理结果
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            double money = rs.getDouble(3);

            System.out.println(id + " " + name + " " + money);
        }

        rs.close();
        stmt.close();
        conn.close();

    }

}
