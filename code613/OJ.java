package code613;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class OJ {
   /* public  static  void   add(byte a){
          a=a++;
    }
    public  static    void test()
    {
        byte a=127;
        byte b=127;
        add(++a);
        System.out.println(a);
        add(b);
        System.out.println(b);

    }

    public static void main(String[] args) {
test();
    }*/
   public  int s=5;
  // s=s+5;    需要标识符
   // public  int func();//两个方法冲突 有相同得擦除，并且 没有函数体  或者关键字abstract
    //public  abstract void  func(int a);//抽象方法不能实现
   public  void  func(){

   }
    public   static  int[] exchangeAB(int[] AB) {
        // write code here
        AB[0]=AB[0]^AB[1];
        AB[1]=AB[0]^AB[1];
        AB[0]=AB[0]^AB[1];
        return  AB;
    }
    public String[] GrayCode(int n) {//格雷码

        // produce 2^n grade codes
        String[] graycode = new String[(int) Math.pow(2, n)];

        if (n == 1) {
            graycode[0] = "0";
            graycode[1] = "1";
            return graycode;
        }

        String[] last = GrayCode(n - 1);

        for (int i = 0; i < last.length; i++) {
            graycode[i] = "0" + last[i];//
            graycode[graycode.length - 1 - i] = "1" + last[i];
        }

        return graycode;
    }


    public static void main(String[] args) {
        int []A= new int[]{1,2};
        int []B = exchangeAB(A);
        System.out.println(Arrays.toString(B));
    }
}
