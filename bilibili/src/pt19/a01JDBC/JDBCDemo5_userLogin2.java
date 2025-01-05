package bilibili.src.pt19.a01JDBC;

import java.sql.*;

public class JDBCDemo5_userLogin2 {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://localhost:3306/itcast?useServerPrepStmts=true";
        String username = "root";
        String password = "zy020305";
        Connection conn = DriverManager.getConnection(url, username, password);

        //sql注入
        //String pwd = "' or '1' = '1";

        String name = "zhangsan";
        String pwd = "123";

        //定义sql
        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,name);
        pstmt.setString(2,pwd);

        //执行sql
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        rs.close();
        pstmt.close();
        conn.close();

    }

}
