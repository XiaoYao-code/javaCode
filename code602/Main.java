package code602;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void pop(int p){
        int x=0;//可以换得数量  也就是除3
        int y=0;//不够换得数量   也就是 模3
        int num=0;
   while (p>=3){
       x=p/3;
       num+=(p/3);
       y=p%3;
       p=x+y;
   }
   if (p==2)num++;
        System.out.println(num);
    }
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);

       while (sc.hasNextInt()){
          int s =sc.nextInt();
           pop(s);
       }
    }
    public static boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '(' || A.charAt(i) == ')') {
                if (A.charAt(i) == '(') {
                    stack.push(A.charAt(i));
                } else {
                    if (stack.empty()){
                        return false;
                    }
                    if (stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            } else {
                return false;
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String S="()))";
        int S1=S.length();
        System.out.println(chkParenthesis(S, S1));

    }
}
