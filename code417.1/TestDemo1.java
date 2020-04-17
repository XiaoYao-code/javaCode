package code417;
class Test{
    public int a;
    public static int count;
}

public class TestDemo1 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a++;//1
        Test.count++;//1
        System.out.println(t1.a);//1
        System.out.println(Test.count);//1
        System.out.println("============");
        Test t2 = new Test();
        t2.a++;//1
        Test.count++;//2
        System.out.println(t2.a);//1
        System.out.println(Test.count);//2
    }
}
//输出结果
//1
//1
//==========               说明： 非静态成员变量在实例化对象时，每new一个对象就会开辟一份内存空间，就存在一个a值，
//1                               但是静态成员变量，在实例化对象时存储在方法区，所有对象公用1个。
//2