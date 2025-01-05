package bilibili.src.pt19.a01JDBC;

import bilibili.src.pt19.pojo.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCDemo4_ResultSet2 {
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

        ArrayList<Account> accs = new ArrayList<>();
        //处理结果
        while (rs.next()) {
            Account acc = new Account();
            acc.setId(rs.getInt(1));
            acc.setName(rs.getString(2));
            acc.setMoney(rs.getDouble(3));
            accs.add(acc);
        }

        for (Account acc : accs) {
            System.out.println(acc);
        }

        rs.close();
        stmt.close();
        conn.close();

    }

}
