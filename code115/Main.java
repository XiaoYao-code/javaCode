package code719;

import java.util.Scanner;

public class Main {
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            System.out.println(sumday(year, month, day));
        }
    }

    private static int sumday(int year, int month, int day) {
        int[]mon=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        if (year%400==0||(year%100!=0&&year%4==0)){
            mon[1]=29;
        }
        int sum=0;
        if (month<=12&&month>=1&&day<=mon[month-1]){
            for (int i = 0; i <month-1 ; i++) {
                sum+=mon[i];
            }
            sum+=day;
            return sum;
        }
        return -1;
    }

    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            System.out.println(encryption(s1));
            System.out.println(deciphering(s2));
        }
    }

    private static String deciphering(String s2) {
        StringBuffer str=new StringBuffer();
        for (int i = 0; i <s2.length() ; i++) {

        }
        return str.toString();
    }

    private static String encryption(String s1) {
        StringBuffer str=new StringBuffer();
        for (int i = 0; i <s1.length() ; i++) {
            char s=s1.charAt(i);
            if (s<='9'&&s>='0'){
                s++;
                String s2 = Integer.toString(s);
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            encrypt(s1);
            unEncrypt(s2);
        }
    }
    public static void encrypt(String s){
        StringBuffer str = new StringBuffer();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>=97){
                str.append((char)((s.charAt(i)-97+1) %26+65));
            }else if(s.charAt(i)>=65){
                str.append((char)((s.charAt(i)-65+1) %26+97));
            } else{
                str.append((char)((s.charAt(i)-48+1) %10+48));
            }
        }
        System.out.println(str);
    }
    public static void unEncrypt(String s){
        StringBuffer str = new StringBuffer();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>=97){
                if(s.charAt(i)=='a'){
                    str.append('Z');
                }else{
                    str.append((char)((s.charAt(i)-97-1) %26+65));
                }
            } else if(s.charAt(i)>=65){
                if(s.charAt(i)=='A'){
                    str.append('z');
                }else{
                    str.append((char)((s.charAt(i)-65-1) %26+97));
                }
            }else{
                if(s.charAt(i) == '0'){
                    str.append('9');
                }else{
                    str.append((char)((s.charAt(i)-48-1) %10+48));
                }
            }
        }
        System.out.println(str);
    }




}
