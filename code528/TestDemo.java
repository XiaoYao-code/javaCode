package code528;
class Out{
    int data1=1;
    int data2=2;
    class In{
        int data1=11;
        int data2=22;
        int data3=3;
        public void func(){//内部类
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(Out.this.data1);//访问外部类属性的方式   Out.this.属性

        }

    }

 }
class Out1{
    int data1=1;
     static int data2=2;//可以访问外部类静态成员属性

    /**
     * 静态内部类不能访问外部类非静态成员属性或者成员方法
     */
    static class In1{
        public Out1 out1;
        public int data1=11;
        public int data2=22;
        public int data3=3;

        public In1(Out1 out){
            this.out1=out;
        }
        //如果一定要访问外部类非静态对象那么可以为内部类提供一个构造方法，传入外部类对象

        public  void func(){//内部类
            System.out.println(this.out1.data1);
            System.out.println(Out1.data2);
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
           /* System.out.println(Out.this.data1);*///不能使用this访问外部类，因为静态的不依赖与对象先被加载

        }

    }

}

public class TestDemo {
    public static void main(String[] args) {
        Out1 ou1 = new Out1(); //new一个对象，通过对象传入静态内部类，来访问外部类的属性
        Out1.In1 in2=new Out1.In1(ou1);//创建一个内部静态对象，因为静态的不依赖于对象。所以直接用外部类名来访问。
        in2.func();//结果是  1  2    11  22  3
    }
    public static void main1(String[] args) {
        Out ou1 = new Out();//使用内部类的方法，1.先创建一个外部类的对象。
        Out.In in1=ou1.new In();//2.引用类型是外部类名.内部类名 对象名=外部类对象.new内部类。
        in1.func();//结果是11 22 3,当内部类和外部类有相同得属性时，访问得是内部类的属性。
    }

}
