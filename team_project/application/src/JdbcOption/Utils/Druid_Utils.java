package JdbcOption.Utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.DbUtils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Druid_Utils {
    //定义一个静态的数据源
    private static DruidDataSource dataSource = null;
    private static final ThreadLocal<Connection> THREAD_LOCAL=new ThreadLocal<>();
    //在静态代码块中读取文件,创建数据源
    static {
        Properties properties = new Properties();
        InputStream inputStream = DbUtils.class.getResourceAsStream("JdbcOption/druid.properties");
        try {
            properties.load(inputStream);
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
            System.out.println("连接池已创建");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //定义方法，返回连接
    public static Connection getConnection() throws SQLException {
        Connection connection = THREAD_LOCAL.get();
        try {
            {
                if (connection==null){
                    connection = dataSource.getConnection();
                    THREAD_LOCAL.set(connection);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void begin(){
        try {
            Connection connection=null;
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e){
            throw new RuntimeException(e);
        }
    }

    public static void commit(){
        Connection connection = null;

        try {
            connection = getConnection();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeAll(null,null,connection);
        }

    }

    public static void rollback(){
        Connection connection = null;
        try {
            connection=getConnection();
            connection.rollback();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeAll(null,null,connection);
        }
    }

    public static void closeAll(ResultSet resultSet,PreparedStatement preparedStatement,Connection connection){
        try {
            if (resultSet!=null){
                resultSet.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //定义方法，取消连接的引用
    public static void close(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
            System.out.println("连接引用已终止");
        } catch (Exception e) {
            System.out.println("连接关闭ERROR");
            throw new RuntimeException(e);
        }
    }
}
