package user;

import operation.*;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name) {
        super(name);
        this.iOperations=new IOperation[]{

           new ExitOperation(),//对应下面的操作选择，注意当输入为0时，o号元素应该时退出系统
           new FindOperation(),
           new AddOperation(),
           new DeleteOperation(),
           new ShowOperation()

        };
    }

    @Override
    public int menu() {
        System.out.println("***********************");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.展示图书");
        System.out.println("0.退出系统");
        System.out.println("***********************");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
}
