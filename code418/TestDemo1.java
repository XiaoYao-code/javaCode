package code418;

import java.util.Arrays;

public class TestDemo1 {
    public static void swap(int[]array) {
        int left=0;
        int right=array.length-1;
        while (left<right){
            while (left<right&&array[left]%2==0) {
                left++;
            }
            while (left<right&&array[right]%2==1){
                right--;
            }
            int tmp=array[left];
            array[left]=array[right];
            array[right]=tmp;
        }
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
}

/*public class TestDemo1{
    public  static void swap(int[]array){

    }
    private static int x = 100;// 2
    public static void main(String args[]) {// 3
        TestDemo1 hsl = new TestDemo1();// 4
        hsl.x++;// 5
        TestDemo1 hs2 = new TestDemo1();// 6
        hs2.x++;// 7
        hsl = new TestDemo1();// 8
        hsl.x++;// 9
        TestDemo1.x--;// 10
        System.out.println(" x=" + x);// 11
    }*/
/*    public static void main(String[] args) {
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
    }*/
