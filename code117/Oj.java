package code603;



import java.util.HashSet;

import java.util.Scanner;

public class Oj {
    /*       public static void main(String[] args){
               Scanner cin = new Scanner(System.in);
               HashSet<String> hashSet = new HashSet<String>();
               while(cin.hasNext()){
                   hashSet.add(cin.next());
               }
               int Number = hashSet.size();
               System.out.println(Number);
           }*/
   /* public static int  Fob(int n){
        if (n==0)return 0;
        if (n==1)return 1;
        if (n>=2)return Fob(n-1)+Fob(n-2);
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        for (; i <50 ; i++) {
            if (n<=Fob(i)){
                break;
            }
        }
        int x=Fob(i);
        int y=Fob(i-1);
        System.out.println(Math.min(Math.abs(x - n), Math.abs(y - n)));

    }*/
    public static void main(String[] args) {
        int x=countWays(2,2);
        System.out.println(x);
    }


    public  static  int countWays(int x, int y) {
       if (x==1||y==1){
           return 1;
       }else {
           return countWays(x-1,y)+countWays(x,y-1);
       }
        }



}