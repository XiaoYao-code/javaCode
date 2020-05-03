package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {//implement   使生效; 贯彻; 执行; 实施;
                                                                // 工具; 器具; (常指) 简单的户外用具;

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要借阅书籍的名字");
        String name=scanner.nextLine();
        int i=0;
        for ( i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getbook(i);
            if (book.getName().equals(name)){
                book.setBorrowed("借出");
                System.out.println("借阅成功");
                return;
            }
        }
        if (i==bookList.getUsedSize()){
            System.out.println("没有你要借阅的这本书");
        }
    }
}
