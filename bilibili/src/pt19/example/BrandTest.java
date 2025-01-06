package bilibili.src.pt19.example;

import bilibili.src.pt19.pojo.Brand;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class BrandTest {

    /*
    * 查询所有
    * */

    @Test
    public void testSearchAll() throws Exception {
        //加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("F:\\Java\\bilibili\\src\\druid.properties"));

        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //获取数据库连接
        Connection conn = dataSource.getConnection();

        String sql = "SELECT * FROM tb_brand";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        ArrayList<Brand> list = new ArrayList<>();
        while (rs.next()) {
            Brand br = new Brand();
            br.setId(rs.getInt(1));
            br.setBrandName(rs.getString(2));
            br.setCompanyName(rs.getString(3));
            br.setOrdered(rs.getInt(4));
            br.setDescription(rs.getString(5));
            br.setStatus(rs.getInt(6));
            list.add(br);
        }

        System.out.println(list);
        rs.close();
        pstmt.close();
        conn.close();
    }

    /*
     * 添加数据
     * */

    @Test
    public void testAdd() throws Exception {

        //接收界面提交的数据
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1;
        String description = "地球绕一圈";
        int status = 1;


        //加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("F:\\Java\\bilibili\\src\\druid.properties"));
        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        //获取数据库连接
        Connection conn = dataSource.getConnection();

        String sql = "insert into tb_brand(brand_name, company_name, ordered, description, status) values(?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);

        int count = pstmt.executeUpdate();
        System.out.println(count > 0);

        pstmt.close();
        conn.close();
    }


    /*
     * 修改数据
     * */

    @Test
    public void testUpdate() throws Exception {

        //接收界面提交的数据
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1000;
        String description = "地球绕三圈";
        int status = 1;
        int id = 4;


        //加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("F:\\Java\\bilibili\\src\\druid.properties"));
        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        //获取数据库连接
        Connection conn = dataSource.getConnection();

        String sql = "update tb_brand set brand_name =?, company_name = ?, ordered = ?, description = ?, status = ? where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);
        pstmt.setInt(6,id);

        int count = pstmt.executeUpdate();
        System.out.println(count > 0);


        pstmt.close();
        conn.close();
    }


    /*
     * 删除数据
     * */

    @Test
    public void testDelete() throws Exception {

        int id = 4;

        //加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("F:\\Java\\bilibili\\src\\druid.properties"));
        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        //获取数据库连接
        Connection conn = dataSource.getConnection();

        String sql = "delete\n" +
                "from tb_brand\n" +
                "where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1,id);

        int count = pstmt.executeUpdate();
        System.out.println(count > 0);


        pstmt.close();
        conn.close();
    }
}
