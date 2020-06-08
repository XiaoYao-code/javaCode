package code608;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class MYSQLClient {
    /*
         一下配置可以用户输入参数替换
     */
    private  static String host="127.0.0.1";
    private  static String user=null;
    private  static String password="";
    private  static String defaultDatabaseName="";
    private  static int port=3306;


    public static void main(String[] args) throws ClassNotFoundException {
        //args  []代表用户的输入命令
       // System.out.println(Arrays.toString(args));
        if (args.length==0){
            printUsageAndEixt();
        }
        //解析参数，获取连接数据库信息
        parseArguments(args);
        Class.forName("com.mysql.jdbc.Driver");
        String ur1=String.format("jdbc:mysql://%s:%d/%s?useSSL=false&charsetEncoding=utf8",host
        ,port,defaultDatabaseName);
       /* System.out.println(ur1);

        System.out.println(user);
        System.out.println(password);
        System.exit(0);*/
        try {
            Connection connection= DriverManager.getConnection(ur1,user,password);
            printWelcome();
            Scanner scanner=new Scanner(System.in);
            System.out.print("mysql> ");

            while (true){
                String cmd= scanner.nextLine();
                if (cmd.equalsIgnoreCase("quit")){//突显一次连接，多次执行
                    break;
                }
                while (cmd.endsWith(";")){//模拟真实情况下不输入分号，一行命令就不结束的情况   quit不用输入分号
                    System.out.println("   ->");
                    cmd+=scanner.nextLine();
                }
                cmd=cmd.substring(0,cmd.length()-1);
                //System.out.println("DEBUG"+cmd);

                //select 和 show开头的sql是会返回结果的。
                //所以使用带ResultSet的查询方式
                //否则，则使用executeUpdata 的执行方式

                if (cmd.startsWith("select")||cmd.startsWith("show")){
                 executeQuery(connection,cmd);
                }else {
                    executeUpdata(connection,cmd);
                }
                System.out.print("mysql> ");


            }
            connection.close();

        }catch (SQLException e){
            printUsageAndEixt(e.toString());
        }
        /*System.out.println(host);
        System.out.println(port);
        System.out.println(user);
        System.out.println(password);
        System.out.println(defaultDatabaseName);*/
    }

    private static void executeUpdata(Connection connection, String sql) throws SQLException {
        long b=System.currentTimeMillis();
        Statement statement=connection.createStatement();
        int count=statement.executeUpdate(sql);
        long e=System.currentTimeMillis();
        System.out.println("Query OK ,"+count+"rows affected ("+(e-b)/1000.0+"sec)");
        statement.close();
    }

    private static void executeQuery(Connection connection, String cmd) throws SQLException {
        long b=System.currentTimeMillis();
        Statement statement=connection.createStatement();
        //利用结果集中的"元数据MeData"，获取一些基本信息

        ResultSet resultSet=statement.executeQuery(cmd);//获得列数
        int columnCount=resultSet.getMetaData().getColumnCount();
        for (int i = 0; i <columnCount ; i++) {//每一列名称是什么 打印表头
             String label=resultSet.getMetaData().getColumnLabel(i+1);
            if (i != columnCount - 1) {
                System.out.print(label+" ,");
            }else {
                System.out.println(label );
            }
         }
          int rowCount=0;
        while (resultSet.next()){
            rowCount++;
            for (int i = 0; i <columnCount ; i++) {
                    String value=resultSet.getString(i+1);
                if (i != columnCount - 1) {
                    System.out.print(value+" ,");

                }else {
                    System.out.println(value);
                }
            }
        }
        long e=System.currentTimeMillis();
        System.out.println(rowCount+"  rows in set ("+(e-b)/1000.0+"sec)");
        resultSet.close();
        statement.close();
    }

    private static void printWelcome() {
        System.out.println("欢迎来到MYSQLClient");
    }

    private static void parseArguments(String[] args) {
        defaultDatabaseName =args[args.length-1];
        args=Arrays.copyOfRange(args,0,args.length-1);
        for (int i = 0; i <args.length ; i++) {
            String arg=args[i];
            switch (arg){
                case "--help":
                    printUsageAndEixt();
                case "-h":
                case "--host":
                    host=args[++i];
                    break;
                case "-P":
                case "--port":
                    port=Integer.parseInt(args[++i]);
                    break;
                case "-u":
                case "--user":
                    user=args[++i];
                    break;
                case "-p":
                case "--password":
                    password=args[++i];
                    break;
                default:
                    printUsageAndEixt("不认识的选项"+arg);
            }
        }
    }

    private static void printUsageAndEixt( String... messages) {
        System.out.println("使用帮助：mysql[选项][默认数据库]");
        System.out.println("--help            打印帮助信息");
        System.out.println("-h,--host         连接主机，默认是127.0.0.1");
        System.out.println("-P，--port        连接端口，默认是3306");
        System.out.println("-u，--user        mysql用户名，必须设置");
        System.out.println("-p，--password    mysql密码");
        //关于流的一个操作
        //1.stream的操作等于2的代码
        //方法的引用
        //Arrays.stream(messages).peek(System.out::println);
        //2.
        for (String S: messages) {
            System.out.println(S);
        }
    }
}
