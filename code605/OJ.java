package code605;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.Scanner;
/*
import java.util.Scanner;

public class OJ {
   */
/* public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException    e){
                        throw  new RuntimeException(e);
                }
                System.out.print("2");
            }
        });
        t.start();
        t.join();
        System.out.print("1");
      *//*
*/
/*  String s;
        System.out.println("s="+s);*//*
*/
/*
    }*//*





    static  int num=0;
   public static void main1(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for (int i = 0; i <n ; i++) {
           arr[i]=sc.nextInt();
       }
       dps(0,0,arr);
       System.out.println(num);

   }
   public static void dps(int index,int sum,int []arr){
       if (sum==40){
           num++;
           return;
       }else if(sum>40) {
           return;
       }
       if (index==arr.length)return;
       //取当前下标
       dps(index+1,sum+arr[index],arr);
       //不取当前下标
       dps(index+1,sum,arr);
   }




    public static void main(String[] args) {
        Test test=new Test();
        test.hello();
    }
}
class  Test{
    public  static void  hello(){
        System.out.println("hello");
    }
}*/
/*
class Animals{
  int a=0;

    */
/*public Animals(int a) {
        this.a = a;
    }*//*


    public void func(){
        System.out.println("dad");
    }
}
class Cat extends Animals{
    public Cat(int a) {

        //super(a);
        System.out.println("abcabc");
        this.a=a;
    }
}
*/

public class OJ{


    static  int num=0;
    public static void main(String[] args) {

        int[] arr=new int[5];
        for (int i = 0; i <4 ; i++) {
            arr[i]=0;
        }
        arr[4]=40;
        dfs(0,0,arr);
        System.out.println(num);

    }
    public static void dfs(int index,int sum,int []arr){
        if (sum==40){
            num++;
            return;
        }else if(sum>40) {
            return;
        }
        if (index==arr.length)return;
        //取当前下标
        dfs(index+1,sum+arr[index],arr);
        //不取当前下标
        dfs(index+1,sum,arr);
    }
}
