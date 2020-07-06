package com.yaoxinyuan;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {
     private  static volatile DataSource dataSource=null;
    public static  Connection getConnection() throws SQLException {
        if(dataSource==null){
            synchronized (DBUtil.class){
            if (dataSource==null){
                dataSource=initDataSource();
            }
        }
    }
        return dataSource.getConnection();
}

    private static DataSource initDataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/dictionary706?useSSL=false&characterEncoding=utf8");
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("yao199787");
        return mysqlDataSource;
    }
    }

