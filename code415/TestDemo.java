package code415;

import javax.naming.directory.SearchControls;
import java.util.Arrays;

/*public class TestDemo {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int max = Max(array1);
        System.out.println(max);

System.out.println(Arrays.toString(copyArr(array1)));

    }


    public static int[] copyArr(int[]array1){
            int []array2=new int[array1.length];
            for (int i=0;i<array1.length;i++){
                array2[i]=array1[i];
            }
            return array2;*/

/*    public static int Max(int[] array1) {
        int a = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (a < array1[i]) {
                a = array1[i];
            }
        }
        return a;
    }
}*/
/*public class TestDemo{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int ret=Search(arr,8);
        System.out.println(ret);
    }
    public static  int Search(int []arr,int x){
        int left=0;
        int right=arr.length;
        int mid=0;
        while (left<=right) {
            mid=(left+right)/2;
            if (arr[mid]<x){
                left=mid+1;
            }
            else if(arr[mid]>x){
                right=mid-1;
            }
            else return mid;
        }
        return  -1;
    }
}*/
    /*public static boolean Search(int []arr){
        int num=arr[0];
        for (int i=1;i<arr.length;i++ ){
            if (num<arr[i]){
                num=arr[i];
            }
            else {
                return false;
            }
        }
            return true;
    }*/
/*public class TestDemo{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean f=true;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    f=false;
                }
            }
            if(f)//可以不同判断f==true，因为f本来就是boolean类型。
                break;
        }
    }
}*/
/*
public class TestDemo{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10,0};
        isUp(arr);
        System.out.println(isUp(arr));
    }
    public static boolean isUp(int[]arr){
        int num=arr[0];
        boolean flag=true;
        for (int i = 1; i < arr.length; i++) {
            if (num<arr[i]){
                num=arr[i];
            }
            else {
                flag=false;
                break;
            }
        }
        return  flag;
    }
}*/
//二分查找
//public class TestDemo {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        int i = binarySearch(array, 7);
//        System.out.println("下标是" + i);
//    }
//
//    public static int binarySearch(int[] array, int x) {
//        int mid = 0;
//        int left = 0;
//        int right = array.length - 1;
//        while (left <= right) {
//            mid = (left + right) / 2;
//            if (array[mid] > x) {
//                right = mid - 1;
//            } else if (array[mid] < x) {
//                left = mid + 1;
//            } else return mid;
//        }
//        return -1;
//    }
//}

 /*public static  int Search(int []arr,int x){
     int left=0;
     int right=arr.length;
     int mid=0;
     while (left<right) {
         mid=(left+right)/2;
         if (arr[mid]<x){
             left=mid;
         }
         else if(arr[mid]>x){
             right=mid;
         }
         else return mid;
     }
     return  -1;
 }
}*/
 public class TestDemo{
     public static void main(String[] args) {
         int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         int[] array2 = copyArr(array1);
         System.out.println(Arrays.toString(array2));
     }
public static int[] copyArr(int[]array1) {
    int[] ret = new int[array1.length];
    for (int i = 0; i < array1.length; i++) {
        ret[i] = array1[i];
    }
    return ret;
     }
 }