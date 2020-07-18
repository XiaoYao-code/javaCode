package code710;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public  static int calculateMax(int[] prices) {
        int len = prices.length;
        int[] dpl = new int[len];
        dpl[0] = 0;
        int minIndex = 0;//最小值的下标
        //从左到右，求收益最大值放入dpl中
        for(int i=1; i<len; i++){
            if(prices[i] > prices[i-1]){
                dpl[i] = Math.max(prices[i] - prices[minIndex], dpl[i-1]);//动态规划，利用前边的值填写后边的值
            }else{
                dpl[i] = dpl[i-1];
                if(prices[i] < prices[minIndex]){
                    minIndex = i;
                }
            }
        }

        //从右到左，求收益最大值
        int[] dpr = new int[len];
        dpr[len-1] = 0;//最左端的初始值赋值为0
        int maxIndex = len-1;//最大值的下标
        for(int i=len-2; i>=0; i--){
            if(prices[i] < prices[i+1]){
                dpr[i] = Math.max(prices[maxIndex] - prices[i], dpr[i+1]);
            }else {
                dpr[i] = dpr[i+1];
                if(prices[maxIndex] < prices[i]){
                    maxIndex  = i;
                }
            }
        }

        //根据输入dpl和dpr求解整个过程的最大值。
        //说白了，就是将一个数组分成两部分，然后求各部分的最大值，输出最大值。
        int result = 0;
        for(int i=0; i<len; i++){
            result = Math.max(dpl[i]+dpr[i], result);
        }

        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(calculateMax(arr));
       /* System.out.print(300);
        int sum=0;
        for (int i = 0; i <30 ; i++) {
            sum+=Math.pow(2,i);
        }
        System.out.print(sum);*/

    }
}
