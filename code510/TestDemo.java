package code510;


import java.util.*;
class MyException extends RuntimeException{//自定义一个非受查异常  Exception  受查异常
    public MyException() {  //带参的构造方法和不带参的构造方法
        super();
    }

    public MyException(String message) {
        super(message);
    }
}

class Person implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo {
    public static void main(String[] args) {
        int s=0;
        if(s==0){
            throw new MyException("自定义异常");
        }
    }
    public static void main5(String[] args)  {//解决办法1：声明这个异常throws CloneNotSupportedException
        Person person1=new Person();
        try {
            Person person2= (Person)  person1.clone();//clone()  会有红线这种直接报错的，这称为受查异常
        } catch (CloneNotSupportedException e) {  //解决办法2:try  catch 包裹起来
            e.printStackTrace();
        }
    }



///////////////////////以下都是非受查异常
    public static int divide(int x,int y)throws ArithmeticException {//提醒方法调用者，这个方法可能会抛出一个什么类型的异常
        if (y==0){
            throw new ArithmeticException();//手动抛出一个你想抛出的异常(可以自定义一个异常)
        }
        return x/y;
    }
    public static void main4(String[] args) {
        try {
            int s=divide(20,10);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("处理该异常");//可以处理该异常让程序正常执行
        }

    }

    public static void main3(String[] args) {
        try {
            func();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }
    public static void func() {
        int[] arr = {1, 2, 3};//如果这里没有处理异常呢么谁来调用这个方法谁处理异常，沿着栈向上传递，首先调用main方法，调用方法，如果main函数不处理，那么会交给jv没处理。
        System.out.println(arr[100]);
    }

    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int s=sc.nextInt();
            System.out.println(s/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("捕获到算数异常");
        }
        finally {
            sc.close();//释放Scanner
        }
    }

    public static void main1(String[] args) {
        int[] arr = {1, 2, 3};

        // System.out.println(arr[4]);//如果不处理这个异常，那么jvm自己处理这个异常，这样的结果是程序立即停止。
        try {//程序抛出异常的时候，由catch块自己处理异常，程序会继续向下执行。
            System.out.println(arr[4]);
            System.out.println(6666);//如果上一条语句捕获到了异常，那么这条程序不会执行。

        } catch (ArrayIndexOutOfBoundsException  |  StackOverflowError e) {   //可以同时捕获两个异常 或  （栈溢出异常）
            e.printStackTrace();//打印栈的追踪信息，而且打印的顺序是不定向的
            System.out.println("捕获到数组越界异常");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到空指针异常");
            System.out.println("执行完了");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("捕获所有异常");//当作为一个父类时，写在最前面的时候，剩下的捕获异常都会报错
        }finally {
            System.out.println("haha");//finally代码无论如何都会被执行，所以经常做一些善后工作，比如说关闭资源。不介意finally中出现return语句
        }
    }

}

