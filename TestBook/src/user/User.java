package user;

import book.BookList;
import operation.IOperation;

public  abstract class User {
    protected String name;

    protected IOperation[]iOperations;
    //定义一个IOperation的数组，因为是User和Normal是继承，且父类是是抽象类
    // 所以User和Normal在继承的时候也继承了这个数组，通过数组来储存并且初始化用户的各个操作。

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    public void doOperation(BookList bookList,int choice){
        //定义一个方法，参数为BookList bookList,int choice，即通过用户的选择，调用对应下标的方法
        this.iOperations[choice].work(bookList);//.work是调用每个操作函数中的work方法，work方法的参数是booklist
    }
}
