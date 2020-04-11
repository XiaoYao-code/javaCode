package code411;
/*import  java.util.Scanner;
public class test411 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int tmp=number;
    int length=0;
    while (tmp>0){
        tmp/=10;
        length++;
    }
    tmp=number;
    for (int i=0;i<length;i++) {
        System.out.print(tmp%10+"    ");
        tmp/=10;
    }
    }
}*/
import  java.util.Scanner;
import  java.util.Random;
public  class test411{
    public static void main(String[] args) {
        Random random=new Random();
        int toGuess=random.nextInt(100);
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入要猜得数字:");
            int num=sc.nextInt();
            if (num<toGuess)
                System.out.println("猜小了！请再试一次");
            else  if (num==toGuess){
                System.out.println("猜对了！！！恭喜你");
            break;
            }
            else
                System.out.println("猜大了！请再试一次");
        }
    }
}
