package code422;

import java.util.Arrays;
//定义一个方法交换两个等长数组的值
/*public class TestDemo {
    public static void func(int[]arr1,int[]arr2){
        for (int i = 0; i <arr1.length ; i++) {
            int tmp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=tmp;
        }
    }
    public static void main(String[] args) {
        int []arr1={1,2,3,4};
        int []arr2={5,6,7,8};
        System.out.println("arr1"+Arrays.toString(arr1));
        System.out.println("arr2"+Arrays.toString(arr2));
        func(arr1,arr2);
        System.out.println("arr1"+Arrays.toString(arr1));
        System.out.println("arr2"+Arrays.toString(arr2));
    }

}*/
//实现一个计算器功能
/*class Calculator{
    private int a;
    private int b;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int add(){
        return this.a+this.b;
    }
    public int sub(){
        return this.a-this.b;
    }public int mul(){
        return this.a*this.b;
    }public double div(){
        return this.a*1.0/this.b;
    }
}
public class TestDemo{
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.setA(10);
        calculator.setB(20);
        System.out.println("加法");
        System.out.println(calculator.add());
        System.out.println("减法");
        System.out.println(calculator.sub());
        System.out.println("乘法");
        System.out.println(calculator.mul());
        System.out.println("除法");
        System.out.println(calculator.div());
    }
}*/
//实现交换两个变量的值，要求需要交换实参的值
class MyValue{
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class TestDemo{
    public static void swap(MyValue value1,MyValue value2){
        int tmp=value1.getMyValue();
        value1.setMyValue(value2.getMyValue());
        value2.setMyValue(tmp);
    }
    public static void main(String[] args) {
           MyValue value1=new MyValue();
           value1.setMyValue(10);
           MyValue value2=new MyValue();
           value2.setMyValue(20);
        System.out.println(value1.getMyValue());
        System.out.println(value2.getMyValue());

        swap(value1,value2);
        System.out.println(value1.getMyValue());
        System.out.println(value2.getMyValue());

    }
}
