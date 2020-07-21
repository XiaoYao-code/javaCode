package code720;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            juge(arr,arr[i],i);
            System.out.println();

        }

    }

    private static void juge(int[]arr,int i, int i1) {
        int left=i1-1;
        int right=i1+1;
        while (left>=0){
            if (arr[left]<i){
                System.out.print(left);
                break;
            }else {
                left--;
            }

        }
        if (left<0){
            System.out.print(-1);
        }

        System.out.print(" ");
        while (right<arr.length){
         if (arr[right]<i){
             System.out.print(right);
             break;
         }else {
             right++;
         }
        }
        if (right==arr.length){
            System.out.print(-1);
        }
    }
}
