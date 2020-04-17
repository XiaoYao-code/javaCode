package code417;
/*class  Person1{
    public String  name="张三"; //这样的代码导致类的使用者(main方法的代码)必须要了解 Person 类内部的实现, 才能够使用这个类.
    public int age=18;          // 学习成本较高一旦类的实现者修改了代码(例如把 name 改成 myName),
                                //那么类的使用者就需要大规模的修改自己的代码, 维护成本高。
}
public class TestDemo2{
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println("我叫"+person.name+"今年"+person.age+"岁.");
    }
}*/

////////////////////////////////////////////////////////////////////

/*class  Person{
    private String name="张三";//此时字段已经使用 private 来修饰. 类的调用者(main方法中)不能直接使用.
                              // 而需要借助 show 方法. 此时类的使用者就不必了解 Person 类的实现细节.
                              //  同时如果类的实现者修改了字段的名字, 类的调用者不需要做出任何修改
                              //  (类的调用者根本访问不到name, age这样的字段.直接使用public的show方法。
    private  int age=18;
    public void  show(){
        System.out.println("我叫"+name+"今年"+age+"岁.");
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Person person=new Person();
       person.show();
    }
}*/
//那么问题来了~~ 类的实现者万一修改了 public 方法 show 的名字, 岂不是类的调用者仍然需要大量修改代码嘛?
//这件事情确实如此, 但是一般很少会发生. 一般类的设计都要求类提供的 public 方法能比较稳定, 不应该频繁发
//生大的改变. 尤其是对于一些基础库中的类, 更是如此. 每次接口的变动都要仔细考虑兼容性问题.

//////////////////////////////////////////////////////////////////////

class  Person{
    private String name="张三";
    private  int age=18;

/*    public void setName(String name) {    //ALT+insert可以快速实现。  CTRL可以全选。
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }*/
                                                  //没有特殊的要求，一律使用封装private
public  void setName(String  name){
           // name=name;//自己接受自己没有意义，不能实现更改功能
          this.name=name;//this.代表当前对象的引用
        }
        public  String getName(){
            return name;
}
    public void  show(){
        System.out.println("我叫"+name+"今年"+age+"岁.");
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Person person=new Person();
        //person.name="李四";//不能访问私有类型的name和age；
        //person.age=15;
        person.setName("李四");
        String name=person.getName();
        System.out.println(name);
        person.show();
    }
}