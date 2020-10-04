package code717;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static LinkedList<Integer> list=new LinkedList<Integer>();

    public static void main(String[] args) {

        int n = 5;
        int m = 5;

        findSum(m,n);

    }

    public static void findSum(int sum,int n){

        //数组有序 m=0 n的范围是1-n所以 这种情况 直接不存在 打印空集合
        if(sum == 0 && n >= 0){
            myPrint();
            return;
        }

        //和是1 n>=1 因为1-n 所以把1放到集合里 打印出来后 再移除
        if(sum == 1 && n >= 1){
            list.push(1);
            myPrint();
            list.pop();
            return;
        }

        //最小元素就是1 sum的和>1 所以没有
        if(sum > 1 && n == 1 ){
            return;
        }

        if(sum >= n){
            //sum包含n的情况 剩下的集合中 计算出sum = sum-n的情况
            list.push(n);
            findSum(sum - n ,n-1);
            list.pop();

            //sum不包含n的情况 即sum > n
            findSum(sum ,n-1);
        }else{
            //sum < n的情况
            findSum(sum ,sum);
        }

        return;

    }

    public static void myPrint(){

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
