import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;

public class JDBCdemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class<?> cla=Class.forName("com.mysql.jdbc.Driver");
        System.out.println(cla.getSimpleName());
        /**
         * 完整目标是执行 select * from  exam    查询这个表中的所有数据
         */

//建立数据库链接
//明确数据库所在地
//以后写项目只需要更改数据库名称即可
        String defaultDatabseName="base603";
        String  user="root";
        String password="yao199787";//mysql  密码
        String ur1="jdbc:mysql://127.0.0.1:3306/"+defaultDatabseName+"?useSSL=false&characterEncoding=utf8";//选择编码形式，ip地址都是本机
        Connection connection = DriverManager.getConnection(ur1, user, password);
        //System.out.println(connection);
        //Query(connection);//有结果的query方法
        // updataDemo(connection);//无结果方法
        connection.close();//关闭这个连接
    }

    private static void updataDemo(Connection connection) throws SQLException {
        Statement statement=connection.createStatement();
        String sql="insert into exam (id,name,chinese,math,english) values ('8','姚鑫原','100.0','100.0','100.0')";
        int  affectedRows=statement.executeUpdate(sql);
        System.out.println("Query ok,"+affectedRows+"rows affected");
        statement.close();
    }

    private static void Query(Connection connection) throws SQLException {
        //真正的执行mysql语言，并获取它的数据库返回结果
        Statement statement=connection.createStatement();
        String sql="select *from exam";
        ResultSet resultSet=statement.executeQuery(sql);
        //executeQuery  带有结果的Quey
        //ResultSet 代表的是"结果集"的抽象对象
        // Statement 代表的是"语句"的抽象对象
        int count=0;
        while (resultSet.next()){
            int id=resultSet.getInt(1);//表中第一列
            String name=resultSet.getString(2);   //表中第二列
            double chinese=resultSet.getDouble(3);//表中第三列
            double math=resultSet.getDouble(4);//表中第四列
            double english=resultSet.getDouble(5);//表中第五列
            System.out.print(id+" "+name+" "+chinese+" "+math+" "+english);
            System.out.println();
            count++;
        }
        System.out.println(count+"rows in  set ");
        resultSet.close();//关闭resulSet对象
        statement.close();//关闭statemen对象
    }
}

