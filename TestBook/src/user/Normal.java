package user;


import com.sun.org.apache.bcel.internal.generic.NEW;
import operation.*;

import java.util.Scanner;

public class Normal extends  User {
    public Normal(String name) {
        super(name);
        this.iOperations=new IOperation[]{

                new ExitOperation(),    //对应下面的操作选择，注意当输入为0时，o号元素应该时退出系统
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()

        };
    }

    @Override
    public int menu() {
        System.out.println("***********************");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("***********************");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;


    }
}
