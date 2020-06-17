package code617;

import blog.Main;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/*class  A{
    public A(String S) {
    }
}*/
public class TestDemo {
  /*  private  float f=1.0f;
    int m=12;
    static  int n = 1;*/
/*
    public static void main(String[] args) {
       // TestDemo testDemo=new TestDemo();
       // testDemo.f=1.0;
       *//* String F=args[1];
        String f=args[2];
        String Fx=args[3];*//*
       A S=new A("SD");
        A S1=new A("SD");
        System.out.println(S==S1);
        System.out.println(addAB(2,3));


    }
    public  static int addAB(int A, int B) {
        // write code here
        return  Math.addExact(A,B);
    }*/

   public  static  int run(long n){

        int s=0;
        for (int i = 0; i <1000000 ; i++) {
            if (n%1000000007==0){
                break;
            }else {
                n=n%1000000007;
                n=(2*n+1);
                s++;
            }
        }
        if (s>3000000)  return -1;
        if (s%3==2){
            return s/3+1;
        } else   {
            return s/3;
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            long i = sc.nextInt();
            int run = run(i);
            System.out.println(run);
        }



    }
/*   public  static  int MinChance(int x){
       if(x % 1000000007 == 0){
           return 0;
       }
       int count = 0;
       while (x != 0 && count <= 300000) {
           x = ((x << 1) + 1) % 1000000007;
           count++;
       }
       int res = (count + 2) / 3;
       return res > 100000 ? -1 : res;
   }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int pop = in.nextInt();
            int nums = MinChance(pop);
            System.out.println(nums);
        }
    }*/

}
