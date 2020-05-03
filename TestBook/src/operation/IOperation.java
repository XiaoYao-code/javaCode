package operation;

import book.BookList;

public interface IOperation {  //因为操作包中的所有操作类都要对boolist进行操作 所以把它写成一个接口，避免代码重复
     void work(BookList bookList);//不用访问修饰限定符 也不用具体实现，默认它是一个抽象方法
}
