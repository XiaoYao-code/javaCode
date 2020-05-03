package operation;

import book.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出");
        System.exit(1);//代表了程序非正常退出
        //都是用来结束当前正在运行中的java虚拟机。如何status是非零参数，那么表示是非正常退出。
        //   1. System.exit(0)是将你的整个虚拟机里的内容都停掉了 ，而dispose()只是关闭这个窗口，
        //    但是并没有停止整个application exit() 。无论如何，内存都释放了！也就是说连JVM都关闭了
        //    内存里根本不可能还有什么东西。
        //    2.System.exit(0)是正常退出程序，而System.exit(1)或者说非0表示非正常退出程序
        //   3. System.exit(status)不管status为何值都会退出程序。和return 相比有以下不同点：
        //    return是回到上一层，而System.exit(status)是回到最上层
    }
}
