package code820;

public class S extends F {
    static {
        System.out.println("我是子类的静态代码块");
    }

    public S() {
        System.out.println("我是子类的构造方法");
    }

    public static void main(String[] args) {
        S s=new S();
    }
}
