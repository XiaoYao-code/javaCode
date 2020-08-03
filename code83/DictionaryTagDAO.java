package yaoxinyuan.dao;

import yaoxinyuan.model.DictionaryTag;
import yaoxinyuan.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DictionaryTagDAO {
    //操作数据JDBC的步骤：
    //1.创建数据库连接Connection。
    //2.创建操作命令对象Statement
    //3.执行sql
    //4。如果是查询操作处理结果集
    //5.释放资源
    public static List<DictionaryTag> query(String key) {
        Connection c=null;
        PreparedStatement  ps=null;
        ResultSet rs=null;
        List<DictionaryTag> list=new ArrayList<>();
        try {
            //1.获取数据库连接
            c= DBUtil.getConnection();//工具类以及该封装好的方法
            String sql="";//sql语句预编译
            //2.创建操作命令对象
            ps=c.prepareStatement(sql);
            //3.执行查询操作
            rs=ps.executeQuery();
            //4.处理查询结果集
            while (rs.next()){
                DictionaryTag dictionaryTag=new DictionaryTag();
                //设置属性通过结果集获取，并添加到list中
                list.add(dictionaryTag);
            }
            return list;
        } catch (Exception e) {
            throw  new RuntimeException("查询数据字典标签出错",e);//如果不把这个具体的异常信息传入参数，那么异常信息就会丢失，出现问题时不方便定位
        } finally {
            //5.释放资源
            DBUtil.close(c,ps,rs);//封装得释放资源的方法
        }
    }
}
