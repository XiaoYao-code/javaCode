package code720;


import java.util.LinkedList;
import java.util.Scanner;



public class Main {
    public  static LinkedList<Integer> list=new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
while (sc.hasNext()) {
    int n = sc.nextInt();
    int m = sc.nextInt();
    sum(m, n);
}

    }

    private static void sum(int m, int n) {
        if (m==0&& n >= 0){
            print();
            return;
        }
        if (n==1&&m>1){
            return;
        }
        if (m==1&&n>=1){
            list.push(1);
            print();
            list.pop();
            return;
        }
        if (m>=n){
            list.push(n);
            sum(m-n,n-1);
            list.pop();

            sum(m,n-1);
        }else {
            sum(m,m);
        }
            return;

    }

    private static void print() {
        for (int i =list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

}
