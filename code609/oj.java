package code609;



import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class oj {
   /* public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList();
        String[] str = sc.nextLine().split(" ");
        int k=0;
        for(int i = 0; i < str.length; i++ ){

            if (i==str.length-1){
                k=Integer.parseInt(str[i]);
            }else {
                list.add(Integer.parseInt(str[i]));
            }

    }
        Collections.sort(list);

        for (int i = 0; i <k ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }*/

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if (n>1000){
            n=999;
        }
        List <Integer> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(i);
        }
        int i=0;
        while (list.size()>1){
            i=(i+2)%list.size();
            list.remove(i);
        }
        System.out.print(list.get(0));
    }
}
