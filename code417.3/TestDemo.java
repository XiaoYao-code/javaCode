package code417;

import java.util.Arrays;

class  Student{
    //字段——》   成员变量  定义在方法外面 类的里边。
    public int xuehao=26;//public  访问修饰限定符号    private  私有的  protected  受保护的  什么都不写  默认权限
    public  String name="yao";//不是所有的成员变量都在对象里边，只有实例成员变量在对象里边  如果加static静态修饰符，那么在方法区里
    public  double jidian;
   /* public   boolean  sex;
    public    char   s;*/
    //静态成员变量
    public static int size;//如果不初始化对应的值仍然为0
    //size不属于对象，他不在栈中也不堆中  纯在方法区中，只有一份。不同于前面两个在实例对象时，有多份拷贝在堆中
    //方法——》
    public void  tiyu(){     //实例成员方法（没有static）
        System.out.println("paobu");
    }
     public void shangke(){  //实例成员方法
        int a=10;
        shetuan();// 非静态成员方法可以调用静态成员方法，和其他的非静态成员方法
        System.out.println("shuxue");
    }
     public  static  void shetuan(){//静态方法
         System.out.println("shetuan");
         //shangke();//报错，不可以调用   非静态成员方法
     }
}
public class TestDemo {
    public static void main(String[] args) {

        Student  stu1=new Student();//关键字  new   实例化一个对象
        //如何访问一个对象中的实例成员变量
        System.out.println(stu1.name);
        stu1.name="xinyuan";//更实例stu1中的改成员变量
        System.out.println(stu1.name);//.操作符   使用方法  ：  对象的引用.成员变量
        //打印出的为null
        System.out.println(stu1.xuehao);
        //打印出的为0
/*        System.out.println(stu1.sex);  //打印的为false
        System.out.println(stu1.s);*/    //打印的为空

        //根据上面两个可以得出一个结论，实例成员变量如果没有初始话的情况下，引用类型默认为null，简单类型默认为0或0.0
        //char类型的默认为\u0000”（空字符）        boolean类型的默认为false
        Student  stu2=new Student();//new的对象都在堆上储存
        Student  stu3=new Student();//这四个对象都在栈上储存
        Student  stu4=new Student();//定义四个 表示了  一个类可以产生多个对象

        System.out.println(stu1.size);//仍然可以打印，打印为0，但是会报警告。
        System.out.println(Student.size);//不报警告，并且不需要new对象就可以访问。
        //如何访问静态成员变量，应该是类名.成员变量     不推荐使用实例对象的引用.成员变量


        stu1.shangke();//实例成员方法的调用  对象的引用.实例成员方法
        stu1.tiyu();
        Student.shetuan();//static静态成员方法  类.静态成员方法  和静态成员变量使用同理





        //规则的二维数组
       /* int[][] array = {{1, 2, 3}, {4, 5, 6}};
        int[][] array1 = new int[2][];//java语言中要指定行，但是列不能自动推导出来
        array1[0]=new int[3];//如何定义一个不规则数组
        array1[1]=new int[4];
        int[][] array2 = new int[][]{{1, 2, 3}, {4, 5, 6}};
      *//*  for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }*//*
        for (int i = 0; i <array1.length ; i++) {
           for (int j = 0; j <array1[i].length ; j++) {
                System.out.print(array1[i][j]+"  ");
            }
            System.out.println();
        }*/
      /*  for (int[]t:array) {
            for (int x:t) {
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));*/

    }
}