package code615;




import java.util.ArrayList;
import  java.*;
import java.util.Collections;
import java.util.Scanner;
import java.math.*;
public class OJ   {
  /*  public static void main(String[] args) {
        String a="abc"+"def";
        String b=new String(a);
        if (a.equals(b)){
            System.out.println("e.s");
        }
        if (a==b){
            System.out.println("=.s");
        }
    }*/
/*  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String []arr=sc.nextLine().split(" ");
      ArrayList<Integer> list=new ArrayList<>();
      for (int i = 0; i <arr.length ; i++) {
          //  list.add(Integer.parseInt(arr[i]));
          for (int j = 0; j <Integer.parseInt(arr[i]); j++) {
              list.add(i);
          }
      }
      Collections.sort(list);
      if (list.get(0)==0){
          for (int i = 1; i <list.size() ; i++) {
              if (list.get(i)!=0){
                  int tmp=list.get(i);
                  list.set(i,0);
                  list.set(0,tmp);
                  break;
              }
          }
      }
      for (int i = 0; i <list.size() ; i++) {
          System.out.print(list.get(i));
      }



  }*/
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuffer S=new StringBuffer();
        int i = sc.nextInt();
        for (int j = 0; j <100000 ; j++) {
            if (Math.pow(i,3)==i*(j-1)+Math.pow(i,2)){
                S.append(Integer.toString(j));
                for (int k = 1; k <i ; k++) {
                    S.append("+"+Integer.toString((j+2*k)));

                }
                break;
            }
        }
      System.out.print(S.toString());

    }
}
