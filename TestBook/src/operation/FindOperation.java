package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要查找书籍的名字");
        String name=scanner.nextLine();
        int i=0;
        for ( i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getbook(i);
            if (book.getName().equals(name)){
                System.out.println(book);
                System.out.println("查找成功");
                return;
            }
        }
        if (i==bookList.getUsedSize()){
            System.out.println("没有这本书");
        }

    }
}
