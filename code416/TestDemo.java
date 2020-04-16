package code416;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-16
 * Time: 18:32
 */
public class TestDemo1 {


    public static void main(String[] args) {
        int[] array = {1,2,4,1,4};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }
    /**
     * 不规则的二维数组
     * @param args
     */
    public static void main3(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[]{1,2,3};
        array[1] = new int[]{4,5};
        //注意：C语言  是可以指定列  行可以自动推导
        // Java  行必须指定    列  不可以自动推导的
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }

    /**
     * 二维数组的打印方式
     * @param args
     */
    public static void main2(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        for ( int[] tmp : array ) {
            for (int x : tmp) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/
       /* for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/
        /*System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));*/



    }

    /**
     * 二维数组的定义方式
     * @param args
     */
    public static void main1(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array3 = new int[2][3];
    }
}
class Person {
    //字段->成员变量   定义在方法外边  类 的 里面
    // 实例成员变量：对象里面
    //实例成员没有初始化 默认值为对应的0值。引用类型默认为null   简单类型默认为0
    //char ->'\u0000'    boolean -> false
    public String name = "gaobo";
    public int age = 18;
    /*public char ch;
    public boolean flg;*/
    //静态成员变量 不属于对象  属于类   和 实例成员变量  0
    public static int size;//只有一份
    //方法->行为   实例成员方法
    public void eat() {
        int a = 10;//局部变量
        System.out.println("eat()!");
    }

    public void sleep() {
        int b = 10;
        System.out.println("sleep()");
    }

    public static void func1() {
        System.out.println("static::func1()");
        //age = 99; error   静态方法内部  不能够访问非静态的数据成员
        size = 9999;
    }

    public void show() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }

}
class Test{
    public int a;
    public static int count;
}
public class TestDemo2 {

    public static void func() {

    }
    public void func2() {

    }
    public static void main(String[] args) {
        func();
        /*TestDemo2 testDemo2 = new TestDemo2();
        testDemo2.func2();*/
    }

    public static void main5(String[] args) {
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

    public static void main4(String[] args) {
        Person per = new Person();
        per.show();
        per.name = "李四";
        per.age = 20;
        per.show()
        /*per.eat();
        per.sleep()*/;
        //Person.func1();
    }

    public static void main3(String[] args) {
        //如何访问静态的数据成员    类名.静态成员变量
       /* Person per = new Person();
        System.out.println(per.name);*/
        System.out.println(Person.size);
    }

    public static void main2(String[] args) {
        Person per = new Person();
        //如何访问对象当中的实例成员变量？
        //操作符：点号    对象的引用 . 成员变量
        System.out.println(per.name);
        per.name = "bit";
        System.out.println(per.name);
        System.out.println(per.age);
    }
    public static void main1(String[] args) {
        //实例化一个对象 通过关键字 new
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
    }
}
/**
 * Created with IntelliJ IDEA.
 * Description:
 *  封装：用private来修饰属性 或者 方法
 *  为什么要封装：
 *   没有特殊的要求，那么属性都设置为私有的
 *  this:  当前对象的   引用
 *  要习惯使用this
 * User: GAOBO
 * Date: 2020-04-16
 * Time: 20:56
 */
class Student {
    //限定你只能在类当中进行访问
    private String name;
    private int age;
    //alt+insert(f12)  自定义
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*//提供一个公开的接口
    public String getMyName() {
        return this.MyName;
    }

    public void setMyName(String MyName) {
        this.MyName = MyName;//其实就是 自己给自己赋值  并没有赋值属性  局部变量优先
    }*/

    private void func1() {
        System.out.println("func1()");
    }
    public void show() {
        System.out.println("我叫" + this.name + ", 今年" + this.age + "岁");
    }

    //重新 实现了一下 Object类的 toString()方法
    //Object  是 所有类的父类  alt + insert  ->toString()
    @Override//注解：这个注解指的是  这个方法是重新写的
    public String toString() {
        return "Student{" +
                "我叫：" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//以上是类的实现着写的代码

//以下是类的调用者
public class TestDemo3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("gaobo");
        String str = student.getName();
        System.out.println(str);
        //student.show();
        System.out.println(student);

        /*String str2 = student.toString();
        System.out.println(str2);*/
    }
}
