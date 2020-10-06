package code722;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            String[]str=new String[2];
            str=sc.nextLine().split(" ");
            int[]arrA=new int[26];
            int[]arrB=new int[26];
            for (int i = 0; i <str[0].length() ; i++) {
                arrA[str[0].charAt(i)-'A']++;
            }
            for (int i = 0; i <str[1].length() ; i++) {
                arrB[str[1].charAt(i)-'A']++;
            }
            boolean flag=true;
            for (int i = 0; i <26 ; i++) {
                if (arrA[i]<arrB[i]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }
    public static void main2(String[] args) {
        int a=1;
        int b=1;
        Integer a1=-128;
        Integer b1=-128;
        System.out.println(a==b);
        System.out.println(a1==b1);
        System.out.println(a==a1);
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            Map<Character,Integer>map=new HashMap<>();
            String[]str=new String[2];
            str=sc.nextLine().split(" ");
            /*System.out.println(str[0]);
            System.out.println(str[1]);*/
            String searh = searh(str, map);
            System.out.println(searh);
        }

    }


    private static String searh(String[] str,Map<Character,Integer> map) {
        for (int i = 0; i <str[0].length() ; i++) {
            if (map.containsKey(str[0].charAt(i))){
                map.put(str[0].charAt(i),map.get(str[0].charAt(i))+1);
            }else {
                map.put(str[0].charAt(i),1);
            }
        }
        for (int i = 0; i <str[1].length() ; i++) {
            if (map.containsKey(str[1].charAt(i))){
                map.put(str[1].charAt(i),map.get(str[1].charAt(i))-1);
            }else {
                return "No";
            }
        }
        for (int i = 0; i <str[0].length() ; i++) {

            if (map.get(str[0].charAt(i))<0){
              //  System.out.println(map.get(str[0].charAt(i)));
                return "No";
            }
        }
        return "Yes";
    }
}
