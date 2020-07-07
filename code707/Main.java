package code707;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int countNumberOf2s(int n){
        // write code here
/*        int num=0;//时间过长
        int s=0;
        for (int i = 0; i <=n ; i++) {
            int i1=i;
            while (i1>0){
                if (s==2){
                    num++;
                }
                s=i1%10;
                i1/=10;
            }
        }
        return num;*/
/*       int count=0;  //时间复杂度高
        for (int i = 2; i <=n ; i++) {
            String s=Integer.toString(i);
            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(j)=='2'){
                    count++;
                }
            }
        }
        return count;*/
        int div=1;
        int count=0;
        while(n/div != 0)
        {
            //div=1代表最低位，div=10代表次低位...
            int num=n/div;
            int cur=num%10;
            int high=num/10;
            int low=n%div;
            if(cur<2)
            {
                count+=high*div;
            }
            else if(cur==2)
            {
                count+=high*div+(low+1);
            }
            else
            {
                count+=(high+1)*div;
            }
            if(n/div<20)
                break;
            div=10*div;
        }
        return count;

    }
    public static void change(int[]p,int[]a){
      int sump=p[0]*17*29+p[1]*29+p[2];
      int suma=a[0]*17*29+a[1]*29+a[2];
      if (suma>=sump) {
          int sum = suma - sump;
          int k =sum%29;
          int s =(sum/29)%17;
          int g = sum / (17 * 29);
          System.out.println(g + "." + s + "." + k);
      }else {
          int sum = Math.abs(suma - sump);
          int k =sum%29;
          int s =(sum/29)%17;
          int g = sum / (17 * 29);
          System.out.println("-"+g + "."+  s + "." + k);
      }
    }
   public static int[] chan(String s){
        int[]arr=new int[3];
       String[] split = s.split("[.]");
       for (int i = 0; i <split.length ; i++) {
           arr[i]=Integer.parseInt(split[i]);
       }
       return arr;
   }
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      String p=scanner.next();
      String s=scanner.next();
      change(chan(p), chan(s));


    }


}
