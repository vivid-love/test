package mysql;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class test1 {
    private Connection connection;
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    public test1(){
        try {
            Properties p = new Properties();
            try {
                p.load(new FileReader("src/mysql/jdbc.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            driver = p.getProperty("driver");
            url = p.getProperty("url");
            username = p.getProperty("user");
            password = p.getProperty("password");
            Class.forName(driver);//加载驱动
        } catch (ClassNotFoundException e) {
            System.out.println("找不到驱动程序类，加载驱动失败！");
            e.printStackTrace();
        }
        try {
            this.connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void MysqlClose() throws SQLException {
        connection.close();
        System.out.println("数据库关闭！");
    }
    private void getInformation() throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        preparedStatement = connection.prepareStatement("select * from  student");
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
    }
    public static void main(String[] args) throws SQLException {
        test1 test11 = new test1();
        test11.getInformation();
        test11.MysqlClose();
    }

}
