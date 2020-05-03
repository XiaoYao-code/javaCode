import book.Book;
import book.BookList;
import user.Admin;
import user.Normal;
import user.User;

import java.util.Scanner;

public class TestMain {
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的名字：");
        String name=scanner.nextLine();
        System.out.println("请输入您的身份：1--》管理员，2--》普通用户");
        int choice=scanner.nextInt();
        if (choice==1){
            return  new Admin(name);
        }else {
            return new Normal(name);
        }

    }
    public static void main(String[] args) {
        //1.准备书籍
        BookList  bookList=new BookList();
        //2.登录
        User user=login();
        //3.功能选择
        while (true) {
            int choice = user.menu();//发生了运行时绑定，因为user可能指向管理员或者普通用户
            user.doOperation(bookList, choice);

        }

    }
}
