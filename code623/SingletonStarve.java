package code623;

/**
 * 单例模式-饿汉模式-一开始就构造一个对象，等着被调用。
 * 没有线程安全问题，天生线程安全，类的加载只有一次，对象只有一份，多线程只是调用了多次get方法。
 */
public  final class SingletonStarve {//final关键字修饰这个类，保证了该类不能再被继承，通过子类去构造对象。
    //定义一个引用，来指向这个类唯一对象的地址。
    //final 修饰保证了原子性
    private   static final SingletonStarve instance;

    //静态关键字 static 保证了它只能被new一次
    static {
        instance=new SingletonStarve();
    }

    //通过调用getInstance方法返回这个类的唯一对象
    public static SingletonStarve  getInstance(){
        return instance;
    }

    //防君子不妨小人，为了防止误用，把构造方法写为private
    private SingletonStarve() {

    }
}
