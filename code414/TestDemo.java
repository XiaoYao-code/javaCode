package code414;

import java.util.Arrays;
import java.util.Scanner;

/*import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        Search(number);
    }
    public  static  int Search(int x){

    }
}*/
/*public  class TestDemo{
    public static void main(String[] args) {
       *//* Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();*//*
       // double c=sc.nextInt();
        int a=10;
        int b=20;
        int c=30;
        double a1=10.5;
        double b1=20.8;
        double c1=365.5;
        System.out.println(Max2(a,b));
        System.out.println(Max2(a1,b1));
        System.out.println(+Max3(a,b,c));
        System.out.println(Max3(a1,c1,c));
    }
    public static int Max2(int x,int y){
       return x>=y?x:y;
    }
    public static int Max3(int x,int y,int z){
        return  Max2(x,y)>=z?Max2(x,y):z;
    }
    public static double  Max2(double x,double y){
        return x>=y?x:y;
    }
    public static double Max3(double x,double y,int z){
        return  Max2(x,y)>=z?Max2(x,y):z;
    }
}*/
/*public class TestDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double a1=sc.nextDouble();
        double b1=sc.nextDouble();
        double c1=sc.nextDouble();
        int sum=summation(a,b);
        System.out.println(sum);
        double sum1=summation(a1,b1,c1);
        System.out.println(sum1);
    }
    public  static  int summation(int x,int y){
        return x+y;
    }
    public  static  double summation(double x,double y,double z){
        return x+y+z;
    }
}*/
/*
public class TestDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=summation(n);
        System.out.println(sum);
    }
    public static int summation(int x){//只能求出n大于0的n项之和
        if (x==1)
            return 1;
        if (x==0)
            return 0;
        return x+summation(x-1);
    }
}*/
/*public class TestDemo{
    public static void main(String[] args) {
        int []array={1,2,5,9,8,7,4,1,2,5,9,8,7};
        int num=searchNumber(array);
        System.out.println(num);
    }
    public  static  int  searchNumber(int []array) {
    int i=0;
    int sum=0;
    while (i<array.length){
        sum=sum^array[i];//结合律：a ^ b ^ c = a ^ （b ^ c） = （a ^ b） ^ c    另外a^a=0,0^n=n
        i++;
    }
    return sum;
    }*/
/*        int j=0;
        int i=0;
        for ( i=0;i<array.length;i++){
            int count=0;
            for (j=0;j<array.length;j++) {
                if ( i==j)
                    continue;
                if (array[i] == array[j]){
                count++;
                    break;
                }
            }
            if(count==0)
                return array[i];
        }
return 0;
    }*/
//}
//public class TestDemo {
    /*public static void main(String[] args) {
        int a=1;
        int b=1;
        a^=a;
       *//* b^=a;
        a^=b;*//*
        System.out.println(a);
        System.out.println(b);*/
//}
/*    public static void main(String[] args) {
        String s="hello";
        change(s);
        System.out.println(s);
        String a = "hello";
        String t = a;
        s = "world";
        System.out.println(a); // t是"hello"还是"world"?

    }
    public static void change(String s){
        s = "World!";
    }

}*/
/*public class TestDemo{
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9,10};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[]array){
       int left=0;
       int right=array.length-1;
       while (left<right){
           while (left<right&&array[left]%2==0) {
               left++;
           }
           while (left<right&&array[right]%2==1) {
               right--;
           }
           int tmp=array[left];
           array[left]=array[right];
           array[right]=tmp;
       }
    }
}*/
//实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型)
/*public class TestDemo{
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(summa(array));
    }
    public static int summa(int[]array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
}*/
/*
public class TestDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=su(x);
    }
    public static int jc(int x){

    }
}*/
//实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
/*
public class TestDemo{
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
    public static void transform(int[] array){
        for (int i=0;i<array.length;i++){
            array[i]*=2;
        }
    }
}*/
//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值
/*
public class TestDemo{
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9,10};
        printArray(array);
    }
    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
    }
}*/
//定义长度指定100的数组，并且赋初值1-100
public class TestDemo{
    public static void main(String[] args) {
  int []array=new  int[100];
  setNumber(array);
        System.out.print(Arrays.toString(array));
    }
    public static void setNumber(int []array){
        for (int i=0;i<array.length;i++){
            array[i]=i+1;
        }
    }
}
