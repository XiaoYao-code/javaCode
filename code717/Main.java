package code717;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[]arr=new int[length];
        for (int i = 0; i <length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSum(arr));
        //  System.out.println(Arrays.toString(arr));
    }

    private static int maxSum(int[] arr) {
        if (arr==null||arr.length==0) {
            return   -1;
        }
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (cursum<=0){
                cursum=arr[i];
            }else {
                cursum+=arr[i];
            }
            if (cursum>maxsum){
                maxsum=cursum;
            }
        }
        return maxsum;
    }
}
