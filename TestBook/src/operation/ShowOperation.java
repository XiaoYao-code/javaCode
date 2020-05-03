package operation;

import book.Book;
import book.BookList;

public class ShowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("展示书籍");
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getbook(i);
            System.out.println(book);
        }

    }
}
