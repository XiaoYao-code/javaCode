package code605;

import java.sql.*;

public class Sql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动 —— 选择了乙方
        Class.forName("com.mysql.jdbc.Driver");

        /**
         * 完整的目标是执行 select * from student_0604;
         */

        // 建立数据库连接

        // 写明 MySQL 服务端所在地
        // 以后写项目，只需要修改默认数据库名称即可
        String defaultDatabaseName = "base603";
        // 填写你自己的 MySQL 密码，每个同学都不太一样
        String password = "yao199787";

        // 下面这里，基本上不变
        String user = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/" + defaultDatabaseName + "?useSSL=false&characterEncoding=utf8";

        Connection connection = DriverManager.getConnection(url, user, password);
        // 打印 connection 对象，验证是否连接成功
        System.out.println(connection);
       // connection.close();//关闭刚才建立的链接
        // 要真正的执行 sql 语言，并且获取数据库返回的结果
        Statement statement = connection.createStatement();
        String sql = "select * from exam";  // 没有要求必须分号结尾了
        ResultSet resultSet = statement.executeQuery(sql);
        int count = 0;

        while (resultSet.next()) {
              int id  = resultSet.getInt(1);
            String name = resultSet.getString(2);
            double chinese = resultSet.getDouble(3);
            double math = resultSet.getDouble(4);
            double english = resultSet.getDouble(5);


            System.out.println(id+" "+name+" "+chinese+" "+math+" "+english);
            count++;
        }

        System.out.format("%d rows in set", count);
        // -3. 关闭 resultSet 对象
        resultSet.close();
        // -2. 关闭 statement 对象
        statement.close();
    }

}
