package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要归还书籍的名字");
        String name=scanner.nextLine();
        int i=0;
        for ( i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getbook(i);
            if (book.getName().equals(name)){
                book.setBorrowed("未借出");
                System.out.println("归还成功");
                return;
            }
        }
        if (i==bookList.getUsedSize()){
            System.out.println("没有你要借阅的这本书");
        }

    }
}
