package bilibili.src.pt19.a02Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {

        //加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("bilibili\\src\\druid.properties"));

        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //获取数据库连接
        Connection conn = dataSource.getConnection();

        System.out.println(conn);

    }
}
