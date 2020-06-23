package code623;
/**
 * 单例模式-懒汉模式第一版-被调用才构造对象，第一次调用构造，以后不再构造
 * 存在线程安全问题
 */
public class SingletonLazy {
    //定义一个引用指向类唯一的instance对象的地址
    private static  volatile   SingletonLazy instance;

    //
    public  synchronized static SingletonLazy getInstance1(){
        if (instance==null){//如果指向的地址为空，那么是第一次创建，new一个 对象，不为空说明这个对象已经被创建。
            instance=new SingletonLazy();
        }
        return instance;//返回这个引用
    }

    //防止误调用而将构造方法设置为private
    private SingletonLazy() {
    }
    public  synchronized static SingletonLazy getInstance(){
        if (instance==null){
            synchronized (SingletonLazy.class){//instance可能为null也可能不是null
                if (instance==null)//因为锁的存在所以这里只会被执行一次。
                instance=new SingletonLazy();
            }//讨论第二个if不为null的情况，说明该线程在申请锁到申请成功这段时间内，已经有其他申请锁成功的线程实例化一次了，也就不需要再实例化了，直接返回就行了。

        }
        return instance;
    }
}
