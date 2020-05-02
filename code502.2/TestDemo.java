package code502;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
class Person implements Cloneable{  //实现clone接口     深拷贝
    //**** 简单类型就是深拷贝，引用类型是浅拷贝  java是面向对象的基本都是浅拷贝
    //Cloneable是一个空接口，  也叫做标记接口，如果一个类实现了这个接口，那么就标记这个类，意味着它可以进行克隆
    public int age;
    @Override//重写clone 方法。alt+insert
    protected Object clone() throws CloneNotSupportedException {//扔了一个异常
        return super.clone();//返回值是object类型
    }
}
public class TestDemo  {
    public static void main(String[] args) throws CloneNotSupportedException {//处理这个异常
    Person person1=new Person();
    Person person2=(Person)person1.clone();//强制转换为Person类
        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println("/////////////////////////////////");
        person2.age=87;
        System.out.println(person1.age);
        System.out.println(person2.age);
    }
}
*/
/*class Menoy implements Cloneable{
    double menoy=12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public int age;
    Menoy m=new Menoy();
    @Override//重写clone 方法。alt+insert
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo  {
    public static void main(String[] args) throws CloneNotSupportedException {//处理这个异常
        Person person1=new Person();
        Person person2=(Person)person1.clone();
        System.out.println(person1.m.menoy);
        System.out.println(person2.m.menoy);
        System.out.println("/////////////////////////////////");
        person2.m.menoy=87.5;
        System.out.println(person1.m.menoy);
        System.out.println(person2.m.menoy);
       //结果：
        //12.5
        //12.5
        ///////////////////////////////////
        //87.5
        //87.5
        //浅拷贝
        //说明当Money为引用类型时发生的是浅拷贝。
        如果要是深拷贝那么要在Clone person2的时候将m的引用 指向一个新的克隆出的money
    }
}*/
class Menoy implements Cloneable{
    double menoy=12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public int age;
    Menoy m=new Menoy();
    @Override
    protected Object clone() throws CloneNotSupportedException {
     //   return super.clone();
        //1.克隆person
        Person p=(Person)super.clone();
        //2.克隆money当前对象
        p.m=(Menoy) this.m.clone();
        return  p;
    }
}
public class TestDemo  {
    public static void main(String[] args) throws CloneNotSupportedException {//处理这个异常
        Person person1=new Person();
        Person person2=(Person)person1.clone();
        System.out.println(person1.m.menoy);
        System.out.println(person2.m.menoy);
        System.out.println("/////////////////////////////////");
        person2.m.menoy=87.5;
        System.out.println(person1.m.menoy);
        System.out.println(person2.m.menoy);
    }
    //结果：
    //12.5
    //12.5
    ///////////////////////////////////
    //12.5
    //87.5  深拷贝

}
