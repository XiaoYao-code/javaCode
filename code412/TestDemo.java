package code412;
/*import java.util.Scanner;
public class TestDemo {
    public  static  int maxNum(int x,int y,int z){
        if (x>y) {
            if (x>z)
                return x;
            else
                return z;
        }else if (y>z)
            return y;
        else
            return z;

    }
    public static void main(String[] args) {
        Scanner int = new Scanner(System.in);
        int x = int.nextInt();
        int y = int.nextInt();
        int z = int.nextInt();
        System.out.println(maxNum(x, y, z));
    }
}


public class TestDemo{*/

import java.util.Scanner;

/* public  static  int sum(int a,int b,int c){
        return a+b+c;
    }
     public  static  double sum(double a,double b,double c,double d){
    return a+b+c+d;
}
    public  static  double sum(int x,int y){
        return x+y;
    }*//*

   public  static  int sum(int x){
       if (x<10)
            return x;
       return x%10+sum(x/10);
   }
}*/
//求n的阶乘；
/*public class TestDemo {
    public static int sub(int x) {
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        return x * sub(x - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(sub(x));
    }
}*/
//求n的累加：
/*public  class  TestDemo{
    public  static  int sum(int x){
        if (x==0)
         return  0;
        if (x==1)
         return  1;
     return x+sum(x-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(sum(x));
    }
}*/
//打印一个数字的每一位
import java.util.Scanner;
/*public  class TestDemo{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    print(x);
    }
    public static void print(int x){
        if (x>9) {
            print(x / 10);//如果把条件改成if（x<10）那么就会造成死循环，0永远小于9永远递归。
        }
        System.out.println(x%10);
    }
}*/
//输入一个非负整数，返回它的每一位位数之和：
/*public class TestDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(sum(x));
    }
    public  static  int sum(int x){
        if (x<10)
            return x;
        return x%10+sum(x/10);
    }
}*/
//斐波那契数列第n项问题：
public class TestDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long number=Febonacci(n);
        System.out.println(number);
    }
  /*  public static  int Febonacci(int x){
        if (x==1||x==2){
            return 1;
        }
        return  Febonacci(x-1)+Febonacci(x-2);
   }*/
  public  static long  Febonacci(int x) {
      if (x == 1 || x == 2) {
          return 1;
      }
      long  f1=1;
      long  f2=1;
      long  f3=0;
      for (int i = 0; i < x-2; i++) {
          f3=f1+f2;
          f1=f2;
          f2=f3;
      }
      return f3;
  }
}