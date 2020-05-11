package code511;

import java.util.Scanner;

class UserError extends Exception{
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception{
    public PasswordError(String message) {
        super(message);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        while (sc.hasNext()){  //循环输入
            String str=sc.nextLine();
            StringBuffer stringBuffer=new StringBuffer();
            for (int i = 0; i <str.length() ; i++) {
                char ch=str.charAt(i);
                String tmp=stringBuffer.toString();
                if (!tmp.contains(ch+"")){    //字符型转化为字符串类型
                    stringBuffer.append(ch);
                }
            }
            System.out.println(stringBuffer);
        }

    }

    /*
    private static final String password = "199775";
    private static final String userName = "yaoxinyuan";
    public static void main(String[] args) {
        try {
            login("yaoxinyuan", "199775");
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        } catch (UserError userError) {
            userError.printStackTrace();
        }
    }
    public static void login(String userName, String password) throws UserError, PasswordError {
        if (!TestDemo.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }
        if (!TestDemo.password.equals(password)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登录成功");
    }*/
}
