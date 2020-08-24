package code824;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         Math.pow(2,2);
    }
/*    public static void main(String[] args) {
        //声明数据库驱动，数据源的url，用于登录数据库的账户和密码（将其他功能封装成方法的时候方便使用）
        String driver = "数据库驱动名称"；
        String url = "数据库连接地址"
        String user = "用来连接数据库的用户名"；
        String pwd = "用来连接数据库的密码"；
//加载数据库驱动
        Class.forName(driver);
//根据url创建数据库连接对象Connection
        Connection con = DriverManage.getConnection(url,user,pwd);
//用数据库连接对象创建Statement对象(或PrepareStatement)
        Statement s = con.createStatement();
        或
        PrepareStatement ps = con.PrepareStatement(sql);
//做数据库的增删改查工作
        ResultSet rs = s.executeQuery();
//关闭结果集对象Resultset，statement对象，connection对象，
        rs.close();
        s.close();
        con.close();
//各个步骤的异常处理*/
    }
/*        public void run() {
            System.out.println("In run");
            yield();
            System.out.println("Leaving run");
        }
        public static void main(String []argv) {
            (new Main()).start();
        }*/
    
   /* public static void main(String[] args) {
        Object obj=new Object();
        List aList=new ArrayList();
        List bList=new LinkedList();

        long t1=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            aList.add(0,obj);
        }
        long t2=System.currentTimeMillis()-t1;

        t1=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            bList.add(0,obj);
        }
        long t3=System.currentTimeMillis()-t1;
    }*/

