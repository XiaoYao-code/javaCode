package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {//alt+enter
    @Override
    public void work(BookList bookList) {//实现一个接口要重写它的方法
        System.out.println("添加书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name=scanner.nextLine();
        System.out.println("请输入图书的作者");
        String author=scanner.nextLine();
        System.out.println("请输入图书的价格");
        double price=scanner.nextDouble();
        System.out.println("请输入图书的类型");
        String type=scanner.next();
        //不能直接用nextLine()
        //1.next（）一定要读取到有效字符后才可以结束输入，对输入有效字符之前遇到的空格键、
        // Tab键或Enter键等结束符，next（）方法会自动将其去掉，只有在输入有效字符之后，
        // next（）方法才将其后输入的空格键、Tab键或Enter键等视为分隔符或结束符。简单地说，
        // next（）查找并返回来自此扫描器的下一个完整标记。完整标记的前后是与分隔模式匹配的输入信息，
        // 所以next方法不能得到带空格的字符串而nextLine（）方法的结束符只是Enter键，
        // 即nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
        //
        //2.同样对于nextInt()、nextDouble()等和next一样一定要读取到有效字符后才可以结束输入，
        // 对输入有效字符之前遇到的空格键、Tab键或Enter键等结束符，next（）方法会自动将其去掉，
        // 只有在输入有效字符之后，next（）方法才将其后输入的空格键、Tab键或Enter键等视为分隔符或结束符。
        //
        //3.所以如果next()或者nextInt()等下面有nextLine()时，
        // 中间要再加一句nextLine()用来接收next()或者nextInt()等过滤的回车、tab、空格。
        // 这样才能让下面的nextLine()生效，否则它就接收了enter、tab、空格等，导致用户没有输入就结束了。

        Book book=new Book(name,author,price,type);

        int curSize=bookList.getUsedSize();//得到当前书籍个数，因为下标是从0开始所以在curSize插入新的对象
        bookList.setBooks(curSize,book);  //位置 和书名
        bookList.setUsedSize(curSize+1);   //set方法 usedSize=curSize+1
        System.out.println("新增成功！");

    }
}
