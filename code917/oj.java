package code623;

public class Main {
    public static void main(String[] args) {
        //正确的调用方法
        SingletonStarve right=SingletonStarve.getInstance();
        try {
            //反射方法也能拿到一个新的构造对象
            SingletonStarve error=SingletonStarve.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
