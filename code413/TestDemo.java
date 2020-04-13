package code413;

/*import java.util.Scanner;//青蛙跳台阶问题。实质是每次跳台阶都有两个选择，相当二叉树？写出可能选择作为递归步进。
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=frog(n);
        System.out.println(s);
    }
    public  static int frog(int x){
        if(x>1)
            return frog(x-1)+frog(x-2);;
        return 1;
    }
}*/

public  class  TestDemo{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,8,9,8};
        char1(arr);
    }
    public  static void char1(int [] arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if (i<arr.length-1)
            System.out.print(arr[i]+",");
            if (i==arr.length-1)
                System.out.print(arr[i]);
        }
        System.out.print("]");
    }
}
