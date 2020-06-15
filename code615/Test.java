package code615;

public class Test {
    static  class  SubTest extends Thread{
        @Override
        public  void  run(){//线程创建方式-内部类
            printField();
        }

    }

    public static void main(String[] args) {
        Thread thread =new SubTest();   //new一个内部类的线程
        thread.start();//把内部类线程加入到调度队列种
        printField();   //main的线程
    }

    private static void printField() {
        Thread t=Thread.currentThread();
        long id = t.getId();
        System.out.println("线程的名字"+id+": "+t.getName());
        System.out.println("线程的优先级"+id+": "+t.getPriority());
        System.out.println("线程的状态"+id+": "+t.getState());
        System.out.println("线程的存活"+id+": "+t.isAlive());
        System.out.println("线程是否是后台"+id+": "+t.isDaemon());

    }
}
