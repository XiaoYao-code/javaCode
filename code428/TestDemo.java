package code428;

//import java.util.Date;//导入一个时间的包
//import java.util.*;
//import java.sql.*;
//因为sql和util的包中都有Data方法，所以会报错：
// Reference to 'Date' is ambiguous, both 'java.util.Date' and 'java.sql.Date' match
//对“Date”的引用不明确，“java.util.Date”和“java.sql.Date”
/*public class TestDemo {
    public static void main(String[] args) {//new一个毫秒级别的时间戳
        //Date date=new Date();
        java.util.Date date=new java.util.Date();//直接使用的表达形式
        System.out.println(date);
    }
}*/
//1. java.lang:系统常用基础类(String、Object),此包从JDK1.1后自动导入。
//2. java.lang.reflect:java 反射编程包;
//3. java.net:进行网络编程开发包。
//4. java.sql:进行数据库开发的支持包。
//5. java.util:是java提供的工具程序包。(集合类等) 非常重要
//6. java.io:I/O编程开发包
//-----------------------------------------------------------------------------------------
class Animal{
    public String name;
    //private String name; 如果定义为私有的那么子类仍会继承父类的字段但无法访问
    //刚才我们发现, 如果把字段设为 private, 子类不能访问. 但是设成 public, 又违背了我们 "封装" 的初衷.
    //两全其美的办法就是 protected 关键字.
    //对于类的调用者来说, protected 修饰的字段和方法是不能访问的
    //对于类的 子类 和 同一个包的其他类 来说, protected 修饰的字段和方法是可以访问的
    public Animal(String name){
       this.name=name;
    }
    public void eat(String food){
        System.out.println(this.name+"正在吃"+food);
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);//调用父类的构造方法
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"正在飞");
    }
}

public  class TestDemo{
    public static Animal findMyAnimal() {//向上转型之作为返回值 即Bird类型可以作为Animal类型的返回值
        Bird bird = new Bird("圆圆");
        return bird;
    }
   /* public  static void feed(Animal animal){//向上转型之传参  即此时形参 animal 的类型是 Animal (基类), 实际对应到Bird的实例
        animal.eat("谷子");*/
   // }
    public static void main(String[] args) {
     /*   Cat cat=new Cat("饼饼");
        cat.eat("1230");
        Bird bird=new Bird("比比");
        bird.eat("124");
        bird.fly();*/
      /*  Bird bird=new Bird("比比");
        feed(bird);*/
        Animal animal=findMyAnimal();
        System.out.println(animal.name);
      /*  Animal cat=new Cat("饼饼");
        cat.eat("123");*/
    }
}
    //1.访问修饰限定符的顺序
    // private只能在同一个包的同一个类中被访问；
    //default 只能在同一个包中的同一个类中和同一个包的不同类中被访问
    // protected 只能在同一个包中的同一个类中和同一个包的不同类和不同包中的子类被访问
    //public 都可以访问
    //------------------------------------------------------------------------------
    //2.多层继承，即子类还可以派生出新的子类；但一般不要超过三层，如果超过三层，那么要对代码进行重构。
    //------------------------------------------------------------------------------
    //3.this  和  super的用法
    //this()；   调用本类的其他构造方法；                  super()；调用父类的构造方法
    //this.data；  访问当前类中的属性；                    super()；访问父类的属性
    //this.func(); 调用本类的其他的成员方法；              super.func();访问父类的成员方法
    //------------------------------------------------------------------------------
    //4.final的用法
    //修饰 常量  表示该常量无法经行更改；
    //修饰 类   表示这个类无法被继承；
    //修饰 方法  表示这个方法被密封
    //------------------------------------------------------------------------------
    //5.重写和重载
    //重写 override  1.方法名称相同 2.返回值相同 3.参数类型相同   （不同的类 继承关系上）
    //重载  overlode   1.方法名称相同  2.返回值不做要求  3.参数类型不同 （同一个类中）
    //--------------------------------------------------------------------------------
    //6.重写的注意事项
    //需要重写的方法不能被final修饰，被fibal修饰的它是密封方法，不能修改
    //被重写的方法，访问修饰限定符一定不能是私有的；
    //被重写的方法，子类当中的访问修饰限定要大于等于父类中的访问修饰限定
    //被static修饰的方法是不可以被重写的
