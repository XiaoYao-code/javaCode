package code604;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//6个一袋子  8个一袋子  什么时候8个一袋子最多。
public class Oj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 6) {
            System.out.println(0);
        } else {
            for (int i = 12; i >= 0; i--) {
                for (int j = 0; j <= 15; j++) {
                    if (8 * i + 6 * j == n) {
                        int s = i + j;
                        System.out.println(s);
                        System.exit(0);
                    }
                }

            }
        }
    }
  public static void main1(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();

      StringBuffer stringBuffer=new StringBuffer();

      for (int i = 0; i <s1.length() ; i++) {
          if (!s2.contains(s1.charAt(i)+"")){
              stringBuffer.append(s1.charAt(i));
          }

      }
      System.out.println(stringBuffer);
  }
}

