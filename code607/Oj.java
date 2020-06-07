package code607;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Scanner;

public class Oj {
   /* //a-b b-c a+b b+c
    public static void main(String[] args) {
        int []arr=new int[4];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
            arr[i]=scanner.nextInt();
        }
        if ((arr[0]+arr[2])%2==0&&arr[3]>=0&&arr[2]>=0) {
            System.out.print((arr[0] + arr[2]) / 2+" ");
            System.out.print(arr[2]-(arr[0] + arr[2]) / 2+" ");
            System.out.print(arr[3]-arr[2]+(arr[0] + arr[2]) / 2);

        }else {
            System.out.println("No");
        }
    }*/
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> list=new ArrayList();
       String[] str = sc.nextLine().split(" ");
       
       System.out.println(Arrays.toString(str));

       for(int i = 0; i < str.length; i++ ){
          list.add(Integer.parseInt(str[i]));
       }

       Collections.sort(list);
       System.out.println(list);
       System.out.println(list.get(list.size()/2-1));


   }
}
