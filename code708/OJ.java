package code708;

import java.util.Scanner;
import java.util.jar.JarEntry;

public class OJ {

  /*  public static int countWays(int n) {
        // write code here


        int[]a=new int[10001];
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;
        for(int i=3;i<n;i++)
            a[i] = ((a[i-1]+a[i-2])% 1000000007+a[i-3]) % 1000000007;
        return a[n-1];

    }*/
    public static void main(String[] args) {
       // System.out.println(countWays(200));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int jwin=0;
        int ywin=0;
        int jc=0,jj=0,jb=0;
        int yc=0,yj=0,yb=0;
        int sum=n;
        while (n>0) {
            String ja = sc.next();

            String yi = sc.next();

            if (ja.equals("C") && yi.equals("J")) {
                jwin++;
                jc++;
            } else if (ja.equals("J") && yi.equals("B")) {
                jwin++;
                jj++;
            } else if (ja.equals("B") && yi.equals("C")) {
                jwin++;
                jb++;
            }
            //乙赢
            if (yi.equals("C") && ja.equals("J")) {
                ywin++;
                yc++;
            } else if (yi.equals("J") && ja.equals("B")) {
                ywin++;
                yj++;
            } else if (yi.equals("B") && ja.equals("C")) {
                ywin++;
                yb++;
            }
            n--;
        }
        System.out.println(jwin+" "+(sum-jwin-ywin)+" "+ywin);
        System.out.println(ywin+" "+(sum-jwin-ywin)+" "+jwin);
        if (jc>jb&&jc>jj){
            System.out.print("C");
        }
        if (jj>jb&&jj>jc){
            System.out.print("J");
        }if (jb>jc&&jb>jj){
            System.out.print("B");
        }
        if (jj==jb&&jj>jc){
            System.out.print("B");
        }
        if (jc==jb&&jc>jj){
            System.out.print("B");
        }
        if (jj==jc&&jc>jb){
            System.out.print("C");
        }
        if (jj==jc&&jc==jb){
            System.out.print("B");
        }
        System.out.print(" ");
        if (yc>jb&&yc>yj){
            System.out.print("C");
        }
        if (yj>yb&&yj>yc){
            System.out.print("J");
        }if (yb>yc&&yb>yj){
            System.out.print("B");
        }
        if (yj==yb&&yj>yc){
            System.out.print("B");
        }
        if (yc==yb&&yc>yj){
            System.out.print("B");
        }
        if (yj==yc&&yc>yb){
            System.out.print("C");
        }
        if (yj==yc&&yc==yb){
            System.out.print("B");
        }
    }
}
