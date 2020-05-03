package operation;
import book.Book;
import book.BookList;

import java.util.Scanner;

public class DeleteOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要删除书籍的名字");
        String name=scanner.nextLine();
        int i=0;
        for ( i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getbook(i);
            if (book.getName().equals(name)){
                break;
            }
        }
        if (i==bookList.getUsedSize()){
            System.out.println("没有这本书");
            return;
        }
        for (int j = i; j <bookList.getUsedSize()-1 ; j++) {//相当于一个顺序表的删除操作
            Book book=bookList.getbook(j+1);
            bookList.setBooks(j,book);
        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
        System.out.println("删除成功！");

    }
}
