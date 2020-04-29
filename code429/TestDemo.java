package code429;

import java.util.Arrays;

public class TestDemo {
/*
    */
/**
     * Created with IntelliJ IDEA.
     * Description:
     * User: GAOBO
     * Date: 2020-04-28
     * Time: 20:03
     *//*


    */
/**
     * 接口(interface)：
     * 1、接口当中的方法，都是抽象方法。
     * 2、其实可以有具体实现的方法。这个方法是被default修饰的（JDK1.8加入的）
     * 3、接口当中定义的成员变量，默认是常量。
     * 4、接口当中的成员变量默认是：public static final   成员方法是：public abstract
     * 5、接口是不可以被实例化的。        Shape shape = new Shape();
     * 6、接口和类之间的关系 : implements
     * 7、为了解决Java单继承的问题.可以实现多个接口。后面会讲。
     * 8、只要这个类 实现了该接口，那么你就可以进行向上转型了。
     *//*

    interface Shape {
        //int a = 10;
        void draw();
    */
/*default  void func() {
        System.out.println("fafalfj");
    }*//*

    }

    class Cycle implements Shape {
        @Override
        public void draw() {
            System.out.println("画一个○");
        }
    }
    class React implements Shape {
        @Override
        public void draw() {
            System.out.println("画一个♦");
        }
    }
    public class TestInterFace {
        public static void drawMap(Shape shape) {
            shape.draw();
        }
        public static void main(String[] args) {
            Shape shape1 = new Cycle();
            Shape shape2 = new React();
            drawMap(shape1);
            drawMap(shape2);
        }
    }
*/
/*

    */
/**
     * Created with IntelliJ IDEA.
     * Description:
     * 抽象类：
     * 1、抽象方法：一个方法如果被abstract修饰，那么这个方法就是抽象方法。抽象方法
     * 可以没有具体的实现。
     * 2、包含抽象方法的类，抽象类。
     * 注意：
     * 1、抽象类不可以被实例化。不能Shape shape = new Shape();
     * 2、类内的数据成员，和普通类没有区别。
     * 3、抽象类主要就是用来被继承的.
     * 4、如果一个类继承了这个抽象类，那么这个类必须重写抽象类当中的抽象方法。
     * 5、当抽象类A 继承 抽象类B 那么A可以不重写B中的方法，但是一旦A要是再被继承，
     * 那么一定还要重写这个抽象方法。
     * 6、抽象类或者抽象方法 一定是不能被final修饰的。
     * User: GAOBO
     * Date: 2020-04-28
     * Time: 19:43
     *//*

    abstract class Shape {
        */
/*public int age;
        private int a;
        public void func() {
        }*//*

        public  abstract void draw();
    }

    class Cycle extends Shape {
        @Override
        public void draw() {
            System.out.println("画一个○");
        }
    }

    class React extends Shape {
        @Override
        public void draw() {
            System.out.println("画一个♦");
        }
    }

    class Triangle extends Shape {
        @Override
        public void draw() {
            System.out.println("画一个△");
        }
    }

    class Flower extends Shape{
        @Override
        public void draw() {
            System.out.println("画一个❀");
        }
    }

    public class TestDemo {
        public static void drawMap(Shape shape) {
            shape.draw();
        }

        public static void main(String[] args) {
            Shape shape1 = new Cycle();
            Shape shape2 = new React();
            drawMap(shape1);
            drawMap(shape2);
        }
    }
*/
/*

    *//**
     * Created with IntelliJ IDEA.
     * Description:
     * User: GAOBO
     * Date: 2020-04-28
     * Time: 20:22
     *//*
    class Animal {
        protected String name;
        public Animal(String name) {
            this.name = name;
        }
    }
    interface IFlying {
        void fly();
    }
    interface IRunning {
        void run();
    }
    interface ISwimming {
        void swim();
    }
    //1、 一个类可以继承一个普通类/抽象类，并且可以同时实现多个接口
//extends      implements
    class Cat extends Animal implements IRunning {
        public Cat(String name) {
            super(name);
        }
        @Override
        public void run() {
            System.out.println(this.name + "正在用四条腿跑");
        }
    }
    class Fish extends Animal implements ISwimming {
        public Fish(String name) {
            super(name);
        }
        @Override
        public void swim() {
            System.out.println(this.name + "正在用尾巴游泳");
        }
    }

    class Frog extends Animal implements IRunning,ISwimming {

        public Frog(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(this.name+" 正在跑！");
        }

        @Override
        public void swim() {
            System.out.println(this.name+" 正在游！");

        }
    }

    class Robot implements IRunning{
        @Override
        public void run() {
            System.out.println("我是机器人 我在用腿跑！");
        }
    }

    public class TestMoreExtends {

        public static void walk(IRunning running) {
            System.out.println("我带着伙伴去散步");
            running.run();
        }

        public static void main(String[] args) {
            IRunning iRunning1 = new Robot();
            walk(iRunning1);
            IRunning iRunning2 = new Frog("青青");
            walk(iRunning2);
            ISwimming iSwimming = new Frog("青青");
            //walk(iSwimming);

        }
    }*/
/*    import java.util.Arrays;
    *//**
     * Created with IntelliJ IDEA.
     * Description:
     *    接口的使用实例：
     *    一般情况下：自定义类型进行比较 需要是 可比较的。
     *    Comparable   Comparator  有区别的！！！
     * User: GAOBO
     * Date: 2020-04-28
     * Time: 20:49
     *//*
    class Student implements Comparable <Student> {
        public String name;
        public int age;
        public int score;

        public Student(String name, int age, int score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", score=" + score +
                    '}';
        }


        @Override
        public int compareTo(@org.jetbrains.annotations.NotNull com.demo4.Student o) {
            return 0;
        }
    }
    public class TestDemo {

        public static void main(String[] args) {
            Student student1 = new Student("bit",18,79);
            Student student2 = new Student("gao",29,70);
            Student student3 = new Student("shasha",17,99);
        *//*if(student1.compareTo(student2) < 0) {
            System.out.println("student1的年龄 < student2");
        }*//*

            Student[] students = new Student[3];
            students[0] = student1;
            students[1] = student2;
            students[2] = student3;

            Arrays.sort(students);
            System.out.println(Arrays.toString(students));
        }

        public static void main1(String[] args) {
            int[] array = {12,4,89,43,56};
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            int a = 10;
            int b = 20;
            if(a > b) {

            }
        }
    }*/
}
