package code820;


class Test{
   public int a=0;
   public static  int b=1;

    public Test() {//无参的构造方法
    }

    public void print1(){
        System.out.println(a);
        System.out.println(b);
        print2();
    }

    public static void print2(){
       // System.out.println(a);
        System.out.println(b);
     //   print1();
    }

}

public class Main {
    static  {
        System.out.println("测试一下");
    }
/*     public static class inClass{
         public inClass() {
             System.out.println("我是一个静态内部类");
         }
         public void print(){
             System.out.println("我是静态内部类中的一个方法");
         }
     }*/
    public static void main(String[] args) {

     /*    inClass  inclass= new  Main.inClass();
         inclass.print();
         Main main=new Main();
*/



 /*       Test t = new Test();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(Test.b);*/
        /**
         * java基本数据类型
         * 1.byte-1字节
         * 2.short-2字节
         * 3.int-4字节
         * 4.long-8字节
         * 5.float-4字节
         * 6.double-8字节
         * 7.char-2字节
         * 8.Boolean-1字节
         */
       /* // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);
    }*/
    }
}
