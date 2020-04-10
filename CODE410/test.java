package code410;

/*import java.sql.SQLOutput;
import java.util.Scanner;

public class test{
    public static void main(String[] args) {

        System.out.println("请输入年龄：");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age <= 18)
            System.out.println("少年");
        else if (age <= 28)
            System.out.println("青年");
        else if (age <= 55)
            System.out.println("中年");
        else System.out.println("老年");
   }
}*/

/*import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + "不是素数");
                break;
            }
        }
        if (i == num)
            System.out.println(num + "是素数");
    }
}*/
/*public class test{
    public static void main(String[] args) {
        System.out.println( 10>20 && 10/0==0);
        System.out.println( 10<20 || 10/0==0);

    }
}*/
/*
public class test {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        for (num = 2; num <= 100; num++) {
            int i = 2;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                System.out.println(num);
                count++;
            }
        }
        System.out.println(count);
    }
}
*/
/*
public class  test{
    public static void main(String[] args) {
        int year=1000;
        int count= 0;
        for (year=1000;year<2001;year+=4){
            if (year%4==0&&year%100!=0||year%400==0) {
                count++;
                System.out.print(year+"  ");
            }
        }
        System.out.println("闰年个数"+count);

    }
}
*/
/*public  class test{
    public static void main(String[] args) {
        int x=1;
        for(x=1;x<10;x++){
            int y=1;
            for (y=1;y<=x;y++){
                System.out.print(x+"*"+y+"="+x*y+" ");
            }
            System.out.println();
        }
    }
}*/
/*public class test {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        boolean factor = true;
        while (factor) {
            int c = a % b;
            if (c>0) {
                a = b;
                b = c;
                factor = true;
            } else {
                System.out.println(b);
                factor = false;
            }
        }
    }
}*/
/*public class test{
    public static void main(String[] args) {
        int i=1;
        int j=1;
        double ret=0;
        for (j=1;j<101;j++) {
            ret=ret+1.0/(i*j);
            i=-i;
        }
        System.out.println(ret);
    }
}*/
/*
public  class  test{
    public static void main(String[] args) {
        int i=1;
        int sum= 0;
        for (i=1;i<101;i++){
            if(i%10==9)
                sum++;
            if (i/10==9)
                sum++;
        }
        System.out.println(sum);
    }
}
*/
/*public  class test{
    public static void main(String[] args) {
        int i=100;
        for (i=100;i<1000;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/100;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}*/
/*import java.util.Scanner;
public class  test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        int i=0;
        for (i=0;i<3;i++) {
            int pass1 =sc.nextInt();
            if (pass1==pass){
                System.out.println("密码正确");
                break;
            } else
                System.out.println("密码错误，请重新输入");
        }
        if(i==3)
            System.out.println("已经尝试三次，自动退出");
    }
}*/
/*public class test {
    public static void main(String[] args) {
        int a = 15;
        int i = 0;
        int sum = 0;
        for (i = 0; i < 32; i++) {
            if ((a >> i & 1) == 1) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}*/
/*import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int odd=0;
        int even=0;
        for (even=30;even>=0;even-=2){
            System.out.print((number >>even)&1 );
        }
        System.out.println();
        for (odd=31;odd>=0;odd-=2){
            System.out.print((number >>odd)&1 );
        }
    }
}*/
import java.util.Scanner;
import java.math.*;
public  class  test{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();

    }
}




