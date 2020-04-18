package code418;
 class Person{
    private int age;
    private String name;
    public Person(){
        //类Person的构造方法，当没有构造方法时，编译器自动提供一个构造方法，
        // 当自定义一个构造方法时编译器不会自动生成一个构造方法
        //函数名和类名必须相同
        this("caocao",18);//调用当前对象的构造方法 ps：只能在构造方法里面写
      //  this("zhangfei",18)       报错 因为只能调用一次（而且只能写在第一行）
        System.out.println("person<String,name>");
    }
    public Person(String name,int age){//构造方法不止一个，重载的概念1.方法名字必须相同 2.参数类型不同3.返回值不做要求//在同一个类中
        this.name=name;
        this.age=age;
        System.out.println(name);
        System.out.println(age);
    }
    public void eat(){
        System.out.println(this.getName());  //调用当前对象的方法
        System.out.println(this.age);//调用当前对象的属性
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
     {                                         //初始化顺寻，静态代码块先初始化并且只初始化一次，下来时实例代码块，接着构造方法
                                                //如果都是静态的那么和定义的前后顺序有关。实例代码块同理。
         this.name="zhangfei";
         System.out.println("实例代码块");
     }
     static {
         System.out.println("静态代码块");//静态方法和静态成员不依赖对象，可以通过类名来访问，如果静态方法中有实例成员
                                          //那么实例成员依赖对象，静态方法不依赖对象。会产生矛盾

     }
}

public class TestDemo2 {
    public static void main(String[] args) {
        Person  person1=new Person();//调用和构造方法，实例化一个对象必须new
        Person  person2=new Person("张三",18);
        System.out.println(person1);
        System.out.println(person2);

    }
}
//this的用法
//this（）调用自己的构造方法；
//this.data调用当前对象的属性；
//this.func（）调用当前对象的方法；