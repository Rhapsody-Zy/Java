package bilibili.src.pt19.a01JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo5_userLogin {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://localhost:3306/itcast";
        String username = "root";
        String password = "zy020305";
        Connection conn = DriverManager.getConnection(url, username, password);


        String name = "zhangsan";
        String pwd = "123";

        //定义sql
        String sql = "select * from user where username = '"+name+"' and password = '"+pwd+"'";
        //获取Statement对象
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        rs.close();
        stmt.close();
        conn.close();

    }

}
