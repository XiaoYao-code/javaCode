package code508;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {

  /*      public int maximalSquare(char[][] matrix) {
            int x = 0;
            int y = 0;
            for (x=0;x<matrix.length;x++) {
                for (y = 0; y <=x; y++) {
                    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                        return x*x;
                    }

                    if (matrix[x + 1][y] == 0 || matrix[x][y + 1] == 0 || matrix[x + 1][y + 1] == 0) {
                        return x*x;
                    }//从x,y等于o开始遍历
                }
            }

            return 0;
        }*/
/*  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      //不能用next 遇到空格结束了
      String ret = func(str);
      System.out.println(ret);
  }
  public  static   String func(String str) {
    String []s=str.split(" ");
    String s2="";
      for (String S: s) {
          s2+=S;
      }
    return  s2;
    }*/
  public static String reverse(String str,int begin,int end) {
       char[]s=str.toCharArray();
       while (begin<=end){
           char tmp=s[begin];
           s[begin]=s[end];
           s[end]=tmp;
           begin++;
           end--;
       }
       return new String(s);
  }
    public static String func(String str,int n){
      str=reverse(str,0,n-1);
      str=reverse(str,n,str.length()-1);
      return reverse(str,0,str.length()-1);
    }
    public static void main(String[] args) {
   /*     String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
        String r=func(str,3);
        System.out.println(r);*/
        Scanner sc=new Scanner(System.in);
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(sc.next());
        System.out.println(stringBuilder);

    }

}